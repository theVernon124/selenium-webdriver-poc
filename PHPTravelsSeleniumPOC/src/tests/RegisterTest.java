package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import commands.CustomCommands;
import data.TestData;
import pages.HeaderMenu;
import pages.RegisterPage;

public class RegisterTest {
	WebDriver driver = null;
	@BeforeClass
	public void beforeClass() {
		System.out.println("Setting up Before Class..");
		driver = CustomCommands.setupFirefoxDriver();
		driver.get(TestData.homePageUrl);
		HeaderMenu.myAccountMenu(driver)
			.click();
		HeaderMenu.signUpSubmenu(driver)
			.click();
	}
	@BeforeMethod
	public void beforeMethod() {
		driver.navigate().refresh();
	}
	@Test
	public void blankFirstName() {
		RegisterPage.registerUser(driver, "", TestData.lastName, TestData.mobileNum, TestData.email, TestData.password,
				TestData.password);
		Assert.assertTrue(RegisterPage.spiel(driver).isDisplayed());
		Assert.assertEquals(RegisterPage.spiel(driver).getText(), TestData.blankFirstName);
	}
	@Test
	public void blankLastName() {
		
	}
}
