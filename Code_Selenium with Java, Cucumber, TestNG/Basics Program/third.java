//Locator - tagName
package basicProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class third {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();				
		WebDriver driver = new ChromeDriver();  //Opened Empty browser
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	// Navigate to URL
		
		//Maximize window
		driver.manage().window().maximize();
				
//		WebElement userName = driver.findElement(By.name("username"));
//		userName.sendKeys("Admin");
//		
//		WebElement password = driver.findElement(By.name("password"));
//		password.sendKeys("admin123");
//		
		WebElement login = driver.findElement(By.tagName("button"));
		login.click();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
