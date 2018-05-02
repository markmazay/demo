package com.testcases;

import java.io.FileInputStream;
import java.util.Hashtable;
import java.util.Properties;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
//import org.junit.Assert;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
//import org.junit.Test;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.base.BaseTest;
import com.base.TestBase;
import com.resources.Constants;
import com.resources.P;
import com.resources.TestUtil;
import com.resources.Xls_Reader;
import com.pages.LoginPage;
import com.pages.HomePage;
import com.pages.CommunityPage;


import com.relevantcodes.extentreports.LogStatus;

public class AssignmentTest extends BaseTest{
 	@BeforeSuite
 	public void BeforeSuite() {
 		initConfigurations();
 		getEnvironmentDetails();
  	}
	@BeforeMethod 
	public void init()	{
 		initDriver();
 	}
 	@AfterMethod
 	public void quit()	{
//	 	quitDriver();
 	}
 	@AfterSuite
 	public void closeChromeDriver()	{
 		quitDriver();
 		killChromeDriver();
 	}
	@DataProvider
 	public Object[][] getTestData()	{
 		return TestUtil.getData("AssignmentTest", xlsx);
 	}

 	Xls_Reader xlsx = new Xls_Reader(Constants.testCases);
 	LoginPage login = PageFactory.initElements(driver, LoginPage.class);
 	HomePage home = PageFactory.initElements(driver, HomePage.class);
 	
 	// Login and go to community page
 	@Test(priority=1,dataProvider="getTestData")
 	public void LoginToSite(Hashtable<String,String> data) {
 		if(!TestUtil.isExecutable("AssignmentTest", xlsx) || data.get("Runmode").equals("N"))
 		throw new SkipException("Skipping the test");
		test = rep.startTest("Test Data");
		test.log(LogStatus.INFO, data.toString());
		login.loginToSite();
		home.goToCommunitypage();
 	}	
 	// Get number of answers and views and verify they are numeric
 	@Test(priority=2,dataProvider="getTestData",dependsOnMethods={"LoginToSite"})
 	public void checkNumbersIsNumeric(Hashtable<String,String> data) {
		JOB_NUMBER = new Properties();
		try {
			FileInputStream fs = new FileInputStream(Constants.JOB_NUMBER);
			JOB_NUMBER.load(fs);
		} catch (Exception e) {	e.printStackTrace();
		}
 		CommunityPage comm = PageFactory.initElements(driver, CommunityPage.class);
		comm.checkStringIsNumeric(text(Constants.number_of_answers).replaceAll(" Answers", "").trim());
		comm.addToProps("answers1", text(Constants.number_of_answers).replaceAll(" Answers", "").trim());
		comm.checkStringIsNumeric(text(Constants.number_of_views).replaceAll(" Views", "").trim());
		comm.addToProps("views1", text(Constants.number_of_views).replaceAll(" Views", "").trim());
 	}
 	
 	// Switch to Popular Questions
 	@Test(priority=3,dataProvider="getTestData",dependsOnMethods={"checkNumbersIsNumeric"})
 	public void switchTopopular(Hashtable<String,String> data) {
 		CommunityPage comm = PageFactory.initElements(driver, CommunityPage.class);
 		comm.switchToPopularQuestions();
 	}

 	// Get second set of answers and views
 	@Test(priority=4,dataProvider="getTestData",dependsOnMethods={"switchTopopular"})
 	public void getSecondSet(Hashtable<String,String> data) {
 		CommunityPage comm = PageFactory.initElements(driver, CommunityPage.class);
		comm.addToProps("answers2", text(Constants.number_of_answers).replaceAll(" Answers", "").trim());
		comm.addToProps("views2", text(Constants.number_of_views).replaceAll(" Views", "").trim());
 	}
 	// Verify second set of numbers greater than 1 st
 	@Test(priority=5,dataProvider="getTestData",dependsOnMethods={"getSecondSet"})
 	public void comparenumbers(Hashtable<String,String> data) {
 		JOB_NUMBER = new Properties();
		try {
			FileInputStream fs = new FileInputStream(Constants.JOB_NUMBER);
			JOB_NUMBER.load(fs);
		} catch (Exception e) {	e.printStackTrace();
		} 		
 		CommunityPage comm = PageFactory.initElements(driver, CommunityPage.class);
		comm.verifyPopularGreaterThanResent(JOB_NUMBER.getProperty("answers1"), JOB_NUMBER.getProperty("answers2"));
		comm.verifyPopularGreaterThanResent(JOB_NUMBER.getProperty("views1"), JOB_NUMBER.getProperty("views2"));
 	}
 	
 	
 	// ################################################### Ofcourse you can combine all in one test: ######################################################################################
 	
/* 	@Test(priority=0,dataProvider="getTestData")
 	public void SingleTest(Hashtable<String,String> data) {
 		if(!TestUtil.isExecutable("AssignmentTest", xlsx) || data.get("Runmode").equals("N"))
 		throw new SkipException("Skipping the test");
		test = rep.startTest("Test Data");
		test.log(LogStatus.INFO, data.toString());
		login.loginToSite();
		home.goToCommunitypage();
 		CommunityPage comm = PageFactory.initElements(driver, CommunityPage.class);
		comm.checkStringIsNumeric(text(Constants.number_of_answers).trim());
		comm.addToProps("answers1", text(Constants.number_of_answers).trim());
		comm.checkStringIsNumeric(text(Constants.number_of_views).trim());
		comm.addToProps("views1", text(Constants.number_of_answers).trim());
		comm.switchToPopularQuestions();
		comm.addToProps("answers2", text(Constants.number_of_answers).trim());
		comm.addToProps("views2", text(Constants.number_of_answers).trim());
		comm.verifyPopularGreaterThanResent(JOB_NUMBER.getProperty("answers1"), JOB_NUMBER.getProperty("answers2"));
		comm.verifyPopularGreaterThanResent(JOB_NUMBER.getProperty("views1"), JOB_NUMBER.getProperty("views2"));
 	}	*/

}
