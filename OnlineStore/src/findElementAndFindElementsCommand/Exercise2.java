package findElementAndFindElementsCommand;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * 	Launch new Browser
	Open URL http://toolsqa.wpengine.com/automation-practice-form/
	Click on the Link “Partial Link Test” (Use ‘patialLinkTest’ locator and search by ‘Partial’ word)
	Identify Submit button with ‘tagName’, convert it in to string and print it on the console
	Click on the Link “Link Test” (Use ‘linkTest’ locator)
 */

public class Exercise2 {

	public static void main(String[] args) {

		// Create a new instance of the Chrome driver
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Launch the Online Store WebSite
		driver.get("http://toolsqa.wpengine.com/Automation-practice-form/");

		// Click on "Partial Link Text" link
		driver.findElement(By.partialLinkText("Partial")).click();
		System.out.println("Partial Link Pass");

		// Convert element in to a string
		String sClass = driver.findElements(By.tagName("button")).toString();
		System.out.println(sClass);

		// Click on "Link Text" link
		driver.findElement(By.linkText("Link Test")).click();
		System.out.println("Link Test Pass");
	}

}
