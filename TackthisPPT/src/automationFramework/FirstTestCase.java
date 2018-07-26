package automationFramework;

import org.openqa.selenium.WebDriver;

import commands.CustomCommands;
import data.Strings;
import pageObjects.ProductDetailPage;
import pageObjects.ShopfrontHomePage;
import pageObjects.ShopfrontLoginPage;

public class FirstTestCase extends CustomCommands{
	public static void main(String[] args) {
		WebDriver driver = setupFirefoxDriver();
		driver.get("https://tackthis.co/shop/38271");
		ShopfrontHomePage.loginLink(driver)
			.click();
		ShopfrontLoginPage.performLogin(driver, Strings.customerEmail, Strings.customerPassword);
		ShopfrontHomePage.performSearch(driver, Strings.productName);
		ShopfrontHomePage.productLink(driver)
			.click();
		ProductDetailPage.addCartBtn(driver)
			.click();
		ShopfrontHomePage.cartLink(driver)
			.click();
		driver.quit();
	}

}
