package commands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CustomCommands {
	public static WebDriver setupFirefoxDriver() {
		System.setProperty("webdriver.gecko.driver", "/Users/vernon.cenzon/Documents/geckodriver/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.manage()
			.timeouts()
			.implicitlyWait(15, TimeUnit.SECONDS);
		return driver;
	}
	public static WebElement setValue(WebElement element, String elementName, String value) {
		System.out.println("Setting " + elementName + " value to " + value);
		element.sendKeys(value);
		return element;
	}
}
