package com.answerdigital.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.answerdigital.qa.base.TestBase;
import com.answerdigital.qa.pages.CareersPage;
import com.answerdigital.qa.pages.HomePage;
import com.answerdigital.qa.pages.ServicesPage;


public class HomePageTest extends TestBase {
	HomePage homepage;
	ServicesPage servicespage;
	CareersPage careersPage;

	
	
	public HomePageTest() throws IOException {
		super();
	}

	
	@BeforeMethod
	public void setUp() throws Throwable {
		
		initialization();
		homepage = new HomePage();
		servicespage = new ServicesPage();
		careersPage = new CareersPage();
		
		 
	}
	
	@Test(priority=1)
	public void HomePageTitleTest() {
		String title=homepage.validateHomePageTitle();
		Assert.assertEquals(title, "Answer");
	}
	
	
	@Test(priority=2)
	public void AnswerDigitalLogoImageTest() {
		boolean flag=homepage.validateAnswerDigitalLogoImage();
		Assert.assertTrue(flag);	
	}
	
	
	@Test(priority=3)
	public void VerifyOurServicesLinkTest() {
		
		servicespage=homepage.ClickOnServicesLink();	
	}
	
	
	@Test(priority=4)
	public void VerifyCareerLinkTest() {
		
		careersPage= homepage.ClickOnCareersLink();
	}
	
	@AfterMethod 
	public void tearDown(){ 
		driver.quit();
	}
}


	
	
	

