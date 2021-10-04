package com.answerdigital.qa.pages;

import com.answerdigital.qa.base.TestBase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase{
	
	
	//Defining Page Factory or Object Repository for HomePage Tabs(Webelements)
	
	@FindBy(xpath="//h1[@class='Header__HeaderLogo-sc-1l4udr0-4 dnXTHh']//a//*[name()='svg']")
	WebElement AnswerLogo;
	
	@FindBy(xpath="//span[normalize-space()='Services']")
	WebElement ServicesTab;
	
	@FindBy(xpath="//span[normalize-space()='Careers']")
	WebElement CareerTab;
	
	@FindBy(xpath="//span[@class='textStyles__BlockText-hx1ito-0 fwfTQf']")
	WebElement viewallJobstab;
		
	
	
	//Initialising the page object:
	
	public HomePage() {
		
					
			PageFactory.initElements(driver,this);
			
	}
	
		
	public String validateHomePageTitle() {
		
		return driver.getTitle();
		
	}
	
	public boolean validateAnswerDigitalLogoImage() {
		
		return AnswerLogo.isDisplayed();
		
	}
	
	
    public boolean validateServiceImage() {
		
		return ServicesTab.isDisplayed();
		
	}
    
    public ServicesPage ClickOnServicesLink() {
    	ServicesTab.click();
    	return new ServicesPage();
    	
    }
    
    
     public CareersPage ClickOnCareersLink() {
    	 
    	 CareerTab.click();
    	 return new CareersPage();
     }


     }
 
