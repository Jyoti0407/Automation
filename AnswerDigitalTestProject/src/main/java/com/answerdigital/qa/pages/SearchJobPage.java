package com.answerdigital.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.answerdigital.qa.base.TestBase;

public class SearchJobPage extends TestBase {

	
	@FindBy(xpath="//input[@placeholder='Keywords']")
	WebElement keywordfield;
	
	@FindBy(xpath="//input[@placeholder='Location']")
	WebElement locationfield;
	
	@FindBy(xpath="//select[@class='form-control']")
	WebElement mileslist;
	
	@FindBy(xpath="//button[normalize-space()='Search Jobs']")
	WebElement searchbtn;
	
	@FindBy(xpath="//*[@id=\"ResultsPane\"]/div/div[3]/div/div/div/div[2]/div[2]/div/a[2]")
	WebElement ApplyBtn;

	public SearchJobPage() {
		PageFactory.initElements(driver,this);
	
	}
	
	//Checking the title of page
	public String validateSearchPageTitle() {
		
		return driver.getTitle();
	}
	
	//Search the job 
	
	public void verifySearchJobfunctinality(String keyword, String location, String miles) throws InterruptedException {
		

		keywordfield.sendKeys(keyword);
		locationfield.sendKeys(location);
		Select select=new Select(mileslist);
		select.selectByValue(miles);
		searchbtn.click();
		Thread.sleep(5000);

	}
	
	public JobApplyPage ClickOnSearchLink() {
		ApplyBtn.click();
		return new JobApplyPage();
	}
}
