package com.souceDemo.TestClasses;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.souceDemo.POMClasses.HomePOMClass;
import com.souceDomo.UtilityClasses.Screenshot;

public class TC008_VerifyRemoveFromHomeCartFunctionality extends TestBaseClass{
	
WebDriver driver;
	
	@Test
	public void verifyRemoveFunctionality() throws InterruptedException, IOException
	{
		HomePOMClass home = new HomePOMClass(driver);
		
		home.clickAddToCartAllItems();
//		log.info("Click All Item AddToCart Buttons");
		home.clickRemoveButtonHomePage();
//		log.info("Click Remove Buttons On HomePage");
		
		Screenshot.takeScreenshot(driver);
		
//		log.info("Apply Validation for Remove Buttons on Home Page");
		String Expecteritems = "";
		String actualitems = home.removetoCartValidation();
		
		Assert.assertEquals(actualitems, Expecteritems);
		
	}
	
	
	
}
