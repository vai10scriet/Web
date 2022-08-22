package com.makemytrip.Web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	
	WebDriver driver;
	
	@FindBy(name="uid")
	WebElement username; 
	
	
	@FindBy(name="password")
	WebElement userpassword;
	
	@FindBy(className="barone")
	WebElement titleTxt;
	
	@FindBy(name="btnLogin")
	WebElement login;
	
	
	
	


	public Login(WebDriver driver) {
		this.driver=driver;
		
	}




	public void setUsername(String strusername)
	{
		
		username.sendKeys(strusername);
		
	}
	
	public void setUserPassword(String strpassword)
	{
		
		userpassword.sendKeys(strpassword);
		
	}
	
	public void clickLogin()
	{
		
		login.click();
	}
	
	public String getLoginTitle()
	{
		return titleTxt.getText();
		
	}
	
	
	public void LoginToSite(String strusername,String strpassword)
	{
		
		this.setUsername(strusername);
		this.setUserPassword(strpassword);
		this.clickLogin();
		
	}
}
