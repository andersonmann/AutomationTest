package handlingIframes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToFramesBy {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://toolsqa.wpengine.com/iframe-practice-page/");

		// switch by frame Index
		// driver.switchTo().frame(0);
		// driver.quit();

		// Switch by frame name
		// driver.switchTo().frame("iframe1");
		// driver.quit();

		 // Switch by frame ID
		 driver.switchTo().frame("IF1");
		 driver.quit();

		
		// Switch to Frame by WebElement
		/*
		 * driver.get("http://toolsqa.wpengine.com/iframe-practice-page/");
		 * //First find the element using any of locator stratedgy WebElement
		 * iframeElement = driver.findElement(By.id("IF1")); //now use the
		 * switch command driver.switchTo().frame(iframeElement); driver.quit();
		 */

	}

}
