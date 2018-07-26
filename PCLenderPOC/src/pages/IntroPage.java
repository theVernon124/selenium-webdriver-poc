package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IntroPage {
	//	Elements
	private static WebElement element = null;
	public static WebElement introHeader(WebDriver driver) {
		return element = driver.findElement(By.cssSelector("#headerTitle"));
	}
	public static WebElement returningRadioBtn(WebDriver driver, String value) {
		return element = driver.findElement(By.cssSelector(".pcl_input[name='inprogress'][value='" + value + "']"));
	}
	public static WebElement existingRadioBtn(WebDriver driver, String value) {
		return element = driver.findElement(By.cssSelector(".pcl_input[name='ismember'][value='" + value + "']"));
	}
	public static WebElement acctNumField(WebDriver driver) {
		return element = driver.findElement(By.cssSelector("#member_account_number"));
	}
	public static WebElement nextBtn(WebDriver driver) {
		return element = driver.findElement(By.cssSelector("#btnNext"));
	}
	//	Commands
	public static void fillUpIntroduction(WebDriver driver, String returningValue, String existingValue, String acctNum) {
		returningRadioBtn(driver, returningValue)
			.click();
		existingRadioBtn(driver, existingValue)
			.click();
		acctNumField(driver)
			.sendKeys(acctNum);
		nextBtn(driver)
			.click();
	}
}
