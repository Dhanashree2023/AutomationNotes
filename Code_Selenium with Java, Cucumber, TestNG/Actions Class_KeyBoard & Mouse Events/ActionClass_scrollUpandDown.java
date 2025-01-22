//Action Class Using Scroll up and down
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClass_scrollUpandDown {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();				
		WebDriver driver = new ChromeDriver();  //Opened Empty browser
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
        Thread.sleep(2000);		
		act.sendKeys(Keys.PAGE_UP).build().perform();
	}

}
