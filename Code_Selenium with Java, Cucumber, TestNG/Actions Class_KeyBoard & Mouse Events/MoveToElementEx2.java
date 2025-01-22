//Program for moveToElement and Right click
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElementEx2 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();				
		WebDriver driver = new ChromeDriver();  //Opened Empty browser
		driver.get("https://www.amazon.in/");	// Navigate to URL
		
		Actions act = new Actions(driver);
		
		WebElement SignIn = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		act.moveToElement(SignIn).build().perform();
		
		//context Click : Right Click		
		act.contextClick(SignIn).build().perform();		
	}
}
