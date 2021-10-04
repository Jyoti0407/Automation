package com.answerdigital.qa.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.answerdigital.qa.base.TestBase;
import com.answerdigital.qa.pages.CareersPage;
import com.answerdigital.qa.pages.HomePage;
import com.answerdigital.qa.pages.JobApplyPage;
import com.answerdigital.qa.pages.SearchJobPage;


public class CareersPageTest extends TestBase{
	
	
		HomePage homepage;
		CareersPage careersPage;
		SearchJobPage searchjobpage;
				
		public CareersPageTest() throws IOException {
			super();
		}
		
		
		
		@BeforeMethod
		public void setUp() throws Throwable {
			
			initialization();
			homepage=new HomePage();
			careersPage=new CareersPage();
			careersPage= homepage.ClickOnCareersLink();
			
		  }
				
		
		@Test(priority=1)
		public void CareersPageTitleTest() {
			String title=careersPage.validateCareersPageTitle();
			Assert.assertEquals(title, "Answer");
		}
		
			
		
		@Test(priority=2 )
		public void SearchJobLinkTest() throws Throwable {
			
			
			Thread.sleep(3000);
			searchjobpage =careersPage.ClickOnViewallJobsLink();
		 
		}
		
		
		
		@AfterMethod
		public void tearDown() {
			driver.quit();	
		}

}
