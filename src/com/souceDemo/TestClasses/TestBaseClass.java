package com.souceDemo.TestClasses;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Parameters;


import com.souceDemo.POMClasses.LoginPOMClass;

public class TestBaseClass {
	
	
	public WebDriver driver;
	
	Logger log = Logger.getLogger("TestNGSouceDomeProject2");
	
	
	@BeforeMethod
	public void setUp()
	{


		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\Drivers\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		driver = new ChromeDriver(options);
		
		PropertyConfigurator.configure("log4j.properties");
		
		log.info("Browser Open");
		
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		log.info("Site Open");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		LoginPOMClass login = new LoginPOMClass(driver);
		login.SendUserName();
		login.SendPassword();
		login.ClickLoginButton();
		log.info("Successfull Login");
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		log.info("Browser Closed");
	}

}
