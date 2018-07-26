package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import commands.CustomCommands;
import data.TestData;
import pages.AccountPage;
import pages.HeaderMenu;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest {
	WebDriver driver = null;
	@BeforeClass
	public void beforeClass() {
		System.out.println("Setting up Before Class..");
		driver = CustomCommands.setupFirefoxDriver();
		driver.get(TestData.homePageUrl);
		HeaderMenu.myAccountMenu(driver)
			.click();
		HeaderMenu.loginSubmenu(driver)
			.click();
	}
	@BeforeMethod
	public void beforeMethod() {
		driver.navigate().refresh();
	}
	@Test
	public void blankEmail() {
		LoginPage.loginUser(driver, "", TestData.password);
		Assert.assertTrue(LoginPage.spiel(driver).isDisplayed());
		Assert.assertEquals(LoginPage.spiel(driver).getText(), TestData.invalidLoginSpiel);
	}
	@Test
	public void blankPassword() {
		LoginPage.loginUser(driver, TestData.email, "");
		Assert.assertTrue(LoginPage.spiel(driver).isDisplayed());
		Assert.assertEquals(LoginPage.spiel(driver).getText(), TestData.invalidLoginSpiel);
	}
	@Test
	public void invalidEmail() {
		LoginPage.loginUser(driver, TestData.invalidEmail, TestData.password);
		Assert.assertTrue(LoginPage.spiel(driver).isDisplayed());
		Assert.assertEquals(LoginPage.spiel(driver).getText(), TestData.invalidLoginSpiel);
	}
	@Test
	public void nonExistentEmail() {
		LoginPage.loginUser(driver, "x" + TestData.email, TestData.password);
		Assert.assertTrue(LoginPage.spiel(driver).isDisplayed());
		Assert.assertEquals(LoginPage.spiel(driver).getText(), TestData.invalidLoginSpiel);
	}
	@Test
	public void invalidPassword() {
		LoginPage.loginUser(driver, TestData.email, "x" + TestData.password);
		Assert.assertTrue(LoginPage.spiel(driver).isDisplayed());
		Assert.assertEquals(LoginPage.spiel(driver).getText(), TestData.invalidLoginSpiel);
	}
	@Test
	public void validLogin() {
		LoginPage.loginUser(driver, TestData.email, TestData.password);
		Assert.assertTrue(AccountPage.userGreetingHeader(driver).isDisplayed());
		Assert.assertEquals(AccountPage.userGreetingHeader(driver).getText(), TestData.userGreetingSpiel);
		HeaderMenu.userAccountMenu(driver)
			.click();
		HeaderMenu.logoutSubmenu(driver)
			.click();
	}
	@AfterClass
	public void afterClass() {
		System.out.println("Cleaning up After Class..");
		driver.quit();
	}
}
