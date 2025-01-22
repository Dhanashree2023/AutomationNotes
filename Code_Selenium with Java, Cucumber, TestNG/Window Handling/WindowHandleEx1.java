package WH;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandleEx1 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();			
		driver.get("https://demoqa.com/browser-windows");
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");	
		
		driver.findElement(By.id("windowButton")).click();
		
		/*getWindowHandle(): Returns a unique ID of the current window as a string, 
		which identifies it within the driver instance */
		
		
        String mainwindow = driver.getWindowHandle();
        System.out.println("Main window handle is " + mainwindow);  //get the unique Window ID
        
        /*Set doesn't allow duplicate objects. Since window ids are always unique for each window, 
        we use Set to store them.*/
        
        /*
         getWindowHandles(): Returns the IDs of all windows opened by the web driver as a set
         */
        
        Set<String> bothHandles = driver.getWindowHandles();
        System.out.println("Child window handle is " + bothHandles);  //get the all windows ID
        
  //      Main window handle is C9010E9F2F208B9BCEFDB4B0A59EE579
  //      Child window handle is [C9010E9F2F208B9BCEFDB4B0A59EE579, 81D0C0187782F8C423530BC5685E0C7B]
            
       //use  for each loop to store all window ID into variable
        for(String ChildWindow: bothHandles)
        {         
                if (!mainwindow.equalsIgnoreCase(ChildWindow))  //check id is not equal to main window ID. if its not equal to mainWindow ID, we can switch it to child window
                {  
                driver.switchTo().window(ChildWindow);
           //     System.out.println("Title of window is =:"+driver.getTitle());  // check the title to know correctly switch or not
                WebElement text = driver.findElement(By.id("sampleHeading"));
                Thread.sleep(5000);
                System.out.println("Heading of child window is " + text.getText());
                driver.close();
                System.out.println("Child window closed");
            }          
        }    
        //  Switch back to the main window which is the parent window.
        driver.switchTo().window(mainwindow);
        System.out.println("Title of window is =:"+driver.getTitle());  //check the title of main window 
       	}
		
	}


