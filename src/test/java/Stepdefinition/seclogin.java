package Stepdefinition;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class seclogin {
	@When("user enters username as {string} And password as {string}")
	public void user_enters_username_as_And_password_as(String un, String pwd) {
		System.out.println("Username"+un+"password"+pwd);
	   
	}

	@When("click Submit button")
	public void click_Submit_button() {
	    
	}

	@Then("verify login failure")
	public void verify_login_failure() {
	    
	}



}
