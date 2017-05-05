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
	Select ‘Selenium Commands’ Multiple selection box ( Use Name locator to identify the element )
	Select option ‘Browser Commands’  and then deselect it (Use selectByIndex and deselectByIndex)
	Select option ‘Navigation Commands’  and then deselect it (Use selectByVisibleText and deselectByVisibleText)
	Print and select all the options for the selected Multiple selection list.
	Deselect all options
	Close the browser
 */

public class Exercise2 {

	public static void main(String[] args) throws InterruptedException {
		
		// Create a new instance of the Chrome driver
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Put an implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Launch the URL
		driver.get("http://toolsqa.wpengine.com/automation-practice-form");
		
		// Step 3: Select 'Selenium Commands' Multiple select box ( Use Name locator to identify the element )
		Select oSelect = new Select(driver.findElement(By.name("selenium_commands")));
		
		// Step 4: Select option 'Browser Commands' and then deselect it (Use selectByIndex and deselectByIndex)
		oSelect.selectByIndex(0);
		Thread.sleep(3000);
		oSelect.deselectByIndex(0);
		
		// Step 5: Select option 'Navigation Commands'  and then deselect it (Use selectByVisibleText and deselectByVisibleText)
		oSelect.selectByVisibleText("Navigation Commands");
		Thread.sleep(3000);
		oSelect.deselectByVisibleText("Navigation Commands");
		
		// Step 6: Print and select all the options for the selected Multiple selection list.
		java.util.List<WebElement> oSize = oSelect.getOptions();
		int iListSize = oSize.size();
		
		//Setting up the loop to print all the options
		for (int i = 0; i <iListSize; i++) {
			//Storing the value of the position 
			String sValue = oSelect.getOptions().get(i).getText();
			
			//Printing the stored value
			System.out.println(sValue);
			
			//Selecting all the elements one by one
			oSelect.selectByIndex(i);
			Thread.sleep(3000);
			}
		// Step 7: Deselect all
		oSelect.deselectAll();
		
		//Kill the browser
		driver.quit();
	}

}
