package com.souceDemo.TestClasses;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.souceDemo.POMClasses.AddToCartPOMClass;
import com.souceDemo.POMClasses.HomePOMClass;
import com.souceDomo.UtilityClasses.Screenshot;

public class TC006_VerifyRemoveFromCartFunctionality extends TestBaseClass{

	WebDriver driver;
	
	@Test
	public void verifyRemoveFromCartFunctionality() throws IOException
	{
		HomePOMClass home = new HomePOMClass(driver);
		
		home.clickAddToCartAllItems();
//		log.info("Click all AddToCart Buttons");
		home.clickCartButton();
//		log.info("Click all Cart Buttons");
		
		AddToCartPOMClass add = new AddToCartPOMClass(driver);
		add.clickRemoveButtonInCart();
//		log.info("Click All Remove Button");
		
		Screenshot.takeScreenshot(driver);
		
//		log.info("Apply Validation for All Remove Buttons");
		String expecteditems ="";
		String actualitems = "";
		
		Assert.assertEquals(actualitems, expecteditems);
		
	}
	 
	
	
	
	
}
