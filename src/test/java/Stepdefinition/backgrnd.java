package Stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class backgrnd {
	@Given("application displays welcome msg")
	public void application_displays_welcome_msg() {
	   System.out.println("Welcome");
	}
	@Given("uname and pwd")
	public void uname_and_pwd() {
		System.out.println("user enters uname and pwd");
	    
	}

	@Given("click signin button")
	public void click_signin_button() {
		System.out.println("user logged in");
	   
	}

	@When("user searches for iphone")
	public void user_searches_for_iphone() {
		System.out.println("user searches for iphone");
	  
	}

	@When("user adds product to cart")
	public void user_adds_product_to_cart() {
		System.out.println("user adds product into cart");
	 
	}

	@When("user performs payment using netbanking")
	public void user_performs_payment_using_netbanking() {
		System.out.println("user pays for product");

	}

	@When("user signs out from site")
	public void user_signs_out_from_site() {
		System.out.println("user logged out");
	    
	}



}
