//ClickAndHold
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickandHold {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();				
		WebDriver driver = new ChromeDriver();  //Opened Empty browser
        driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");	// Navigate to URL
	    driver.manage().window().maximize();
	    
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        
        Actions act = new Actions(driver);
        
        WebElement ele = driver.findElement(By.xpath("//li[text() = 'C']"));
         act.clickAndHold(ele).perform();
            
        Thread.sleep(4000);    
        System.out.println("Click and Hold performed Successfully");
        	    
	}

}
