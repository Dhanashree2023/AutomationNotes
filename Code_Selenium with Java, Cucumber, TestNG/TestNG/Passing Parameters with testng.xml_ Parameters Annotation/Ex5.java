//How to pass parameters in TestNG

package Examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ex5 {
	
	public WebDriver driver;
	
	@Test
	@Parameters("myName")
	public void parameterTest(String myName)
	{
		System.out.println("Parameterized value is="+myName);
	}
	
	@Test
	@Parameters("url")
	public void launchurl(String url)
	{
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);		
	}
	
	@Test
	@Parameters("browserName")
	public void initializeBrowser(String browserName)
	{
		if(browserName.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else
		{
			System.out.println("BrowserName is invalid");
		}
		driver.manage().window().maximize();
		
	}
}
