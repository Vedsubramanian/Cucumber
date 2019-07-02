package Stepdefinition;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class login {
	WebDriver driver;
	@Test
	@Given("user opens login page in newtorurs application")
	public void user_opens_login_page_in_newtorurs_application() {
		driver.get("http://www.newtours.demoaut.com/");
		
	     
	}

	@When("user enters username as {string} And password as {string} And click Submit button")
	public void user_enters_username_as_And_password_as_And_click_Submit_button(String string, String string2) {
		WebElement a=driver.findElement(By.name("userName"));
		a.sendKeys("mercury");
		WebElement b=driver.findElement(By.name("password"));
		b.sendKeys("mercury");
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input")).click();
	  
	}

	@Then("verify login sucess")
	public void verify_login_sucess() {
		Assert.assertEquals(driver.getTitle(),"Find a Flight: Mercury Tours:" );
	   
	    
	}
	@BeforeTest

	public void open()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_c2a.04.29\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	@AfterTest
	public void Close()
	{
		driver.close();
	}


}
