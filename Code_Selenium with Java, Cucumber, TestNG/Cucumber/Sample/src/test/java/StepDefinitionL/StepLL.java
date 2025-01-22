package StepDefinitionL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
public class StepLL {
	WebDriver driver;
	@Given("User is on page")
	public void user_is_on_page() {
		WebDriverManager.chromedriver().setup();		
	    driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");  
	}
	@When("User login into the application")
	public void user_login_into_the_application() {	
		WebElement username = driver.findElement(By.xpath("//input[contains(@name,'user-name')]"));
		username.sendKeys("standard_user");  	
		WebElement password = driver.findElement(By.xpath("//input[@type = 'password']"));
		password.sendKeys("secret_sauce");  
	}
	@Then("Home Page is displayed")
	public void home_page_is_displayed() {		
		WebElement login = driver.findElement(By.xpath("//input[@type = 'submit']"));
		login.click();  
	}
}