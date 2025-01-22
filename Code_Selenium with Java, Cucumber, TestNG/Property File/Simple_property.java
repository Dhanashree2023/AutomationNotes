package Property_File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Simple_property {
	public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		//String path = "C:\\Users\\Amol\\eclipse-workspace_2\\Interview\\src\\main\\java\\Property_File\\config.properties";	
		String path = "src/main/java/Property_File/config.properties";	
		Properties prop=new Properties();  // step 1 - create the object of properties class
		prop.load(new FileInputStream(path));	//load
		driver.get(prop.getProperty("url"));
		Thread.sleep(3000);
		
		 driver.findElement(By.xpath("//input[@name = 'username']")).sendKeys(prop.getProperty("username"));	
		driver.findElement(By.xpath("//input[@name = 'password']")).sendKeys(prop.getProperty("password"));	
		driver.findElement(By.xpath("//button[@type = 'submit']")).click();	
	}
}
