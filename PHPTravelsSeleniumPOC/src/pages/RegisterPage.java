package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage {
	//	Elements
	private static WebElement element = null;
	public static WebElement firstNameField(WebDriver driver) {
		return element = driver.findElement(By.cssSelector("#headersignupform > div:nth-child(3) > input"));
	}
	public static WebElement lastNameField(WebDriver driver) {
		return element = driver.findElement(By.cssSelector("#headersignupform > div:nth-child(4) > input"));
	}
	public static WebElement mobileNumberField(WebDriver driver) {
		return element = driver.findElement(By.cssSelector("#headersignupform > div:nth-child(5) > input"));
	}
	public static WebElement emailField(WebDriver driver) {
		return element = driver.findElement(By.cssSelector("#headersignupform > div:nth-child(6) > input"));
	}
	public static WebElement passwordField(WebDriver driver) {
		return element = driver.findElement(By.cssSelector("#headersignupform > div:nth-child(7) > input"));
	}
	public static WebElement confirmPasswordField(WebDriver driver) {
		return element = driver.findElement(By.cssSelector("#headersignupform > div:nth-child(8) > input"));
	}
	public static WebElement signUpBtn(WebDriver driver) {
		return element = driver.findElement(By.cssSelector("#headersignupform > div:nth-child(9) > button"));
	}
	public static WebElement spiel(WebDriver driver) {
		return element = driver.findElement(By.cssSelector("#headersignupform > div.resultsignup > div > p"));
	}
	//	Commands
	public static void registerUser(WebDriver driver, String firstName, String lastName, String mobileNum, String email,
			String password, String confirmPassword) {
		firstNameField(driver)
			.sendKeys(firstName);
		lastNameField(driver)
			.sendKeys(lastName);
		mobileNumberField(driver)
			.sendKeys(mobileNum);
		emailField(driver)
			.sendKeys(email);
		passwordField(driver)
			.sendKeys(password);
		confirmPasswordField(driver)
			.sendKeys(confirmPassword);
		signUpBtn(driver)
			.click();
	}
}
