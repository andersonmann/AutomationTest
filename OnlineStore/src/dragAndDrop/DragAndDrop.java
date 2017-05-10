package dragAndDrop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

/*
 * Example 1: In this example we will drag the Thriller folder from the left table on to the Bestsellers folder of the right side table.
 */

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.dhtmlx.com/docs/products/dhtmlxTree/index.shtml");

		// It is always advisable to Maximize the window before performing
		// DragNDrop action
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement From = driver.findElement(By.xpath(
				".//*[@id='treebox1']/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[4]/span"));

		WebElement To = driver.findElement(By.xpath(
				".//*[@id='treebox2']/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[4]/span"));

		Actions builder = new Actions(driver);
		Action dragAndDrop = builder.clickAndHold(From).moveToElement(To).build();
		dragAndDrop.perform();
		Thread.sleep(5000);
		driver.close();
	}

}
