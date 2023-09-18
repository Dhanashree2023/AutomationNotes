package PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(id = "Email")
	WebElement email;
	
	@FindBy(id = "Password")
	WebElement password;
	
	@FindBy(xpath = "//button[@type = 'submit']")
	WebElement LoginButton;
	
	@FindBy(xpath = "//a[text() = 'John Smith']/../following-sibling::li/a[text() = 'Logout']")
	WebElement logout;
	
	public void enterEmail(String emailAdd)
	{
		email.clear();
		email.sendKeys(emailAdd);
	}
	public void enterPassword(String pwd)
	{
		password.clear();
		password.sendKeys(pwd);
	}
	public void clkOnLoginButton()
	{
		LoginButton.click();
	}
	public void clickonLogoutButton()
	{
		logout.click();
	}
}
