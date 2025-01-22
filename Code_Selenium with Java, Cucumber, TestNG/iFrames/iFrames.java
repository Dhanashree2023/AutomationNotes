package basicProgram;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class iFrames {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();				
		WebDriver driver = new ChromeDriver();  //Opened Empty browser
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");	// Navigate to URL		
		driver.manage().window().maximize();
		
		//count iframes
		 List<WebElement> iframes = driver.findElements(By.tagName("iframe"));	
		System.out.println("total iframes="+iframes.size());
		
	   driver.findElement(By.id("name")).sendKeys("hello");
	   
	   //how to switch to the iframes  // by using id/name
	   driver.switchTo().frame("frm1");
	   
	   WebElement dropdown = driver.findElement(By.id("selectnav1"));
	   dropdown.click();
	   
	   Select se = new Select(dropdown);
	   se.selectByVisibleText("-- Selenium");
	   System.out.println("Selected dropdown under frame 1");
	   
	   driver.switchTo().defaultContent(); 
	   System.out.println("go to the main web Page");
	   
	   driver.findElement(By.id("name")).clear();
	   driver.findElement(By.id("name")).sendKeys("Main Web Page");
	   
	   
	   //frame 3   //switch to iframe by using WebElement
	   WebElement frame = driver.findElement(By.xpath("//iframe[@id = 'frm3']"));
	   driver.switchTo().frame(frame);
	   System.out.println("Go to the frame 3");
	   
//	   driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id = 'frm1']")));
	   
	   //frame 1
	   driver.switchTo().frame("frm1");
	   System.out.println("go to the frame 1 under frame 3");
	   
	   //dropdown
	   WebElement dropdown1 = driver.findElement(By.id("selectnav1"));
	   dropdown1.click();
	   
	   Select se1 = new Select(dropdown1);
	   se1.selectByVisibleText("Tutorials");
	   System.out.println("Selected dropdown under frame 1");
	   	   
	   //parent frame
	   driver.switchTo().parentFrame();
	   
	   //main web page
	   driver.switchTo().defaultContent();
	   
	   driver.findElement(By.id("name")).clear();
	   driver.findElement(By.id("name")).sendKeys("Again Main Web Page");
	  	   
	 //  driver.close();

	}

}
