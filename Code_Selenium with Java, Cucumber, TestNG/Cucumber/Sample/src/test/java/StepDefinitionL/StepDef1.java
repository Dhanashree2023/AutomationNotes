package StepDefinitionL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDef1 {
	WebDriver driver;
	@Given("User Launches the URL {string}")
	public void user_launches_the_url(String url) {

		WebDriverManager.chromedriver().setup();		
	    driver = new ChromeDriver();
	    driver.get(url);	  
	}

	@When("user enters Email as {string} and password as {string}")
	public void user_enters_email_as_and_password_as(String username, String password) {
	    
		WebElement username1 = driver.findElement(By.xpath("//input[contains(@name,'user-name')]"));
		username1.sendKeys(username);  	
		WebElement password1 = driver.findElement(By.xpath("//input[@type = 'password']"));
		password1.sendKeys(password);  
		
	}

	@When("click on Login")
	public void click_on_login() {
		WebElement login = driver.findElement(By.xpath("//input[@type = 'submit']"));
		login.click();  
	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String ExpectedTitle) {
	 
		String actualTitle = driver.getTitle();
		System.out.println("Title is="+actualTitle);
		
		Assert.assertTrue(actualTitle.equals(ExpectedTitle));
		
	}
}
