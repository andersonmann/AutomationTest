package browserNavigationCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * 	Launch new Browser
	Open DemoQA.com website
	Click on Registration link using “driver.findElement(By.xpath(“.//*[@id=’menu-item-374′]/a”)).click();“
	Come back to Home page (Use ‘Back’ command)
	Again go back to Registration page (This time use ‘Forward’ command)
	Again come back to Home page (This time use ‘To’ command)
	Refresh the Browser (Use ‘Refresh’ command)
	Close the Browser
 */

public class Exercise {

	public static void main(String[] args) throws InterruptedException {

		// Create a new instance of the Chrome driver
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Open ToolsQA website
		String appUrl = "http://www.DemoQA.com";
		driver.get(appUrl);

		// Click on Registration link
		driver.findElement(By.xpath(".//*[@id='menu-item-374']/a")).click();
		// Wait for 5 sec
		Thread.sleep(5000);

		// Go back to Home Page
		driver.navigate().back();
		// Wait for 5 sec
		Thread.sleep(5000);

		// Go forward to Registration page
		driver.navigate().forward();
		// Wait for 5 sec
		Thread.sleep(5000);

		// Go back to Home page
		driver.navigate().to(appUrl);
		// Wait for 5 sec
		Thread.sleep(5000);

		// Refresh browser
		driver.navigate().refresh();

		// Close browser
		driver.close();

	}

}
