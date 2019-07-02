package Stepdefinition;

import java.util.List;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class Lists {
	@When("user searches for products")
	public void user_searches_for_products(DataTable productdata) {
		List<String> prodname=productdata.asList();
		for(String products:prodname)
		{
			System.out.println(products);
		}
	}

	@When("verify products displayed")
	public void verify_products_displayed() {
		System.out.println("products displayed");
	    
	}

	@Then("close")
	public void close() {
		System.out.println("aplln closed");
	   
	}



}
