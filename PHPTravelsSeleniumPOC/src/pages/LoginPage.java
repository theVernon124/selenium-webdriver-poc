package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	//	Elements
	private static WebElement element = null;
	public static WebElement emailField(WebDriver driver) {
		element = driver.findElement(By.cssSelector("#loginfrm > div.panel.panel-default > div.wow.fadeIn.animated > div > div:nth-child(1) > input"));
		return element;
	}
	public static WebElement passwordField(WebDriver driver) {
		element = driver.findElement(By.cssSelector("#loginfrm > div.panel.panel-default > div.wow.fadeIn.animated > div > div:nth-child(2) > input"));
		return element;
	}
	public static WebElement loginBtn(WebDriver driver) {
		element = driver.findElement(By.cssSelector("#loginfrm > div.panel.panel-default > div.wow.fadeIn.animated > button"));
		return element;
	}
	public static WebElement spiel(WebDriver driver) {
		element = driver.findElement(By.cssSelector("#loginfrm > div.panel.panel-default > div.resultlogin > div"));
		return element;
	}
	//	Commands
	public static void loginUser(WebDriver driver, String email, String password) {
		emailField(driver)
			.sendKeys(email);
		passwordField(driver)
			.sendKeys(password);
		loginBtn(driver)
			.click();
	}
}
