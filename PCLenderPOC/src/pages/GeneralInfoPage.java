package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GeneralInfoPage {
	//	Elements
	private static WebElement element = null;
	private static Select selectElement = null;
	public static WebElement generalInfoHeader(WebDriver driver) {
		return element = driver.findElement(By.cssSelector("#headerTitle"));
	}
	public static WebElement purposeRadioBtn(WebDriver driver, String value) {
		return element = driver.findElement(By.cssSelector(".pcl_input[name='trans_type'][value='" + value + "']"));
	}
	public static Select borrowersDropdown(WebDriver driver) {
		return selectElement = new Select(driver.findElement(By.cssSelector("#number_of_borrowers")));
	}
	public static Select propertyUsageDropdown(WebDriver driver) {
		return selectElement = new Select(driver.findElement(By.cssSelector("#property_use")));
	}
	public static Select loanProgramDropdown(WebDriver driver) {
		return selectElement = new Select(driver.findElement(By.cssSelector("#loan_program")));
	}
	public static WebElement emailField(WebDriver driver) {
		return element = driver.findElement(By.cssSelector("#customer_email"));
	}
	public static WebElement confirmEmailField(WebDriver driver) {
		return element = driver.findElement(By.cssSelector("#confirm_customer_email"));
	}
	public static WebElement passwordField(WebDriver driver) {
		return element = driver.findElement(By.cssSelector("#password_1"));
	}
	public static WebElement confirmPasswordField(WebDriver driver) {
		return element = driver.findElement(By.cssSelector("#password_2"));
	}
	public static WebElement nextBtn(WebDriver driver) {
		return element = driver.findElement(By.cssSelector("#btnNext"));
	}
	//	Commands
	public static void fillUpGeneralInfo(WebDriver driver, String purposeValue, String borrowers, String propertyUsage,
			String loanProgram, String email, String confirmEmail, String password, String confirmPassword) {
		purposeRadioBtn(driver, purposeValue).click();
		borrowersDropdown(driver).selectByValue(borrowers);
		propertyUsageDropdown(driver).selectByValue(propertyUsage);
		loanProgramDropdown(driver).selectByValue(loanProgram);
		emailField(driver).sendKeys(email);
		confirmEmailField(driver).sendKeys(confirmEmail);
		passwordField(driver).sendKeys(password);
		confirmPasswordField(driver).sendKeys(confirmPassword);
		nextBtn(driver).click();
	}
}
