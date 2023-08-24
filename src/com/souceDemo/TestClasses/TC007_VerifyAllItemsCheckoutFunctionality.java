package com.souceDemo.TestClasses;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.souceDemo.POMClasses.AddToCartPOMClass;
import com.souceDemo.POMClasses.HomePOMClass;
import com.souceDomo.UtilityClasses.Screenshot;

public class TC007_VerifyAllItemsCheckoutFunctionality extends TestBaseClass{

WebDriver driver;
	
	@Test
	public void verifyCheckOutFunctionality() throws IOException, InterruptedException
	{
		HomePOMClass home = new HomePOMClass(driver);
		home.clickAddToCartAllItems();
		home.clickCartButton();
//		log.info("Click All AddToCart Buttons and move to Cart");
		
		AddToCartPOMClass add = new AddToCartPOMClass(driver);
		add.clickCheckoutButton();
//		log.info("Click Checkout Button");
		
		add.sendFirstName();
		add.sendLastName();
		add.sendPinCode();
//		log.info("Fill All Informations");
		
		add.clickContinueButton();
//		log.info("Click Continue Button");
		
		add.clickFinishButton();
//		log.info("Click Finish Button");
		
//		Thread.sleep(4000);
		Screenshot.takeScreenshot(driver);
		
//		log.info("Apply Validation for Check Out Functionality");
		String expectedresult ="https://www.saucedemo.com/checkout-complete.html";
		String actualresult = driver.getCurrentUrl();
		
		Assert.assertEquals(actualresult, expectedresult);
		
	}
	

	
	
	
	
}