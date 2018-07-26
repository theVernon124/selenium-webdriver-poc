package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PropertyInfoPage {
	//	Elements
	private static WebElement element = null;
	public static WebElement propertyInfoHeader(WebDriver driver) {
		return element = driver.findElement(By.cssSelector("#headerTitle"));
	}
}
