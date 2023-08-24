package com.souceDemo.TestClasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.souceDemo.POMClasses.HomePOMClass;
import com.souceDomo.UtilityClasses.Screenshot;

public class TC002_VerifyLogoutFunctionality extends TestBaseClass {
	
	WebDriver driver;
	
	@Test
	public void verifyLogoutFunctionality() throws IOException, InterruptedException
	{
		HomePOMClass home = new HomePOMClass(driver);
		
		home.ClickMenuButton();
		log.info("Click Menu Button");
		 
//		Thread.sleep(3000);
		home.clickLogout();
		log.info("Click Logout Button");
		
		Screenshot.takeScreenshot(driver);
		
		log.info("Apply Validation");
		
		String expectedURL = "https://www.saucedemo.com/";
		String actualURL = driver.getCurrentUrl();
		
		Assert.assertEquals(actualURL, expectedURL);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
