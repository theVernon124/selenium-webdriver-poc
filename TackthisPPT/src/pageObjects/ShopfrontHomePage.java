package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import commands.CustomCommands;

public class ShopfrontHomePage extends CustomCommands{
	//	Elements
	private static WebElement element = null;
	public static WebElement loginLink(WebDriver driver) {
		element = driver.findElement(By.cssSelector("body > div.container-fluid.ng-scope > div > div:nth-child(1) > div.top-header-container.ng-scope > div > div > div.col-lg-4.col-md-4.col-sm-12.col-xs-12 > shop-user-control > div > ul > li.ng-scope > a"));
		return element;
	}
	public static WebElement allLink(WebDriver driver) {
		element = driver.findElement(By.cssSelector("#category-menu > ul > li:nth-child(1) > a:nth-child(1)"));
		return element;
	}
	public static WebElement searchField(WebDriver driver) {
		element = driver.findElement(By.cssSelector("body > div.container-fluid.ng-scope > div > div:nth-child(1) > header > div > div:nth-child(1) > div > div.product-search > product > form > div > input"));
		return element;
	}
	public static WebElement searchBtn(WebDriver driver) {
		element = driver.findElement(By.cssSelector("body > div.container-fluid.ng-scope > div > div:nth-child(1) > header > div > div:nth-child(1) > div > div.product-search > product > form > div > span > button"));
		return element;
	}
	public static WebElement productLink(WebDriver driver) {
		element = driver.findElement(By.cssSelector("body > div.container-fluid.ng-scope > div > div.main > ui-view > div > div > div > div > div.category-holder > div > div > div > shop-product-list > div > div > div > div > div.product-name.shop-product-name > a"));
		return element;
	}
	public static WebElement cartLink(WebDriver driver) {
		element = driver.findElement(By.cssSelector("body > div.container-fluid.ng-scope > div > div:nth-child(1) > div.top-header-container.ng-scope > div > div > div.col-lg-4.col-md-4.col-sm-12.col-xs-12 > shop-user-control > div > ul > li:nth-child(2) > a"));
		return element;
	}
	//	Commands
	public static void performSearch(WebDriver driver, String searchTerm) {
		setValue(searchField(driver), "Search field", searchTerm);
		searchBtn(driver).click();
	}
}
