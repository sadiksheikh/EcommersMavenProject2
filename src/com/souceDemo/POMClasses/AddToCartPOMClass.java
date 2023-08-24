package com.souceDemo.POMClasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPOMClass {
	
	WebDriver driver;
	
	
	@FindBy(xpath= "//button[@id='continue-shopping']")
	private WebElement continueshoping;
	
	public void clickContinueShopingButten()
	{
		continueshoping.click();
	}
	
	
	@FindBy(xpath="//button[@id='checkout']")
	private WebElement checkout;
	
	public void clickCheckoutButton()
	{
		checkout.click();
	}
	
	@FindBy(xpath="//button[@class='btn btn_secondary btn_small cart_button']")
	private List<WebElement> remove;
	
	public void clickRemoveButtonInCart()
	{
		for(WebElement click : remove)
		{
			click.click();
		}
	}
	
	
	@FindBy(xpath="(//input[@class='input_error form_input'])[1]")
	private WebElement firstname;
	
	public void sendFirstName()
	{
		firstname.sendKeys("Sadik");
	}
	
	@FindBy(xpath="(//input[@class='input_error form_input'])[2]")
	private WebElement lastname;
	
	public void sendLastName()
	{
		lastname.sendKeys("Sheikh");
	}
	
	@FindBy(xpath="(//input[@class='input_error form_input'])[3]")
	private WebElement pincode;
	
	public void sendPinCode()
	{
		pincode.sendKeys("445302");
	}
	
	
	@FindBy(xpath= "//input[@class='submit-button btn btn_primary cart_button btn_action']")
	private WebElement continuebutton;
	
	public void clickContinueButton()
	{
		continuebutton.click();
	}
	
	
	@FindBy(xpath = "//button[@id='cancel']")
	private WebElement cancel;
	
	public void clickCancelButton()
	{
		cancel.click();
	}
	
	
	@FindBy(xpath = "//button[@id='finish']")
	private WebElement finish;
	
	public void clickFinishButton()
	{
		finish.click();
	}
	
	
	@FindBy(xpath="//button[@name='back-to-products']")
	private WebElement backhome;
	
	public void clickBackHomeButton()
	{
		backhome.click();
	}
	
	
	
	
	public AddToCartPOMClass(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
