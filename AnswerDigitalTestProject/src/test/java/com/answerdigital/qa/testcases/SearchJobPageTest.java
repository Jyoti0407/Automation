package com.answerdigital.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.answerdigital.qa.base.TestBase;
import com.answerdigital.qa.pages.CareersPage;
import com.answerdigital.qa.pages.HomePage;
import com.answerdigital.qa.pages.JobApplyPage;
import com.answerdigital.qa.pages.SearchJobPage;

public class SearchJobPageTest extends TestBase {
	
	SearchJobPage searchjobpage;
	JobApplyPage jobapplypage;
	
	
	public SearchJobPageTest() throws IOException {
		super();
	}

	
	  @BeforeMethod
	  public void setUp() throws Throwable {
		
		initialization();
		driver.get("https://careers.answerdigital.com/");
		searchjobpage =new SearchJobPage();
		jobapplypage = new JobApplyPage();
		
	  }
	  
	  
	  @Test(priority=1)
	  public void searchPageTitleTest() {
		  searchjobpage.validateSearchPageTitle();
		  String title=searchjobpage.validateSearchPageTitle();
			Assert.assertEquals(title, "Careers | Answer Digital Careers");
	  }
	  
	  @Test(priority=2)
	  public void searchJobTest() throws Throwable {
		  searchjobpage.verifySearchJobfunctinality("Java Developer","leeds" , "25");
		  jobapplypage=searchjobpage.ClickOnSearchLink();
		  Thread.sleep(4000);
		  jobapplypage.verifyJobApplyPageDataEntry("Tom", "Peter", "peter123@xyz.com", "9876543122", "No","Centralstreet", "Essex","West Sussex" ,"United Kingdom","HQ1 3WR");

	  }
	  

		@AfterMethod
		public void tearDown() {
			driver.quit();
		}
}
