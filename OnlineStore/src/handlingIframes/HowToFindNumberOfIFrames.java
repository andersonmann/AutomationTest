package handlingIframes;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * There are two ways to find total number of iFrames in a web page. 
 * First by executing a JavaScript and second is by finding total number of web elements with a tag name of iFrame. 
 * Here is the code using both these methods:
 */

public class HowToFindNumberOfIFrames {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://toolsqa.wpengine.com/iframe-practice-page/");

		// By executing a java script
		JavascriptExecutor exe = (JavascriptExecutor) driver;
		Integer numberOfFrames = Integer.parseInt(exe.executeScript("return window.length").toString());
		System.out.println("Number if iframes on the page are: " + numberOfFrames);

		// By finding all the web elements using iframe tag
		java.util.List<WebElement> iframeElements = driver.findElements(By.tagName("iframe"));
		System.out.println("The total of iframes are: " + iframeElements.size());

	}

}
