//IQ How to find total no of links in the web page
package basicProgram;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalLinks {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();				
		WebDriver driver = new ChromeDriver();  //Opened Empty browser
		driver.get("https://makeinjava.com/");	// Navigate to URL
		
		 int nooflinks =   driver.findElements(By.tagName("a")).size();
		 System.out.println("Total no links in the webpage =  "+nooflinks);
		 
		 
		 ///extra
		 // I want to print all link text
		 //i want to print all links in the console
		 
		 List<WebElement> allLinks = driver.findElements(By.tagName("a"));		 
		 for(WebElement link : allLinks)
		 {
			 System.out.println(link.getText() + "   -   " + link.getAttribute("href"));
		//	 System.out.println(link.getAttribute("href"));
		 }

	}

}
