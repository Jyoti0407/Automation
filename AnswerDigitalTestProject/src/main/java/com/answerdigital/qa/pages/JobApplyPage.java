package com.answerdigital.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.answerdigital.qa.base.TestBase;

public class JobApplyPage extends TestBase {
	
	//Defining Page factory for Jobapply page webelements
	
	
	@FindBy(name="ApplicantFirstName")
	WebElement firstname;
	
	@FindBy(name="ApplicantSurname")
	WebElement lastname;
	
	
	@FindBy(name="ApplicantEmail")
	WebElement email;
	
	@FindBy(name="ApplicantMobile")
	WebElement mobileNo;
	
    @FindBy(xpath="//select[@name='InternalApplicant']")
	WebElement question;
    
    @FindBy(xpath="//div[@class='application-dropzone dz-clickable']")
   	WebElement upload;
	
	@FindBy(name="ApplicantStreet")
	WebElement address;
	
	@FindBy(name="ApplicantMunicipality")
	WebElement city;
	
	@FindBy(name="ApplicantRegion")
	WebElement county;
	
	@FindBy(name="ApplicantCountry")
	WebElement country;
	
	@FindBy(name="ApplicantPostcode")
	WebElement postcode;
	
	@FindBy(id="btnCreateApplication")
	WebElement next;
	
	
	
	public JobApplyPage() {
		PageFactory.initElements(driver,this);
		
		
}


	public void verifyJobApplyPageDataEntry(String fname, String lname, String mail, String mobno, String selection ,String addr, String city1,String county1, String country1, String pcode) throws InterruptedException {
		 
		 firstname.sendKeys(fname);
		 
		 lastname.sendKeys(lname);
		 
		 email.sendKeys(mail);
		 
		 mobileNo.sendKeys(mobno);
		 
		 Select select0=new Select(question);
		 select0.selectByVisibleText(selection);
		 
		 address.sendKeys(addr); 
		 
		 city.sendKeys(city1); 
		 
		 Select select1=new Select(county);
		 select1.selectByVisibleText(county1); 
		 
		 Select select2=new Select(country);
		 select2.selectByVisibleText(country1);
		 
		 postcode.sendKeys(pcode);
		 
		
		Thread.sleep(5000);
		
	}  

}
