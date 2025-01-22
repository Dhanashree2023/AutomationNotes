//How to highlight text box
package JavaScriptExecuter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JS_HighlightTextBox {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
	//Way -1 
	//	jse.executeScript("document.getElementById('email').style.background = 'yellow';"); //make Highlight
		
		//Way - 2
		WebElement email = driver.findElement(By.id("email"));
		jse.executeScript("arguments[0].setAttribute('style','background:yellow');",email);
	}

}
