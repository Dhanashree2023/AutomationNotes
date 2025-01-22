package JavaScriptExecuter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollIntoView {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();				
		WebDriver driver = new ChromeDriver();  //Opened Empty browser
		driver.get("https://www.calculator.net/");
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
//		jse.executeScript("window.scrollBy(0,500)");  //scrollvertically down
			
		//Scroll till visibility of element
		WebElement ele = driver.findElement(By.xpath("//a[text() = 'Ideal Weight Calculator']"));
		jse.executeScript("arguments[0].scrollIntoView();",ele);
		
		Thread.sleep(5000);
		
//		WebElement bmi = driver.findElement(By.xpath("//a[text() = 'BMI Calculator']"));
//		jse.executeScript("arguments[0].scrollIntoView();",bmi);
		
	//To scroll down at the bottom of the web page
//		jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
	}

}
