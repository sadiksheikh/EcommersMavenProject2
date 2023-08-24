package com.souceDemo.TestClasses;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.souceDemo.POMClasses.HomePOMClass;
import com.souceDomo.UtilityClasses.Screenshot;

public class TC003_VerifyAddTocartFunctionality extends TestBaseClass{
	
	WebDriver driver;

	@Test
	public void verifyAddToCartFunctionality() throws InterruptedException, IOException
	{
		HomePOMClass home = new HomePOMClass(driver);
		
		home.clickAddToCartAllItems();
//		log.info("Click All Add to Cart Button");
		
		Screenshot.takeScreenshot(driver);
		
//		log.info("Apply Validation");
		String expecteditem = "6";
		String actualitem = home.addToCartValidation();
		
		Assert.assertEquals(actualitem, expecteditem);
//		Thread.sleep(5000);
	}
	
	
	
	
	
	
	
	
	
	
	
}
