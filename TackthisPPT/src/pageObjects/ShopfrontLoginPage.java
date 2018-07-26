package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import commands.CustomCommands;

public class ShopfrontLoginPage extends CustomCommands{
	//	Elements
	private static WebElement element = null;
	public static WebElement emailAddressField(WebDriver driver) {
		element = driver.findElement(By.cssSelector("body > div.container-fluid.ng-scope > div > div.main > ui-view > div > div > div.panel-left.col-md-6.col-xs-12 > form > div:nth-child(2) > input"));
		return element;
	}
	public static WebElement passwordField(WebDriver driver) {
		element = driver.findElement(By.cssSelector("body > div.container-fluid.ng-scope > div > div.main > ui-view > div > div > div.panel-left.col-md-6.col-xs-12 > form > div:nth-child(3) > input"));
		return element;
	}
	public static WebElement submitBtn(WebDriver driver) {
		element = driver.findElement(By.cssSelector("body > div.container-fluid.ng-scope > div > div.main > ui-view > div > div > div.panel-left.col-md-6.col-xs-12 > form > div:nth-child(6) > button"));
		return element;
	}
	//	Commands
	public static void performLogin(WebDriver driver, String emailAddress, String password) {
		setValue(emailAddressField(driver), "Email Address field", emailAddress);
		setValue(passwordField(driver), "Password field", password);
		submitBtn(driver).click();
	}
}
