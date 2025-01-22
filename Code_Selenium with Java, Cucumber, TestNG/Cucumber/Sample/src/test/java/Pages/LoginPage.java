package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	 WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
@FindBy(xpath = "//input[@id = 'user-name']")
WebElement username;

	
	@FindBy(xpath = "//input[@type = 'password']")
	WebElement password;
	
	@FindBy(id = "login-button")
	WebElement login;
	
	public void enterUserName(String uname)
	{
	username.sendKeys(uname);
	}
	
	public void enterpassword(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void clicklogin()
	{
		login.click();
	}

}
