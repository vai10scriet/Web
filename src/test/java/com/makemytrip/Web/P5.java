package com.makemytrip.Web;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class P5 {
	
	public static void main(String args[]) throws IOException
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();  
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	      
	      driver.get("http://omayo.blogspot.com");
	      // identify element
	      WebElement l = driver.findElement(By.id("link1"));
	      l.click();
	      driver.navigate().back();
	     // l.sendKeys("Selenium");
	      l.click();
	
		
	}

}
