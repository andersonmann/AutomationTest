package headlessBrowserTesting;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class JavaScriptSupport {

	public static void main(String[] args) {
				
		// Declaring and initialising the HtmlUnitWebDriver
		HtmlUnitDriver unitDriver = new HtmlUnitDriver();
		unitDriver.setJavascriptEnabled(true);
		unitDriver.get("http://google.com");
		String domainName = (String) unitDriver.executeScript("return document.domain");
		System.out.println("Domain name is " + domainName);

	}

}
