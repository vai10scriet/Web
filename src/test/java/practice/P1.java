package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class P1 {

	public static WebDriver driver;
	public static void main(String args[]) throws Exception
	{
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		String password=getPassword(driver);
		driver.findElement(By.cssSelector("button.go-to-login-btn")).click();
		driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("rahul");
		driver.findElement(By.cssSelector("input[name='inputPassword']")).sendKeys(password);
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		
		
		
	}
	
	public static String getPassword(WebDriver driver) throws InterruptedException

	{
		driver.findElement(By.xpath("//a[text()='Forgot your password?']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		String str=driver.findElement(By.cssSelector("h2~p.infoMsg")).getText();
		String[] st=str.split("'");
		String password=st[1].split(",")[0];
		return password;
		
	}
	
	
}
