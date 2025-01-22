package com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiSelectdropdownEX {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();				
		WebDriver driver = new ChromeDriver();  //Opened Empty browser
		driver.get("https://testuserautomation.github.io/DropDown/");	// Navigate to URL
		
		driver.manage().window().maximize();
		
//		List<WebElement> option1 = driver.findElements(By.xpath("//Select[@name = 'Bills']/option"));
//		System.out.println(option1.size());  //how many elements in your list
		
		Select selectelement = new Select(driver.findElement(By.xpath("//Select[@name = 'Bills']")));
		
		//Find the options present in the dropdown menu
        List<WebElement> options = selectelement.getOptions();
        System.out.println(options.size());

        //print
        for (WebElement e : options) {
            System.out.println("The values are " + e.getText());
        }
        
      //isMultiple
        Boolean bool1=selectelement.isMultiple();
        System.out.println(bool1);

        //select
        //selectByIndex
        selectelement.selectByIndex(1);
        //selectByValue()
        selectelement.selectByValue("Food");
        //selectByVisibleText
        selectelement.selectByVisibleText("DebitCard");
        
        
      //first selected value
        System.out.println(selectelement.getFirstSelectedOption().getText());

        //deselect
        Thread.sleep(2000);
        selectelement.deselectByIndex(1);
        //deselectbyvalue
        selectelement.deselectByValue("Food");
        //deselectbyvisibletext
      selectelement.deselectByVisibleText("DebitCard");
      
	}

}
