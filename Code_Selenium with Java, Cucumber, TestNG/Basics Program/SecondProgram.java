// IQ: How to Enter text in the Google Search Box
package basicProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SecondProgram {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();				
		WebDriver driver = new ChromeDriver();  //Opened Empty browser
		driver.get("https://www.google.co.in/");	// Navigate to URL
		
		//Maximize window
		driver.manage().window().maximize();
		
		//Searchbox Click
		 WebElement searchBox = driver.findElement(By.id("APjFqb"));
		 searchBox.click();
		 
		 //type
		 searchBox.sendKeys("BookMyShow");
		 
		 // Click on Google Search button
		 WebElement GoogleSearch = driver.findElement(By.className("gNO89b"));
		 GoogleSearch.click();
		 
		 //click on Movies LinkText  a
		 WebElement Movies = driver.findElement(By.linkText("Movies"));
		 Movies.click();
				 
		 Thread.sleep(2000);
		 
	}

}
