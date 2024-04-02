package Steps;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class NewStepDef {
	
	WebDriver driver;
	
	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
		
		System.out.print("First step 1");
	    
	}

	@When("I complete action")
	public void i_complete_action() {
		System.out.print("step 2");
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
		System.out.print("step 3"); 
	}

	@Then("check more outcomes")
	public void check_more_outcomes() {
		System.out.print("step 4");
	   
	}
	
	
	@Given("I am on chrome homepage")
	public void i_am_on_chrome_homepage() {
		
		WebDriverManager.chromedriver().setup();
		driver.get("https://demoqa.com/");
		
	
	}

	@When("try to open demo qa url")
	public void try_to_open_demo_qa_url() {
		driver.get("https://demoqa.com/");
		
	}

	@Then("i am able to open demo qa url")
	public void i_am_able_to_open_demo_qa_url() {
	    
		String titleUrl = driver.getTitle();
		Assert.assertEquals("DEMOQA", titleUrl);
		//Assert.assertNull(object);
	}


}
