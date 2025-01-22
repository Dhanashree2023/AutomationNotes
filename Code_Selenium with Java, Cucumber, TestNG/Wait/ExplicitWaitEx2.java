package basicProgram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitEx2 {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();				
		WebDriver driver = new ChromeDriver();  //Opened Empty browser
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");	// Navigate to URL
		
		WebElement startButton = driver.findElement(By.id("btn1"));
        startButton.click();
        
        // Set up an explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement textElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txt1")));
        
        textElement.sendKeys("hello");
       
	}

}
