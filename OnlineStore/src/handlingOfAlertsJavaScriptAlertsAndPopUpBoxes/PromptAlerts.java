package handlingOfAlertsJavaScriptAlertsAndPopUpBoxes;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * In prompt alerts you get an option to add text to the alert box. 
 * This is specifically used when some input is required from the user. 
 * We will use the sendKeys() method to type something in the Prompt alert box. Here is the code
 */

public class PromptAlerts {

	public static void main(String[] args) throws InterruptedException {

		// Create a new instance of the Chrome driver
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Launch the URL
		driver.get("http://toolsqa.wpengine.com/handling-alerts-using-selenium-webdriver/");

		// Maximize the window
		driver.manage().window().maximize();

		// This step will result in an alert on screen
		WebElement element = driver.findElement(By.xpath("//*[@id='content']/p[11]/button"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);

		Alert promptAlert = driver.switchTo().alert();
		String alertText = promptAlert.getText();
		System.out.println("Alert text is: " + alertText);

		// Send some text to the alert
		promptAlert.sendKeys("Accepting the alert");

		// This sleep is not necessary, just for demonstration
		Thread.sleep(4000);
		promptAlert.accept();

	}

}
