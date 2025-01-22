package StepH;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionHH {
	
	@Given("this is the first step")
	public void this_is_the_first_step() {
		
		System.out.println("this is the first step");
	    
	}

	@When("this is the second step")
	public void this_is_the_second_step() {
		System.out.println("this is the second step");
	 
	}

	@Then("this is the third step")
	public void this_is_the_third_step() {
	    System.out.println("this is the third step");
	}
	
	@Given("this is the manual step")
	public void this_is_the_manual_step() {
	    System.out.println("test case 1");
	}

	@When("this is the Automation step")
	public void this_is_the_automation_step() {
		System.out.println("test case 2");
	}
	
	@Given("I navigate to the login page")
	public void i_navigate_to_the_login_page() {
	   System.out.println("I navigate to the login page");
	}

	@When("I submit username and password")
	public void i_submit_username_and_password() {
	    System.out.println("I submit username and password");
	}

	@Then("I should be logged in")
	public void i_should_be_logged_in() {
	    System.out.println("I should be logged in");
	}


}
