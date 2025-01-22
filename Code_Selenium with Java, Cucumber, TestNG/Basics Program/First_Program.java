package basicProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class First_Program {
	public static void main(String[] args) throws InterruptedException {	
		WebDriverManager.chromedriver().setup();				
		WebDriver driver = new ChromeDriver();  //Opened Empty browser
		driver.get("https://www.saucedemo.com/");	// Navigate to URL
		
		//Maximize window
		driver.manage().window().maximize();
		
		//Minimize window using selenium
	//	driver.manage().window().minimize();
		
		//How to resize window using Selenium		
//		Dimension d = new Dimension(500, 900);
//		driver.manage().window().setSize(d);
						
		System.out.println("Browser open successfully");	
		
		// 1) Locating By using ID
//		WebElement userName = driver.findElement(By.id("user-name"));
//		userName.sendKeys("standard_user");
//		
//		WebElement password = driver.findElement(By.id("password"));
//		password.sendKeys("secret_sauce");
		
		//2) Locating WebElement By using name
		WebElement userName = driver.findElement(By.name("user-name"));
		userName.sendKeys("standard_user");
		
		WebElement password = driver.findElement(By.name("password"));
    	password.sendKeys("secret_sauce");
		
	}	
}
