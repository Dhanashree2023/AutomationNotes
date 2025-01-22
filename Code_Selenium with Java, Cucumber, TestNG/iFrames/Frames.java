package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();			
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");	
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("name")).sendKeys("Hello");
		
		//How to get total number of frames on a webpage?
		List<WebElement> iframes = driver.findElements(By.tagName("iframe"));
		System.out.println("Total number of iFrames are:" +iframes.size());
		
		// Switch to frame using WebElement
		WebElement frameElement = driver.findElement(By.id("frm3"));   
        driver.switchTo().frame(frameElement);
        
        // Switch to frame using ID
        driver.switchTo().frame("frm1");
		
		Select course = new Select(driver.findElement(By.id("selectnav1")));
		course.selectByVisibleText("Tech News");
		
		// To move back to the parent frame, you can either use switchTo().parentFrame() 
		driver.switchTo().parentFrame();
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys("Frame Handling");  //frame 3
		
		//if you want to get back to the main (or most parent) frame, you can use switchTo().defaultContent();
		driver.switchTo().defaultContent();
		driver.findElement(By.id("name")).sendKeys("Main Web Page");				
	}
}
