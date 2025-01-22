package StepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class steps {
	
	@Given("this is the first step")
	public void this_is_the_first_step() {
		System.out.println("This is the first step");
	    
	}

	@When("this is the second step")
	public void this_is_the_second_step() {
		System.out.println("This is the second step");
	}

	@Then("this is the third step")
	public void this_is_the_third_step() {
		System.out.println("This is the Third step");
	}
	
	
	@Given("I navigate to the login page")
	public void i_navigate_to_the_login_page() {
		System.out.println("I am at the LogIn Page");
	}

	@When("I submit username and password")
	public void i_submit_username_and_password() {
		System.out.println("I submit username and password");
	
	}

	@Then("I should be logged in")
	public void i_should_be_logged_in() {
		System.out.println("I should be logged in");
	  
	}

	@Given("User search for Lenovo Laptop")
	public void user_search_for_lenovo_laptop() {
		System.out.println("User search for Lenovo Laptop");
	 
	}

	@When("Add the first laptop that appears in the search result to the basket")
	public void add_the_first_laptop_that_appears_in_the_search_result_to_the_basket() {
	 
	}

	@Then("User basket should display with added item")
	public void user_basket_should_display_with_added_item() {
	  System.out.println("User basket should display with added item");
	}

	@Given("User navigate for Lenovo Laptop")
	public void user_navigate_for_lenovo_laptop() {
		System.out.println("User navigate for Lenovo Laptop");
	  
	}

	@When("Add the laptop to the basket")
	public void add_the_laptop_to_the_basket() {
		System.out.println("Add the laptop to the basket");
	  
	}




}
