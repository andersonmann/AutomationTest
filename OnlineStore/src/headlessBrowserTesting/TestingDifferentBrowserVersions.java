package headlessBrowserTesting;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import com.gargoylesoftware.htmlunit.BrowserVersion;

public class TestingDifferentBrowserVersions {

	public static void main(String[] args) {

		// Declaring and initialising the HtmlUnitWebDriver
		HtmlUnitDriver unitDriver = new HtmlUnitDriver(BrowserVersion.CHROME);
		unitDriver.setJavascriptEnabled(true);
		unitDriver.get("http://google.com");
		String domainName = (String) unitDriver.executeScript("return document.domain");
		System.out.println("Domain name is " + domainName);
	}

}
