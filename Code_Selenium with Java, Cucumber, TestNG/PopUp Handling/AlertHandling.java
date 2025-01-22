//Alert Handling
package basicProgram;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();				
		WebDriver driver = new ChromeDriver();  //Opened Empty browser
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");	// Navigate to URL
		driver.manage().window().maximize();
		
		//simple Alert      : OK button click
		WebElement clicksimplealert = driver.findElement(By.xpath("(//button[text() = 'Click me'])[1]"));
		clicksimplealert.click();  //Click Me button click
			
		Alert simpleAlert = driver.switchTo().alert();   // switch to alert popup --
		System.out.println(simpleAlert.getText());  //popup message get
		Thread.sleep(3000);
		simpleAlert.accept();  // click on OK button --
			
		WebElement outputtextmsg = driver.findElement(By.id("output"));
		String output = outputtextmsg.getText();
		System.out.println(output);
		//	System.out.println(driver.findElement(By.id("output")).getText());
		
		//confirmation Alert    OK   and Cancel
		
		WebElement clickconfirmalert = driver.findElement(By.xpath("(//button[text() = 'Click me'])[2]"));
		clickconfirmalert.click();  //Click Me button click
			
		Alert confirmAlert = driver.switchTo().alert();   // switch to alert popup --
		System.out.println(confirmAlert.getText());  //popup message get
		Thread.sleep(3000);
		simpleAlert.dismiss();  // click on cancel button --
			
		WebElement tmsg = driver.findElement(By.id("output"));
		String op = tmsg.getText();
		System.out.println(op);
		
		
		//prompt alert
		WebElement ClickpromptAlert = driver.findElement(By.xpath("(//button[text() = 'Click me'])[3]"));
		ClickpromptAlert.click();  //Click Me button click
		
		Alert promptAlert = driver.switchTo().alert();   // switch to alert popup --
		System.out.println(promptAlert.getText());  //popup message get
		promptAlert.sendKeys("Dhanashree");
		Thread.sleep(3000);
		promptAlert.accept();  // click on accept button --
			
		WebElement outputmsg = driver.findElement(By.id("output"));
		String msg = outputmsg.getText();
		System.out.println( msg);
		
		
		
		
	}
}
