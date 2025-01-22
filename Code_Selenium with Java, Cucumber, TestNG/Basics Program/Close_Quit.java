//WebDriver Interface method
package basicProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Close_Quit {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();				
		WebDriver driver = new ChromeDriver();  //Opened Empty browser
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		WebElement hotel = driver.findElement(By.xpath("//span[@class = 'allcircle circletwo']"));
		hotel.click();
		
		Thread.sleep(5000);
		
	//	driver.close();  // close the current browser window
		
		driver.quit(); //to close all windows 
		
		
	}

}
