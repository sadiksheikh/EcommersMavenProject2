package com.souceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOMClass {
	
	public WebDriver driver;
	

	@FindBy(xpath="//input[@id='user-name']")
	private WebElement username;
	
	public void SendUserName()
	{
		username.sendKeys("standard_user");
	}
	
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement password;
	
	public void SendPassword()
	{
		password.sendKeys("secret_sauce");
	}
	
	
	@FindBy(xpath="//input[@id='login-button']")
	private WebElement loginbutton;
	
	public void ClickLoginButton()
	{
		loginbutton.click();
	}
	
	
	public LoginPOMClass(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	
	
	
	
	
}
