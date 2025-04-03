package com.definitions;

import org.testng.Assert;

import com.actions.HomePageActions;
import com.actions.LoginPageActions;
import com.utilities.HelperClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageDefinitions {
	
	LoginPageActions objLogin = new LoginPageActions();
	HomePageActions objHomePage = new HomePageActions();
	
	@Given("user is on the Login Page {string}")
	public void loginTest(String url) {
	    HelperClass.openPage(url);
	}

	@When("user enters unername and password")
	public void goToHomePage() {
	    objLogin.login();
	}

	@Then("User should be able to login successfully and new page open")
	public void VerifyLogin() {
	  Assert.assertTrue(objHomePage.getHomePageText().contains("Dashboard"));
	  
	}
}
