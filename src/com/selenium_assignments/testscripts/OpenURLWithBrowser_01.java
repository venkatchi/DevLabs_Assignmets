package com.selenium_assignments.testscripts;


import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;  
	
	public class OpenURLWithBrowser_01 { 
		static WebDriver driver;
		 
	    public static void main(String[] args) throws InterruptedException {  
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hey\\Downloads\\chromedriver_win32\\chromedriver.exe");  
	        driver=new ChromeDriver();  
	        driver.get(" https://opensource-demo.orangehrmlive.com/");


       driver.manage().window().maximize(); 
       
       Thread.sleep(10000);
       driver.close();

    }  

  } 
