//Right Click and Double Click
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClassExample_1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();				
		WebDriver driver = new ChromeDriver();  //Opened Empty browser
		driver.get("https://demoqa.com/buttons");	// Navigate to URL
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Right Click by using Actions class      contextClick()
		
	 Actions actions = new Actions(driver);
		
		WebElement btnElement = driver.findElement(By.id("rightClickBtn"));
		actions.contextClick(btnElement).perform();
		Thread.sleep(2000);
		System.out.println("Right Click Perform Successfully");
		
		//Double Click by using actions class  : doubleClick()
		
		WebElement btnElement1 = driver.findElement(By.id("doubleClickBtn"));
		actions.doubleClick(btnElement1).perform();
		Thread.sleep(2000);
		System.out.println("Double Click Performed Successfully");
	
	}

}
