package StepDataTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepD {
	
	public static WebDriver driver;
	@Given("User is on Home Page")
	public void user_is_on_home_page() {
		 WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();			
			driver.get("https://practicetestautomation.com/practice-test-login/");
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,250)", "");
	}
	
	@When("User enters Credentials to LogIn")
	public void user_enters_credentials_to_log_in(DataTable usercredentials) {

		List<List<String>> data = usercredentials.cells();
		driver.findElement(By.id("username")).sendKeys(data.get(0).get(0)); 
	    driver.findElement(By.id("password")).sendKeys(data.get(0).get(1));
	    driver.findElement(By.id("submit")).click();
	}

	@Then("Message displayed Login Successfully")
	public void message_displayed_login_successfully() {
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		
		String ExpectedTitle = "Logged In Successfully | Practice Test Automation";
		Assert.assertEquals(actualTitle, ExpectedTitle);
	}
}
