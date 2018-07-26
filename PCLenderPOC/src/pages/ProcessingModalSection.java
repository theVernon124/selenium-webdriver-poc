package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProcessingModalSection {
	//	Elements
	private static WebElement element = null;
	public static WebElement processingModal(WebDriver driver) {
		return element = driver.findElement(By.cssSelector(".in > .modal-dialog"));
	}
}
