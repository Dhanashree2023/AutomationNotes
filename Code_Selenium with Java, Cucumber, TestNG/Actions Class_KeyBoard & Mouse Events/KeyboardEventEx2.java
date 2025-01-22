import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardEventEx2 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();				
		WebDriver driver = new ChromeDriver();  //Opened Empty browser
		driver.get("https://www.facebook.com/");	// Navigate to URL
		
		Actions act = new Actions(driver);
		Thread.sleep(3000);
	
		
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(3000);
        WebElement ele = driver.findElement(By.id("day"));
		
		//to click 
		act.click(ele).perform();
		Thread.sleep(3000);
		
		act.sendKeys(Keys.END).perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.HOME).perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.ENTER).perform();
		System.out.println(1);
		
	}

}
