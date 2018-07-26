package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountPage {
	//	Elements
	private static WebElement element = null;
	public static WebElement userGreetingHeader(WebDriver driver) {
		element = driver.findElement(By.cssSelector("#body-section > div > div.row > div > div.col-md-6.go-right.RTL > h3"));
		return element;
	}
}
