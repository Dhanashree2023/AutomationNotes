// How to Handle Authentication Popup
package basicProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class AuthenticationPopup {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();				
		WebDriver driver = new ChromeDriver();  //Opened Empty browser
		
	//	driver.get("https://the-internet.herokuapp.com/basic_auth")
		
		//https://username:password@URL
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		String text = driver.findElement(By.tagName("p")).getText();
		System.out.println("text is = "+text);	
	}
}
