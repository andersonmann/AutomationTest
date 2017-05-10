package findAllLinksOnWebpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindAllLinks3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://toolsqa.wpengine.com/");

		java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for (int i = 1; i <= links.size(); i = i + 1) {
			System.out.println(links.get(i).getText());
		}
	}
}

/*
 * The same way you can easily be able to find any type of WebElements on a
 * WebPage: Find total number of Checkboxes on a Webpage :
 * 
 * java.util.List&lt;WebElement&gt; checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
 * System.out.println(checkboxes.size());
 * 
 */

/*
 * Find total number of Menus on a Webpage
 * 
 * java.util.List;WebElement&gt; dropdown = driver.findElements(By.tagName("select"));
 * System.out.println(dropdown.size());
 */

/*
 * Find total number of TextBoxes on a Webpage :
 * 
 * java.util.List;WebElement&gt; textboxes = driver.findElements(By.xpath("//input[@type='text'[@class='inputtext']"));
 * System.out.println(textboxes.size());
 * 
 * 
 */