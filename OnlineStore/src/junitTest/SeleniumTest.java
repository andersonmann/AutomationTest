package junitTest;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
	
	static String browser = "webdriver.chrome.driver";
	static String path = "C:\\Program Files\\Java\\chrome\\chromedriver.exe";
	WebElement element;
	
	WebDriver driver;

	@BeforeClass
	public static void openBrowser() {
		System.setProperty(browser, path);
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void valid_UserCredential() {
		System.setProperty(browser, path);
		WebDriver driver = new ChromeDriver();

		System.out.println("Starting test " + new Object() {
		}.getClass().getEnclosingMethod().getName());
		driver.get("http://www.store.demoqa.com");
		driver.findElement(By.xpath(".//*[@id='account']/a")).click();
		driver.findElement(By.id("log")).sendKeys("testuser_3");
		driver.findElement(By.id("pwd")).sendKeys("Test@123");
		driver.findElement(By.id("login")).click();
		try {
			element = driver.findElement(By.xpath(".//*[@id='account_logout']/a"));
		} catch (Exception e) {

		}
		Assert.assertNotNull(element);
		System.out.println("Ending test " + new Object() {
		}.getClass().getEnclosingMethod().getName());

	}

	@AfterClass
	public static void closeBrowser() {
		System.setProperty("browser", "path");
		WebDriver driver = new ChromeDriver();
		driver.quit();
	}

}
