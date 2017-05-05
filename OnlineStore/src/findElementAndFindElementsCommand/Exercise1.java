package findElementAndFindElementsCommand;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/*
 * 	Launch new Browser
	Open URL http://toolsqa.wpengine.com/automation-practice-form/
	Type Name & Last Name (Use Name locator)
	Click on Submit button (Use ID locator)
 */

public class Exercise1 {

	public static void main(String[] args) {

		// Create a new instance of the Chrome driver
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Launch the ToolsQA WebSite
		driver.get("http://toolsqa.wpengine.com/Automation-practice-form/");

		// Type Name in the FirstName text box
		driver.findElement(By.name("firstname")).sendKeys("Anderson");

		// Type LastName in the LastName text box
		driver.findElement(By.name("lastname")).sendKeys("Mann");

		// Click on the Submit button
		driver.findElement(By.id("submit")).click();
	}

}
