//Navigation Method - Refresh(), to(), Back(), Forward()
package basicProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigateMethod{
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();				
		WebDriver driver = new ChromeDriver();
		  driver.get("https://www.google.com/");
		  
		  WebElement ele = driver.findElement(By.name("q"));
		  ele.sendKeys("hyr");
		  
		  WebElement searchbtn = driver.findElement(By.name("btnK"));
		  searchbtn.submit();
		  
		  driver.navigate().to("https://www.facebook.com/");
		  
		  Thread.sleep(3000);
		  
		  driver.navigate().refresh();  // current page refresh
		  
		  Thread.sleep(3000);
		  
		  driver.navigate().back();  // google
		  Thread.sleep(3000);
		  
		  driver.navigate().forward();   //facebook	
	}

}
