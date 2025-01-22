package com;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitEx {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();						
		WebDriver driver = new ChromeDriver();
      
        // Launch website
        driver.get("https://www.registration.tools4testing.com/");

        // Click on the Login Button

        driver.findElement(By.id("loginopener")).click();
        
    Wait<WebDriver>wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(12)).pollingEvery(Duration.ofSeconds(2)).ignoring(Exception.class);

          
        // Focus on the dialog window by click on dialog window title

        WebElement loginWindow;
        loginWindow= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ui-id-1']")));
        loginWindow.click();

       

        // Enter user name
        driver.findElement(By.id("loginUsername")).sendKeys("manu.m@tools4testing.com");     
        // Enter user passwor
        driver.findElement(By.id("loginPassword")).sendKeys("hello");    
        // Click on the Login Button
        driver.findElement(By.id("loginButton")).click();

       

        WebElement loginSuccessWindow;
        loginSuccessWindow = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ui-id-3']")));
        loginSuccessWindow.click();

      
        driver.findElement(By.xpath("//*[@id='loginSuccessDialog']/div/span/input")).click();

      
        //close the driver
        driver.quit();	
	}
}
