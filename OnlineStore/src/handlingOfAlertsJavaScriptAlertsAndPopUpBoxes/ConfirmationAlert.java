package handlingOfAlertsJavaScriptAlertsAndPopUpBoxes;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * This alert comes with an option to accept or dismiss the alert. 
 * To accept the alert you can use Alert.accept() and to dismiss you can use the Alert.dismiss(). 
 * Here is the code to dismiss a prompt alert.
 */

public class ConfirmationAlert {

	public static void main(String[] args) throws InterruptedException {
		// Create a new instance of the Chrome driver
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://toolsqa.wpengine.com/handling-alerts-using-selenium-webdriver/");
		driver.manage().window().maximize();

		// This step will result in an alert on the screen
		WebElement element = driver.findElement(By.xpath("//*[@id='content']/p[8]/button"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);

		Alert confirmationAlert = driver.switchTo().alert();
		String alertText = confirmationAlert.getText();
		System.out.println("Alert text is " + alertText);

		// This sleep is not necessary, just for demonstration
		Thread.sleep(4000);

		confirmationAlert.accept();
		// confirmationAlert.dismiss();

		driver.quit();

	}

}
