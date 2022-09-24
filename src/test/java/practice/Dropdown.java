package practice;



import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {
	
	public static void main(String args[])
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		WebElement select=driver.findElement(By.id("oldSelectMenu"));
		Select sel=new Select(select);
        List<WebElement> options =sel.getOptions();
        System.out.println("The dropdown options are:");
        Iterator<WebElement> itr= options.iterator();
        while(itr.hasNext())
        {
        	
        	System.out.println(itr.next().getText());
        }
		sel.selectByValue("1");
	}

	
	
	
}
