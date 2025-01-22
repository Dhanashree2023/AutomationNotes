package Property_File;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Properties_File_Demo {
	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
	//	driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(3000);
		
		Read_Property rs = new Read_Property();
		driver.get(rs.getURL());
		Thread.sleep(3000);
		WebElement username = driver.findElement(By.xpath("//input[@name = 'username']"));
//		username.sendKeys("Admin");
		username.sendKeys(rs.getUsername());
		WebElement password = driver.findElement(By.xpath("//input[@name = 'password']"));
//	    password.sendKeys("admin123");
		password.sendKeys(rs.getPassword());
  		WebElement Login = driver.findElement(By.xpath("//button[@type = 'submit']"));
	   Login.click();		
	}
}
