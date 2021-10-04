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

public class JobApplyPageTest extends TestBase{
		
		
		HomePage homepage;
		CareersPage careersPage;
		JobApplyPage jobapplyPage;
	 
		
		public JobApplyPageTest() throws IOException {
			super();
		}

		
		@BeforeMethod
		public void setUp() throws Throwable {
			
			initialization();
			jobapplyPage=new JobApplyPage();
			
		  }		
	
		
		@AfterMethod
		public void tearDown() {
			driver.quit();
		
		}

}



