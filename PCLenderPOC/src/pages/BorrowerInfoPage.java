package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BorrowerInfoPage {
	//	Elements
	private static WebElement element = null;
	private static Select selectElement = null;
	public static WebElement borrowerInfoHeader(WebDriver driver) {
		return element = driver.findElement(By.cssSelector("#headerTitle"));
	}
	public static WebElement firstNameField(WebDriver driver) {
		return element = driver.findElement(By.cssSelector("#first_name_borrower_1"));
	}
	public static WebElement lastNameField(WebDriver driver) {
		return element = driver.findElement(By.cssSelector("#last_name_borrower_1"));
	}
	public static WebElement bdayField(WebDriver driver) {
		return element = driver.findElement(By.cssSelector("#birthdate_borrower_1"));
	}
	public static WebElement ssnField(WebDriver driver) {
		return element = driver.findElement(By.cssSelector("#fakessn_1"));
	}
	public static Select maritalStatusDropdown(WebDriver driver) {
		return selectElement = new Select(driver.findElement(By.cssSelector("#marital_status_borrower_1")));
	}
	public static Select citizenshipDropdown(WebDriver driver) {
		return selectElement = new Select(driver.findElement(By.cssSelector("#citizenship_borrower_1")));
	}
	public static WebElement streetField(WebDriver driver) {
		return element = driver.findElement(By.cssSelector("#current_street_borrower_1"));
	}
	public static WebElement zipCode(WebDriver driver) {
		return element = driver.findElement(By.cssSelector("#current_zip_borrower_1"));
	}
	public static WebElement cityField(WebDriver driver) {
		return element = driver.findElement(By.cssSelector("#current_city_borrower_1"));
	}
	public static Select stateDropdown(WebDriver driver) {
		return selectElement = new Select(driver.findElement(By.cssSelector("#current_state_borrower_1")));
	}
	public static WebElement lengthAddressField(WebDriver driver) {
		return element = driver.findElement(By.cssSelector("#current_residence_length_borrower_1"));
	}
	public static Select ownRentDropdown(WebDriver driver) {
		return selectElement = new Select(driver.findElement(By.cssSelector("#current_own_rent_borrower_1")));
	}
	public static WebElement homePhone(WebDriver driver) {
		return element = driver.findElement(By.cssSelector("#home_phone_borrower_1"));
	}
	public static Select incomeVerificationDropdown(WebDriver driver) {
		return selectElement = new Select(driver.findElement(By.cssSelector("#income_verification_borrower_1")));
	}
	public static Select creditReportDropdown(WebDriver driver) {
		return selectElement = new Select(driver.findElement(By.cssSelector("#use_credit_report_borrower_1")));
	}
	public static WebElement ethnicityCheckbox(WebDriver driver, String ethnicityID) {
		return element = driver.findElement(By.cssSelector("#" + ethnicityID + " > div > label > .ethnicity_section"));		
	}
	public static WebElement genderCheckbox(WebDriver driver, String gender) {
		return element = driver.findElement(By.xpath("//div[@id='gender_']/div/div/label[span/text()='" + gender + "']/input"));
	}
	public static WebElement nextBtn(WebDriver driver) {
		return element = driver.findElement(By.cssSelector("#btnNext"));
	}
	//	Commands
	public static void fillUpBorrowerInfo(WebDriver driver, String firstName, String lastName, String bday, String ssn,
			String maritalStatus, String citizenship, String street, String zipCode, String city, String state, String length,
			String ownership, String homePhone, String incomeVerif, String creditReport, String ethnicity, String gender) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		firstNameField(driver).sendKeys(firstName);
		lastNameField(driver).sendKeys(lastName);
		bdayField(driver).sendKeys(bday);
		jse.executeScript("document.querySelector('#fakessn_1').value=" + ssn + "");
//		ssnField(driver).sendKeys(ssn);
		maritalStatusDropdown(driver).selectByVisibleText(maritalStatus);
		citizenshipDropdown(driver).selectByVisibleText(citizenship);
		streetField(driver).sendKeys(street);
		zipCode(driver).sendKeys(zipCode);
		cityField(driver).sendKeys(city);
		stateDropdown(driver).selectByValue(state);
		lengthAddressField(driver).sendKeys(length);
		ownRentDropdown(driver).selectByVisibleText(ownership);
		homePhone(driver).sendKeys(homePhone);
		incomeVerificationDropdown(driver).selectByValue(incomeVerif);
		creditReportDropdown(driver).selectByValue(creditReport);
		ethnicityCheckbox(driver, ethnicity).click();
		genderCheckbox(driver, gender).click();
		nextBtn(driver);
	}
}
