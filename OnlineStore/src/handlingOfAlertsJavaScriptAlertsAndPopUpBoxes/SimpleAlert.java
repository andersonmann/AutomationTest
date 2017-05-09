package handlingOfAlertsJavaScriptAlertsAndPopUpBoxes;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Simple alerts just have a OK button on them. 
 * They are mainly used to display some information to the user. 
 * The first alert on our test page is a simple alert. 
 * Following code will read the text from the Alert and then accept the alert. 
 * Important point to note is that we can switch from main window to an alert using the driver.switchTo().alert(). 
 * Below is the usage of that also:
 */

public class SimpleAlert {

	public static void main(String[] args) throws InterruptedException {

		// Create a new instance of the Chrome driver
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Launch the URL
		driver.get("http://toolsqa.wpengine.com/handling-alerts-using-selenium-webdriver/");
		driver.manage().window().maximize();
		// This step will result in an alert on screen
		driver.findElement(By.xpath("//*[@id='content']/p[4]/button")).click();

		Alert simpleAlert = driver.switchTo().alert();
		String alertText = simpleAlert.getText();
		System.out.println("Alert text is " + alertText);

		// This sleep is not necessary, just for demonstration
		Thread.sleep(4000);

		simpleAlert.accept();
		driver.quit();
	}
}
