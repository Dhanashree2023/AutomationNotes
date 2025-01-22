//dragAndDrop
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dragdropEx {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();				
		WebDriver driver = new ChromeDriver();  //Opened Empty browser
     	driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
     	
     	Actions act = new Actions(driver);
     	WebElement source = driver.findElement(By.id("box6"));
    	WebElement destination = driver.findElement(By.id("box106"));
    //	act.dragAndDrop(source, destination).build().perform();
    	
    	act.moveToElement(source).clickAndHold().
    	moveToElement(destination).release().build().perform();
    	  	
    	System.out.println("Drag and drop perform successfully");
    	      	
	}

}
