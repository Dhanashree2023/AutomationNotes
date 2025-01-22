//Program - how to enter value in the textbox without using sendKeys
//-how to click using JavaScriptExecuter
//-How to scroll down and Up and scroll down till the end & till up
package JavaScriptExecuter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JS_EnterValueInTextBox {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();				
		WebDriver driver = new ChromeDriver();  //Opened Empty browser
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver ;
		js.executeScript("document.getElementById('email').value='ddd'");  // without using sendKeys 
		js.executeScript("document.getElementById('pass').value='abc'");
	
		WebElement button = driver.findElement(By.xpath("//button[@type = 'submit']"));
		 js.executeScript("arguments[0].click();", button);
		
		//scroll vertically down by 600  pixels	
		 //second parameter +ve 
		js.executeScript("window.scrollBy(0,600)");	
		
		Thread.sleep(5000);
		//Scroll up by 200 pixel
		//second parameter -ve
		js.executeScript("window.scrollBy(0,-300)"); // scrolling up by -300
		Thread.sleep(5000);
		
		//This will scroll down the web page till end.		
        js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
        
        Thread.sleep(4000);
        
      //scroll vertically page up
      js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");

		
	}

}
