// Verify that Tooltip text for Sign Up is matches to text "Sign up for Facebook"
//For Tooltip handling we used getAttribute() method
package basicProgram;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Tooltip {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();				
		WebDriver driver = new ChromeDriver();  //Opened Empty browser
		driver.get("https://www.facebook.com/");	// Navigate to URL
		
		String ExpectedTooltip = "Sign up for Facebook";
		
		//getAttribute method - get attribute value 
		//getText method - get text value    
		String actual = driver.findElement(By.xpath("//a[@href = '/reg/']")).getAttribute("title");
		System.out.println(actual);
		
		if(actual.equalsIgnoreCase(ExpectedTooltip))
		{
			System.out.println("Test Pass");
		}
		else
		{
			System.out.println("Test fail");
		}
	}
}
