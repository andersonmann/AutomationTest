package webDriverBrowserCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * 	Launch a new Firefox browser.
	Open Store.DemoQA.com
	Get Page Title name and Title length
	Print Page Title and Title length on the Eclipse Console.
	Get Page URL and verify if the it is a correct page opened
	Get Page Source (HTML Source code) and Page Source length
	Print Page Length on Eclipse Console.
	Close the Browser.
 */

public class Exercise1 {

	public static void main(String[] args) {

		// Create a new instance of the Chrome driver
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Storing the Application Url in the String variable
		String url = "http://www.store.demoqa.com";

		// Launch the ToolsQA Website
		driver.get(url);

		// Storing Title namo in the String variable
		String title = driver.getTitle();

		// Storing Title lenght in the Int variable
		int titleLenght = driver.getTitle().length();

		// Printing Title & Title length in the Console window
		System.out.println("Title of the page is: " + title);
		System.out.println("Length of the title is: " + titleLenght);

		// Storing URL in String variable
		String actualURL = driver.getCurrentUrl();

		if (actualURL.equals(url)) {
			System.out.println("Verification Succesful - The corretc Url is opened.");
		} else {
			System.out.println("Verification Failed - An incorrect Url is opened.");
			// In case of Fail, you like to print the actual and expected URL
			// for the record purpose
			System.out.println("Actual URL is: " + actualURL);
			System.out.println("Expected URL is: " + url);
		}

		// Storing Page Source in String variable
		String pageSource = driver.getPageSource();

		// Storing Page Source length in the Int variable
		int pageSourceLenght = pageSource.length();

		// Printing lenght of the Page Source on console
		System.out.println("Total length of the Page Source is: " + pageSourceLenght);

		// Closing browser
		driver.close();
	}
//teste
}
