package com.souceDomo.UtilityClasses;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	
	
	public static void takeScreenshot(WebDriver driver) throws IOException
	{
		Date d = new Date();
		DateFormat d1 = new SimpleDateFormat("MM-dd-yy & HH-mm-ss");
		String date = d1.format(d);
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File selenium = ts.getScreenshotAs(OutputType.FILE);
		File myfile = new File("C:\\ScreenShot of Selenium\\"+date+".jpg");
		FileHandler.copy(selenium, myfile);
	}


}
