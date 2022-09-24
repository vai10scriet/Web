package practice;




import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Optionsclick {
	
	public static void main(String args[])
	{
//comment
		Manager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/index.htm");
		JavascriptExecutor j = (JavascriptExecutor)driver;
		j.executeScript ("document.getElementById('search-strings').value='Selenium'");
		//driver.findElement(By.id("search-strings")).sendKeys("india");
		
	}
	
	
	

}
