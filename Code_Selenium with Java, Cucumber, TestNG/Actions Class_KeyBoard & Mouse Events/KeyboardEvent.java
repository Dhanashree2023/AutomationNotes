//Keyboard interface methods - keyDown(), keyUp()
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardEvent {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();				
		WebDriver driver = new ChromeDriver();  //Opened Empty browser
		driver.get("https://demoqa.com/text-box");	// Navigate to URL
		
		Actions act = new Actions(driver);
		
		WebElement userName = driver.findElement(By.id("userName"));
		userName.sendKeys("Dhanashree");
		
		WebElement userEmail = driver.findElement(By.id("userEmail"));
		userEmail.sendKeys("dhnpatil01@gmail.com");
		
		WebElement currentAddress = driver.findElement(By.id("currentAddress"));
		currentAddress.sendKeys("Pune 1234");
		
		//Keyboard action
		//current address copy and paste into permanent address 
		//ctrl+A, ctrl+C, tab,ctl+v
		
		//ctrl+A
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		
		//ctrl+C
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		
		//tab button
		act.keyDown(Keys.TAB).keyUp(Keys.TAB).build().perform();
	//	act.sendKeys(Keys.TAB).build().perform();
		
		//ctrl+v
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		System.out.println(1);
	
	}

}
