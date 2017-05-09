package handlingMultipleBrowsers;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * There are basically two commands that we can use to close the opened browser windows. 
 * – WebDriver.close() – WebDriver.quit() WebDriver.Close() command will close the current window on which the focus is present. 
 * This can be used to close windows selectively. 
 * Just switch to the window that you want to close by using the correct Window handle and the call the WebDriver.close command. 
 * That will close the current browser window. 
 * Note: After closing a window you have to explicitly switch to another valid window before sending in any WebDriver commands. 
 * if you fail to do this you will get following exception. org.openqa.selenium.NoSuchWindowException: Window not found. 
 * The browser window may have been closed.   
 * In the code below we will close the parent window and then explicitly move focus to the last window in the list.
 */

public class ClosingAllWindows {

	public static void main(String[] args) throws InterruptedException {

		// Create a new instance of the Chrome driver
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");
		String parentWindowHandle = driver.getWindowHandle();
		System.out.println("Parent window's handle -> : " + parentWindowHandle);
		WebElement clickElement = driver.findElement(By.id("button1"));

		for (int i = 0; i < 3; i++) {
			clickElement.click();
			Thread.sleep(300);
		}
		Set<String> allWindowHandles = driver.getWindowHandles();
		String lastWindowHandle = "";
		for (String handle : allWindowHandles) {
			System.out.println("Switching to window -> : " + handle);
			System.out.println("Navigating to google.com");
			// Switch to the desired window first and then execute commands
			// using driver
			driver.switchTo().window(handle);
			driver.get("http://google.com");
			lastWindowHandle = handle;
		}

		// Switch to the parent window
		driver.switchTo().window(parentWindowHandle);
		// close the parent window
		driver.close();
		// at this point there is no focused window, we have to explicitly
		// switch back to some window
		driver.switchTo().window(lastWindowHandle);
		driver.get("http://toolsqa.wengine.com");

	}

}
