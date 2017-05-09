package switchCommands;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * 	1) Launch new Browser
	2) Open URL “http://toolsqa.wpengine.com/automation-practice-switch-windows/”
	3) Get Window name (Use GetWindowHandle command)
	4) Click on Button “New Message Window”, it will open a Pop Up Window
	5) Get all the Windows name ( Use GetWindowHandles command)
	6) Close the Pop Up Window (Use Switch Command to shift window)
 */

public class Exercise1 {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		
		// Create a new instance of the Chrome driver
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	

		// Put an Implicit wait, this means that any search for elements on the
		// page could take the time the implicit wait is set for before throwing
		// exception
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Launch the URL
		driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");

		// Store and Print the name of the First window on the console
		String handle = driver.getWindowHandle();

		System.out.println(handle);

		// Click on the Button "New Message Window"
		driver.findElement(By.name("New Message Window")).click();

		// Store and Print the name of all the windows open
		Set handles = driver.getWindowHandles();

		System.out.println(handles);

		// Pass a window handle to the other window
		for (String handle1 : driver.getWindowHandles()) {

			System.out.println(handle1);

			driver.switchTo().window(handle1);

		}

		// Closing Pop Up window
		driver.close();

		// Close Original window
		driver.quit();

	}

}
