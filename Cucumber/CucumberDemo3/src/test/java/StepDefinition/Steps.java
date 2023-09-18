package StepDefinition;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import PageObject.AddNewCustomerss;
import PageObject.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class Steps {
	public WebDriver driver;
	public LoginPage loginPg;
	public AddNewCustomerss AddNewcustPg;
	
	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", ".\\ChromeDriver\\chromedriver.exe");
	    driver = new ChromeDriver();
	    loginPg = new LoginPage(driver);
	    AddNewcustPg = new AddNewCustomerss(driver);
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
	
	/////////////   Add New Customers  ////////////////
	@Then("User can view dashboard")
	public void user_can_view_dashboard() {
		
		String actualTitle = AddNewcustPg.getPageTitle();
	//	String actualTitle = driver.getTitle();
		String ExpectedTitle = "Dashboard / nopCommerce administration";
		
		if(actualTitle.equals(ExpectedTitle))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	    
	}

	@When("user clicks on customers Menu")
	public void user_clicks_on_customers_menu() {
	  
		AddNewcustPg.clickOnCustomersMenu();
	}

	@When("click on customers Menu Item")
	public void click_on_customers_menu_item() {
		AddNewcustPg.clickOnCustomersMenuItem();
	}

	@When("click on Add New button")
	public void click_on_add_new_button() {
		AddNewcustPg.clickOnAddnew();
	}

	@Then("user can view Add new customer page")
	public void user_can_view_add_new_customer_page() {
		String actualTitle = AddNewcustPg.getPageTitle();
		
	//	String actualTitle = driver.getTitle();
		String ExpectedTitle = "Add a new customer / nopCommerce administration";
		
		if(actualTitle.equals(ExpectedTitle))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}

	@When("user enter customer info")
	public void user_enter_customer_info() {
		
		AddNewcustPg.enterEmail("tet1@gmail.com");
		AddNewcustPg.enterPassword("test1");
		AddNewcustPg.enterFirstName("Dhanashree");
		AddNewcustPg.enterLastName("Patil");
		AddNewcustPg.enterGender("Female");
		AddNewcustPg.enterDob("10/11/2010");
		AddNewcustPg.enterCompanyName("Wipro");
		AddNewcustPg.enterAdminContent("Admin content");
		AddNewcustPg.enterManagerOfVendor("Vendor 1");	
	}

	@When("click on Save button")
	public void click_on_save_button() {
		AddNewcustPg.clickOnSave();		
	}

	@Then("user can view confirmation message as {string}")
	public void user_can_view_confirmation_message_as(String expectedMsg) {
		
		String bodyTagText = driver.findElement(By.tagName("Body")).getText();
		if(bodyTagText.contains(expectedMsg))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}	 
	}
}
