package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HeaderMenu {
	//	Elements
	private static WebElement element = null;
	public static WebElement myAccountMenu(WebDriver driver) {
		element = driver.findElement(By.cssSelector("ul.navbar-side:nth-child(1) > li:nth-child(1) > a:nth-child(1)"));
		return element;
	}
	public static WebElement loginSubmenu(WebDriver driver) {
		element = driver.findElement(By.cssSelector(".open > ul:nth-child(2) > li:nth-child(1) > a:nth-child(1)"));
		return element;
	}
	public static WebElement userAccountMenu(WebDriver driver) {
		element = driver.findElement(By.cssSelector("#collapse > ul.nav.navbar-nav.navbar-right > ul > li:nth-child(1) > a"));
		return element;
	}
	public static WebElement logoutSubmenu(WebDriver driver) {
		element = driver.findElement(By.cssSelector("#collapse > ul.nav.navbar-nav.navbar-right > ul > li.open > ul > li:nth-child(2) > a"));
		return element;
	}
	public static WebElement signUpSubmenu(WebDriver driver) {
		element = driver.findElement(By.cssSelector("#li_myaccount > ul > li:nth-child(2) > a"));
		return element;
	}
}
