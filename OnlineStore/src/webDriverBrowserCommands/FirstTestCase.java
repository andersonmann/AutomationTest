package webDriverBrowserCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Launch the Online Store Website
		driver.get("http://store.demoqa.com");

		// Print a Log In message to screen
		System.out.println("Successfuly opened the website www.Store.Demoqa.com");

		// Wait for 5 sec
		Thread.sleep(5000);

		// Close the driver
		driver.quit();

	}

}
