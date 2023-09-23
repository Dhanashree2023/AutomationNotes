package StepDefinitions;


import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepsT {
	
	WebDriver driver;
	@Given("User is on the Login Page")
	public void user_is_on_the_login_page() {
		System.setProperty("webdriver.chrome.driver", ".\\ChromeDriver\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");  
	}

	@When("User enters Credentials")
	public void user_enters_credentials(DataTable dataTable) {
		
		  System.out.println("Credentials Entered");
		  driver.findElement(By.xpath("//input[contains(@name,'user-name')]")).sendKeys(dataTable.cell(0, 0));
		  driver.findElement(By.xpath("//input[@type = 'password']")).sendKeys(dataTable.cell(0, 1));
		  
	    //	 List<List<String>> data = dataTable.cells();
		//	 driver.findElement(By.xpath("//input[contains(@name,'user-name')]")).sendKeys(data.get(0).get(0));
        //  driver.findElement(By.xpath("//input[@type = 'password']")).sendKeys(data.get(0).get(1));
			 		 
			 //Print table data
//			 List<List<String>> data1 = dataTable.asLists(String.class);
//					 for(List<String> e : data1 ){
//						 System.out.println(e);
//					 }
	}
	
	@When("User enters Credentials details")
	public void user_enters_credentials_details(DataTable dataTable) {
		for (Map<String, String> data : dataTable.asMaps(String.class, String.class)) {		
			 driver.findElement(By.xpath("//input[contains(@name,'user-name')]")).sendKeys(data.get("username"));
			 driver.findElement(By.xpath("//input[@type = 'password']")).sendKeys(data.get("password"));	
	}
	}

	@Then("User should see the  Home page")
	public void user_should_see_the_home_page() {
		
		 WebElement login = driver.findElement(By.xpath("//input[@type = 'submit']"));
			login.click();  
		
		System.out.println("User login successfully");
	   
	}


	

}
