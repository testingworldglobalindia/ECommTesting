package org.web.testcase.steps;

import org.hcl.web.base.InitiateBrowser;
import org.hcl.web.pages.LoginPage;
import org.hcl.web.validations.PageValidations;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	static WebDriver driver;
	@Given("^User is on Login Page$")
	public void navigateToLogin() throws Throwable {
		driver = InitiateBrowser.startBrowser();
	   
	}

	@When("^User enters username$")
	public void user_enters_username() throws Throwable {
	    LoginPage.enterUsername("Hello");
	}

	@When("^User enters password$")
	public void user_enters_password() throws Throwable {
		LoginPage.enterPassword("abcd");
	}

	@When("^User clicks on signin button$")
	public void user_clicks_on_signin_button() throws Throwable {
	   LoginPage.clickSigninButton();
	}

	@Then("^Verify user should be login$")
	public void verify_user_should_be_login() throws Throwable {
	   
	}

	@Then("^Verify user gets welcome message$")
	public void verify_user_gets_welcome_message() throws Throwable {
		PageValidations.validatePageTitle("HelloWorld");
	}


	
	
}
