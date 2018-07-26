package commands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
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
}
