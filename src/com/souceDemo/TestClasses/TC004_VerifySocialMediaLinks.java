package com.souceDemo.TestClasses;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.souceDemo.POMClasses.HomePOMClass;
import com.souceDomo.UtilityClasses.Screenshot;

public class TC004_VerifySocialMediaLinks extends TestBaseClass {
	
	WebDriver driver;

	@Test
	public void verifyFaceBookLink() throws InterruptedException, IOException
	{
		HomePOMClass home = new HomePOMClass(driver);
		
		home.clickFacebookLink();
//		log.info("Click On FaceBook Link");
//		Thread.sleep(5000);
		
		List <String> alladdress = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(alladdress.get(1));
		
		Screenshot.takeScreenshot(driver);
		
//		log.info("Apply Validation for FaceBook");
		String expectedURL = "https://www.facebook.com/saucelabs";
		String actualURL = driver.getCurrentUrl();
		
		Assert.assertEquals(actualURL, expectedURL);
		
	}
	
	@Test
	public void verifyLinkedInLink()
	{
		
		HomePOMClass home = new HomePOMClass(driver);
		
		home.clickLinkedLink();
//		log.info("Click On LinkedIN Link");
		List <String> allpage = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(allpage.get(1));
		
//		log.info("Apply Validation for LinkedIn");
		String expectedURL ="https://www.linkedin.com/company/sauce-labs/";
		String actualURL = driver.getCurrentUrl();
		
		Assert.assertEquals(actualURL, expectedURL);	
	}
	
	@Test
	public void verifyTweeterLink()
	{
		HomePOMClass home = new HomePOMClass(driver);
		home.clickTwitterLink();
//		log.info("Click On Tweeter Link");
		
		List <String> allpage = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(allpage.get(1));
		
//		log.info("Apply Validation for Tweeter" );
		String expectedURL = "https://twitter.com/saucelabs";
		String actualURL = driver.getCurrentUrl();
		
		Assert.assertEquals(actualURL, expectedURL);
		
	}
	

	
	
	
	
	
	
	
	
}
