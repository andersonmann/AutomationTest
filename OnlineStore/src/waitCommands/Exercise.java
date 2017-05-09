package waitCommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/*
 * 	1) Launch new Browser
	2) Open URL “http://toolsqa.wpengine.com/automation-practice-switch-windows/”
	3) Click on the Button “Timing Alert”
	4) Accept the Alert (Alert will take 3 second to get displayed, Use WebDriverWait to wait for it)
 */

public class Exercise {

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

		// Click on the Button "Timing Alert"
		driver.findElement(By.name("Timing Alert")).click();

		System.out.println("Timer JavaScript Alert is triggered but it is not yet opened");

		// Create new WebDriver wait
		WebDriverWait wait = new WebDriverWait(driver, 10);

		// Wait for Alert to be present
		Alert myAlert = wait.until(ExpectedConditions.alertIsPresent());

		System.out.println("Either Pop Up is displayed or it is Timed Out");

		// Accept the Alert
		myAlert.accept();

		System.out.println("Alert Accepted");

		// Close the main window
		driver.close();
	}

}
