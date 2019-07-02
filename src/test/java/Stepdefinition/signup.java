package Stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class signup {
	@Given("user opens signup page")
	public void user_opens_signup_page() {
		System.out.println("signup page opened");
	}

	@When("user enters fn as {string}")
	public void user_enters_fn_as(String fn) {
		System.out.println("Firstname is "+fn);
	}

	@When("user enters ln as {string}")
	public void user_enters_ln_as(String ln) {
		System.out.println("lastname is "+ln);
	}

	@When("user enters dob as {string}")
	public void user_enters_dob_as(String dob) {
		System.out.println("dob is "+dob);
		
	   
	}

	@When("user enters pwd as {string}")
	public void user_enters_pwd_as(String pwd) {
		System.out.println("pwd is "+pwd);
	}

	@When("user enters cpwd as {string}")
	public void user_enters_cpwd_as(String cpwd) {
		System.out.println("confirmpwd is "+cpwd);
	   
	}

	@Then("click SignUp button")
	public void click_SignUp_button() {
		System.out.println("Signupbutton is clicked");
	}
	    
	

	@Then("verify login success")
	public void verify_login_success() {
		System.out.println("Successfully logged in");
	}
	   



}
