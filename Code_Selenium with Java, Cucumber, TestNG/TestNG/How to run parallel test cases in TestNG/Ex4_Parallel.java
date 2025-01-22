//How to execute test cases in Parallel
package Examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ex4_Parallel {
	
	@Test
	public void test1() throws InterruptedException
	{
		System.out.println("test 1");
		WebDriverManager.chromedriver().setup();				
		WebDriver driver = new ChromeDriver();  //Opened Empty browser
		driver.get("https://www.facebook.com/");	// Navigate to URL
		Thread.sleep(2000);		
	}
	
	@Test
	public void test2() throws InterruptedException
	{
		System.out.println("test 2");
		WebDriverManager.chromedriver().setup();				
		WebDriver driver = new ChromeDriver();  //Opened Empty browser
		driver.get("https://www.google.co.in/");	// Navigate to URL
		Thread.sleep(2000);		
	}

}
