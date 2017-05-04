package webDriverBrowserCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * 	Launch a new Firefox browser.
	Open http://demoqa.com/frames-and-windows/
	Use this statement to click on a New Window button “driver.findElement(By.xpath(“.//*[@id=’tabs-1′]/div/p/a�?)).click();�?
	Close the browser using close() command
 */

public class Exercise2 {

	public static void main(String[] args) throws InterruptedException {

		// Create a new instance of the Chrome driver
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://demoqa.com/frames-and-windows/");

		driver.findElement(By.xpath(".//*[@id='tabs-1']/div/p/a")).click();
		
		// Wait for 5 sec
		Thread.sleep(5000);
		driver.close();
		//driver.quit();

	}

}
