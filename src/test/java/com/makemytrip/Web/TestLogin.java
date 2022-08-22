package com.makemytrip.Web;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestLogin {
	
	WebDriver driver;
	Login objLogin;
	@BeforeTest()
	public void setup()
	{
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/V4/");
	}
	
	@Test
	public void verify_login()
	{
		objLogin=PageFactory.initElements(driver, Login.class);
	
	String str=objLogin.getLoginTitle();
	Assert.assertTrue(str.toLowerCase().contains("guru99 bank"));
	objLogin.LoginToSite("mgr123", "mgr!23");
	}

}
