package StepDefinitionWithPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefUsingPOM{
	
	public WebDriver driver;	
	public LoginPage lg;

	@Given("User Launches the URL {string}")
	public void user_launches_the_url(String url) {
		WebDriverManager.chromedriver().setup();		
	    driver = new ChromeDriver();
		lg = new LoginPage(driver);
		
	    driver.get(url);	  

	}

	@When("user enters Email as {string} and password as {string}")
	public void user_enters_email_as_and_password_as(String username, String password) {
	
		lg.enterUserName(username);
		lg.enterpassword(password);
		
	}

	@When("click on Login")
	public void click_on_login() {
		lg.clicklogin();
	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String ExpectedTitle) throws InterruptedException {
	 
		Thread.sleep(2000);
		String actualTitle = driver.getTitle();
		System.out.println("Title is="+actualTitle);
		
		Assert.assertTrue(actualTitle.equals(ExpectedTitle));
		
	}

}
