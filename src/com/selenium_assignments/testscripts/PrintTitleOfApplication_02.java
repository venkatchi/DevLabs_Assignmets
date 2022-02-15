package com.selenium_assignments.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintTitleOfApplication_02 {

	    public static void main(String[] args) {  
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hey\\Downloads\\chromedriver_win32\\chromedriver.exe");  
	        WebDriver driver=new ChromeDriver();  
	        driver.get(" https://opensource-demo.orangehrmlive.com/");
	        String Title="OrangeHRM";
	        System.out.println("Given title is: "+Title);
	        
	      String title=  driver.getTitle();
	      System.out.println("Title of the page: "+title);
	      if(title.contentEquals(Title)) {
	    	  System.out.println("Both titles are matched and test case passed");
	      }
	      else
	    	  System.out.println("Titles are not matched and test case failed");
	        

       driver.manage().window().maximize(); 
       driver.close();
       
       

    }  

  } 
