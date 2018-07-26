package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductDetailPage {
	//	Elements
	private static WebElement element = null;
	public static WebElement addCartBtn(WebDriver driver) {
		element = driver.findElement(By.cssSelector("#content > div.product-container > div > div > div > div.col-lg-7.col-md-7.col-sm-12.col-xs-12 > div > div:nth-child(7) > div > div:nth-child(3) > div > div > product-cart > div:nth-child(2) > div > div:nth-child(1) > button.add-to-cart.btn.btn-tackthis.btn-block.btn-thick"));
		return element;
	}
}
