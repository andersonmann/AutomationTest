package handlingMultipleBrowsers;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * There is a concept of current focused window which means that all selenium webdriver commands will go to the focused window. 
 * By default the focus is always on the Parent window, please see the screenshot above. 
 * In order to shift focus from Parent Window to any child window we have to use the following command on WebDriver – 
 * WebDriver.SwitchTo().window(String windowHandle); This command takes in a window handle and switches the driver context on that window. 
 * Once the Switch happens all the driver commands will go to the newly focused window. 
 * This is very important to understand, without switching to the desired window we will not be able to perform any action on that window. 
 * Now lets see some code which iteratively moves across all the open windows and navigates to a particular page in all the open windows one by one.
 */

public class HandlingMultipleWindows {

	public static void main(String[] args) throws InterruptedException {

		// Create a new instance of the Chrome driver
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");
		String parentWindowHandle = driver.getWindowHandle();
		System.out.println("Parent window's handle -> " + parentWindowHandle);
		WebElement clickElement = driver.findElement(By.id("button1"));

		for (int i = 0; i < 3; i++) {
			clickElement.click();
			Thread.sleep(3000);
		}
		Set<String> allWindowHandles = driver.getWindowHandles();

		for (String handle : allWindowHandles) {
			System.out.println("Switching to window -> " + handle);
			System.out.println("Navigating to google.com");
			// Switch to the desired window first and then execute commands
			// using driver
			driver.switchTo().window(handle);
			driver.get("http://google.com");
		}
	}

}
