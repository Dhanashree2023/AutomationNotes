package Test;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.chrome.ChromeDriver; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
public class LoginTest {
	public static void main(String[] args) throws FileNotFoundException, IOException {
	
	    WebDriverManager.chromedriver().setup(); 
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
		LoginPage p = new LoginPage(driver);
	//	driver.get("https://www.saucedemo.com/");
		
		Properties prop=new Properties();
		prop.load(new FileInputStream("Resources\\config.properties"));	
		driver.get(prop.getProperty("url"));
		
		p.enterUsername("standard_user");
		p.enterPassword("secret_sauce");
		p.ClickonLogonBtn();		
	}
}
