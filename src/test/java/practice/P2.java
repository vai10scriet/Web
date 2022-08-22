package practice;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class P2 {

	public static WebDriver driver;
	public static void main(String args[])
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		String[] names= {"Cucumber","Brocolli"};
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
		
	     for(int i=0;i<products.size();i++)
	     {
	    	 
	    	 String[] name=products.get(i).getText().split("-");
	    	 String formattedName=name[0].trim();
	    	
	    	 {
	    		 List itemsNeed=Arrays.asList(names);
	    		 if(itemsNeed.contains(formattedName))
	    		 {
	    			 
	    			 driver.findElements(By.cssSelector("div.product-action>button")).get(i).click();
	    			 
	    		 }
	    		System.out.println(formattedName);
	    		 
	    	 }
	    	 
	     }
		
		
	}
	
}
