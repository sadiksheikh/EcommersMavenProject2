package com.souceDemo.TestClasses;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.souceDomo.UtilityClasses.Screenshot;

public class TC001_VerifyLoginFunctionality extends TestBaseClass{
	
	
	@Test
	public void verifyLoginFunctionality() throws IOException
	{
		Screenshot.takeScreenshot(driver);
		
		log.info("Apply Validation");
		
		String expectedURL = "https://www.saucedemo.com/inventory.html";
		String actualURL = driver.getCurrentUrl();
		
		Assert.assertEquals(actualURL, expectedURL);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
