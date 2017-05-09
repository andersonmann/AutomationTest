package handlingIframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * There is one very important command that will help us to get back to the main page. 
 * Main page is the page in which two iFrames are embedded. 
 * Once you are done with all the task in a particular iFrame you can switch back to the main page using the switchTo().defaultContent(). 
 * Here is the sample code which switches the driver back to main page.
 */

public class SwitchingBackToMainPageFromFrame {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://toolsqa.wpengine.com/iframe-practice-page/");

		// First find the element using any of locator strategy
		WebElement iframeElement = driver.findElement(By.id("IF1"));

		// now use the switch command
		driver.switchTo().frame(0);

		// Do all the required tasks in the frame 0
		// Switch back to the main window
		driver.switchTo().defaultContent();
		driver.quit();

	}
}
