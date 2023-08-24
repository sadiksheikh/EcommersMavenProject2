package com.souceDemo.TestClasses;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import com.souceDemo.POMClasses.HomePOMClass;
import com.souceDomo.UtilityClasses.Screenshot;


public class TC005_VerifyDropDownFunctionality extends TestBaseClass {

	
	WebDriver driver;
		
	@Test(timeOut=7000)
	public void verifyAtoZDropDownFunctionality() throws IOException
	{
		HomePOMClass home = new HomePOMClass(driver);
		
		home.clickDropDown();
		home.selectNameAtoZ();
//		log.info("Click DropDown and Select A to Z");
		
		home.totalNumberOfDropDownElements();
		home.totalDropDownElementName();
		
		Screenshot.takeScreenshot(driver);
		
		
//		log.info("Apply Validation for DropDown A to Z");
		String expectedresult = "Name (A to Z)";
		String actualresult = home.aToZTextValidation();
//		log.info("ACTUAL RESULT IS - "+actualresult);
		
		Assert.assertEquals(actualresult, expectedresult);
	}
	
	@Test(priority=1)
	public void verifyZtoADropDownFunctionality()
	{
		HomePOMClass home = new HomePOMClass(driver);
		
		home.clickDropDown();
		home.selectZtoA();
//		log.info("Click on DropDown and Select Z to A");
		
//		log.info("Apply Valadation for DropDown Z to A");
		String expectedresult = "Name (Z to A)";
		String actualresult = home.zToAValidation();
//		log.info("ACTUAL RESULT IS - "+actualresult);
		
		Assert.assertEquals(actualresult, expectedresult);
	}
	
	@Test(invocationCount=1)
	public void verifyLowToHighFunctionality()
	{
		HomePOMClass home = new HomePOMClass(driver);
		home.clickDropDown();
		home.selectLowToHigh();
//		log.info("Click DropDown and Select Low to High");
		
//		log.info("Apply Validation for DropDown Low to High");
		String expectedresult ="Price (low to high)";
		String actualresult = home.lowToHighValidation();
//		log.info("ACTUAL RESULT IS - "+actualresult);

		Assert.assertEquals(actualresult, expectedresult);
	}
	
	@Test(enabled=true)
	public void verifyHighToLowFunctionality()
	{
		HomePOMClass home = new HomePOMClass(driver);
		home.clickDropDown();
		home.selectHighToLow();
//		log.info("Click DropDown and Select High to Low");
		
		
//		log.info("Apply Validation for DropDown High to Low");
		String expectedresult = "Price (high to low)";
		String actualresult = home.highToLowValidation();
//		log.info("ACTUAL RESULT IS - "+actualresult);

		Assert.assertEquals(actualresult, expectedresult);
	}
	
	
	
	
	
}
