package com;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitExample {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();				
		WebDriver driver = new ChromeDriver();  //Opened Empty browser
	
		driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
        wait.until(ExpectedConditions.titleContains("Goo"));
	     wait.until(ExpectedConditions.titleIs("Google"));

	     WebElement search= driver.findElement(By.name("q"));
	     search.sendKeys("India");
	    
	    search.submit();

	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text() = 'India']"))).click();
	    
	
		
	}

}
