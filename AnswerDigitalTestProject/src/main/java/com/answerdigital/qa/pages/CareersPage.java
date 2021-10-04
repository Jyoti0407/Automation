package com.answerdigital.qa.pages;

import org.openqa.selenium.support.PageFactory;

import com.answerdigital.qa.base.TestBase;


public class CareersPage extends TestBase{
	

	public CareersPage() {
		PageFactory.initElements(driver,this);

}
	
//Below are the actions to check the career page title to ensure whether it landed on correct page
	
public String validateCareersPageTitle() {
	
	return driver.getTitle();
	
}


  public SearchJobPage ClickOnViewallJobsLink() {

		 return new SearchJobPage();
  }
	  


}