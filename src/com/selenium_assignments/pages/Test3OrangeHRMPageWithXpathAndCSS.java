package com.selenium_assignments.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Test3OrangeHRMPageWithXpathAndCSS {

	
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"txtUsername\"]")
	WebElement userNameWithXpath;
	
	@FindBy(css="#txtUsername")
	WebElement userNameWithCSS;
	
	@FindBy(xpath="//*[@id=\"txtPassword\"]")
	WebElement passwordWithXpath;
	
	@FindBy(css="#txtPassword")
	WebElement passwordWithCSS;
	
	@FindBy(xpath="//*[@id=\"forgotPasswordLink\"]/a")
	WebElement ForgotPasswordWithXpath;
	
	@FindBy(css="#forgotPasswordLink > a")
	WebElement ForgotPasswordWithCSS;
	
	@FindBy(xpath="//*[@id=\"footer\"]/div[1]/a")
	WebElement FooterLinkWithXpath;
	
	@FindBy(css="#footer > div:nth-child(1) > a")
	WebElement FooterLinkWithCSS;
	
	@FindBy(xpath="//*[@id=\"divLogo\"]/img")
	WebElement LogoIMGWithXpath;
	
	@FindBy(css="#divLogo > img")
	WebElement LogoIMGWithCSS;
	
	@FindBy(xpath="//*[@id=\"social-icons\"]/a[2]/img")
	WebElement FooterImageFBWithXpath;
	
	@FindBy(css="#social-icons > a:nth-child(2) > img")
	WebElement FooterImageFBWithCSS;

	public Test3OrangeHRMPageWithXpathAndCSS(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	public boolean CheckUserNameWithXpathDisplayed() {
		System.out.println("calling pf method");
		return userNameWithXpath.isDisplayed();
	}
	
	public boolean CheckUserNamWithCSSDisplayed() {	
		return userNameWithCSS.isDisplayed();
	}
	
	
	
	public boolean CheckPasswordWithXpathDisplayed() {	
		return passwordWithXpath.isDisplayed();
	}
	
	public boolean CheckPasswordWithCSSDisplayed() {	
		return passwordWithCSS.isDisplayed();
	}
	
	
	public boolean CheckForgotPasswordWithXpathDisplayed() {	
		return userNameWithXpath.isDisplayed();
	}
	
	public boolean CheckForgotPasswordWithCSSDisplayed() {	
		return userNameWithCSS.isDisplayed();
	}
	
	
	public boolean CheckFooterLinkWithXpathDisplayed() {	
		return FooterLinkWithXpath.isDisplayed();
	}
	
	public boolean CheckFooterLinkWithCSSDisplayed() {	
		return FooterLinkWithCSS.isDisplayed();
	}
	
	
	public boolean CheckLogoImageWithXpathDisplayed() {	
		return LogoIMGWithXpath.isDisplayed();
	}
	
	public boolean CheckLogoImageWithCSSDisplayed() {	
		return LogoIMGWithCSS.isDisplayed();
	}
	
	
	
	
	public boolean CheckFooterImageFBWithXpathDisplayed() {	
		return FooterImageFBWithXpath.isDisplayed();
	}
	
	public boolean CheckFooterImageFBWithCSSDisplayed() {	
		return FooterImageFBWithCSS.isDisplayed();
	}
	
	
	
}