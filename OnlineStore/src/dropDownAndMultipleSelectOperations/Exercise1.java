package dropDownAndMultipleSelectOperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*
 * 	Launch new Browser
	Open “http://toolsqa.wpengine.com/automation-practice-form/”
	Select ‘Continents’ Drop down ( Use Id to identify the element )
	Select option ‘Europe’ (Use selectByIndex)
	Select option ‘Africa’ now (Use selectByVisibleText)
	Print all the options for the selected drop down and select one option of your choice
	Close the browser
 */

public class Exercise1 {

	public static void main(String[] args) throws InterruptedException {

		// Create a new instance of the Chrome driver
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Put an Implicit wait,
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Launch the URL
		driver.get("http://toolsqa.wpengine.com/automation-practice-form");

		// Step 3: Select 'Continents' Drop down ( Use Id to identify the
		// element )
		// Find Select element of "Single selection" using ID locator.
		Select oSelect = new Select(driver.findElement(By.id("continents")));

		// Step 4:) Select option 'Europe' (Use selectByVisibleText)
		oSelect.selectByVisibleText("Europe");

		// Using sleep command so that changes can be noticed
		Thread.sleep(3000);

		// Step 5: Select option 'Africa' (Use selectByIndex)
		oSelect.selectByIndex(2);
		Thread.sleep(3000);

		// Step 6: Print all the options for the selected drop down and select
		// one option of your choice
		// Get the size of the Select element
		java.util.List<WebElement> oSize = oSelect.getOptions();
		int iListSize = oSize.size();

		// Setting up the loop to print all the options
		for (int i = 0; i < iListSize; i++) {
			// Storing the value of the option
			String sValue = oSelect.getOptions().get(i).getText();
			// Printing the stored value
			System.out.println(sValue);
			// Putting a check on each option that if any of the option is equal
			// to 'Africa" then select it
			if (sValue.equals("Antartica")) {
				oSelect.selectByIndex(i);
				break;
			}
		}

		Thread.sleep(3000);

		// Kill the browser
		driver.quit();
	}

}
