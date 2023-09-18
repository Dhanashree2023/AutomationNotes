package StepDefinition;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import PageObject.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class Steps {
	public WebDriver driver;
	public LoginPage loginPg;
	
	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", ".\\ChromeDriver\\chromedriver.exe");
	    driver = new ChromeDriver();
	    loginPg = new LoginPage(driver);
	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) {	
		driver.get(url);  
	}

	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String emailAdd, String pwd) {
		loginPg.enterEmail(emailAdd);
		loginPg.enterPassword(pwd);
	}

	@When("Click on Login")
	public void click_on_login() {
		loginPg.clkOnLoginButton();
	}

	@Then("Page Title should be {string}")
	public void page_title_should_be(String ExpectedTitle) {
		
		String actualTitle = driver.getTitle();
		if(actualTitle.equals(ExpectedTitle))
		{
			Assert.assertTrue(true); //pass
		}
		else
		{
			Assert.assertTrue(false);
		}
	}

	@When("User click on Log out link")
	public void user_click_on_log_out_link() {
		loginPg.clickonLogoutButton();
	}

	@Then("close browser")
	public void close_browser() {
	  driver.close();
	  driver.quit();
	}


	

}
