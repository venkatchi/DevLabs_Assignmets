package com.selenium_assignments.testscripts;

import java.io.FileInputStream;
import java.util.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.selenium_assignments.pages.Test3OrangeHRMPageWithXpathAndCSS;



public class XapthAndCSSOfLogin_03 {
	public WebDriver driver;
	//static Test3OrangeHRMPageWithXpathAndCSS OrangeOR;

	
	
	@BeforeTest
	public void OpenUrlWithBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hey\\Downloads\\chromedriver_win32\\chromedriver.exe");  
	    driver=new ChromeDriver();  
	    driver.get(" https://opensource-demo.orangehrmlive.com/");
	    driver.manage().window().maximize();
	}
	@Test
	public void PrintTitle() {
		// Text Boxes
		Test3OrangeHRMPageWithXpathAndCSS OrangeOR = new Test3OrangeHRMPageWithXpathAndCSS(driver);
		//System.out.println("error in code");
		Assert.assertTrue(OrangeOR.CheckUserNameWithXpathDisplayed());
		//System.out.println("error in code in line2");
		Reporter.log("Log In Page - Object Indentification - User Name with Xpath - Passed", true);
		//System.out.println("error in code in line 3");
		Assert.assertTrue(OrangeOR.CheckUserNamWithCSSDisplayed());
		Reporter.log("Log In Page - Object Indentification - User Name with CSS - Passed", true);
		
		Assert.assertTrue(OrangeOR.CheckPasswordWithXpathDisplayed());
		Reporter.log("Log In Page - Object Indentification - password with Xpath - Passed", true);
		Assert.assertTrue(OrangeOR.CheckPasswordWithCSSDisplayed());
		Reporter.log("Log In Page - Object Indentification - password with CSS - Passed", true);
		
		// hyperlinks
		Assert.assertTrue(OrangeOR.CheckForgotPasswordWithXpathDisplayed());
		Reporter.log("Log In Page - Object Indentification - Forgot password Link with Xpath - Passed", true);
		Assert.assertTrue(OrangeOR.CheckForgotPasswordWithCSSDisplayed());
		Reporter.log("Log In Page - Object Indentification - Forgot password Link with CSS - Passed", true);
		
		Assert.assertTrue(OrangeOR.CheckFooterLinkWithXpathDisplayed());
		Reporter.log("Log In Page - Object Indentification - Footer Link with Xpath - Passed", true);
		Assert.assertTrue(OrangeOR.CheckFooterLinkWithCSSDisplayed());
		Reporter.log("Log In Page - Object Indentification - Footer Link with CSS - Passed", true);
		
		// Images
		Assert.assertTrue(OrangeOR.CheckLogoImageWithXpathDisplayed());
		Reporter.log("Log In Page - Object Indentification - Logo Image with Xpath - Passed", true);
		Assert.assertTrue(OrangeOR.CheckLogoImageWithCSSDisplayed());
		Reporter.log("Log In Page - Object Indentification - Logo Image with CSS - Passed", true);
		
		Assert.assertTrue(OrangeOR.CheckFooterImageFBWithXpathDisplayed());
		Reporter.log("Log In Page - Object Indentification - FB Image with Xpath - Passed", true);
		Assert.assertTrue(OrangeOR.CheckFooterImageFBWithCSSDisplayed());
		Reporter.log("Log In Page - Object Indentification - FB Image with CSS - Passed", true);
		
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}
}
