package com.base;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import org.testng.asserts.SoftAssert;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
//import org.openqa.selenium.IOUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
//import com.sun.java_cup.internal.runtime.Scanner;
//import com.sun.javafx.scene.paint.GradientUtils.Point;
//import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;

import com.resources.Constants;
import com.resources.ErrorUtil;
import com.resources.TestUtil;
//import com.resources.Xls_Reader;
import com.resources.Xls_Reader;

import com.resources.ExtentManager;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class BaseTest {

	public ExtentReports rep = ExtentManager.getInstance();
	public ExtentTest test;
	public static Logger APPLICATION_LOGS = null;
	public static Properties CONFIG=null;
	public static WebDriver driver=null;
	public static boolean isLoggedIn=false;
	public static Properties prop=null;
	public static Properties OR_PROPERTIES=null;
	public static Properties TEXT_PROPERTIES=null;
	public static Properties text=null;
	public static Properties JOB_NUMBER=null;
	public static final String browsername = null;
	public static String pagesource = null;
	public static String timestamp = null;
	public static String reactorpassword = null;
	public static String webpushEnvironment = null;
	public static String webpushLoginPageUrlpart2 = null;
	public static String trialEnvironment = null;
	public static String studentrefiurl = null;
	public static String baseUrl = null;
	public static String iosqa = null;
	public static String dob_now_url = null;
	public static String location = null;
	public static String inturnurl = null;
	public static String sCurrentLine;
	public static FileReader fr = null;
	public static BufferedReader txtReader = null;
	public static String exctracted_job_number = null;
	public static String job_number = null;

	Xls_Reader xlsx = new Xls_Reader(Constants.testCases);
	FirefoxProfile ffxprofile = new FirefoxProfile(new File(Constants.firefoxProfile));
	SoftAssert softAssert= new SoftAssert();
	public SoftAssert softAssertion= new SoftAssert();
	
	
	public void initConfigurations() {
		if(CONFIG==null) {
		APPLICATION_LOGS = Logger.getLogger("devpinoyLogger");
		 CONFIG = new Properties();
		try {
			FileInputStream fs = new FileInputStream(Constants.CONFIG_FILE_PATH);
			CONFIG.load(fs);
		} catch (Exception e) {	e.printStackTrace();}
		}
		if(prop==null) {
		APPLICATION_LOGS = Logger.getLogger("devpinoyLogger");
		prop = new Properties();
		try {
			FileInputStream fs = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//com//config//project.properties");
			prop.load(fs);
		} catch (Exception e) {	e.printStackTrace();}
		}
/*		if(OR_PROPERTIES==null) {
		APPLICATION_LOGS = Logger.getLogger("devpinoyLogger");
		OR_PROPERTIES = new Properties();
		try {
			FileInputStream fs = new FileInputStream(Constants.OR_PROPERTIES);
			OR_PROPERTIES.load(fs);
		} catch (Exception e) {	e.printStackTrace();}
		}*/
		if(TEXT_PROPERTIES==null) {
		APPLICATION_LOGS = Logger.getLogger("devpinoyLogger");
		TEXT_PROPERTIES = new Properties();
		try {
			FileInputStream fs = new FileInputStream(Constants.TEXT_PROPERTIES);
			TEXT_PROPERTIES.load(fs);
		} catch (Exception e) {	e.printStackTrace();}
		}
		if(prop==null) {
		APPLICATION_LOGS = Logger.getLogger("devpinoyLogger");
		prop = new Properties();
		try {
			FileInputStream fs = new FileInputStream(Constants.OR_PROPERTIES);
			prop.load(fs);
		} catch (Exception e) {	e.printStackTrace();}
		}
				
		if(CONFIG.getProperty("env").equals("macys")) {
			Xls_Reader xlsx = new Xls_Reader(Constants.testCases);
		}
					

	}
	
	public void initDriver() {
		if(driver==null) {
		if(CONFIG.getProperty("browser").equals("Chrome")){
			System.setProperty("webdriver.chrome.driver", Constants.chromePath);
			ChromeOptions options = new ChromeOptions();
		    options.addArguments("--start-maximized");
			options.addArguments("--disable-extensions");
		    options.addArguments("--disable-web-security");
		    options.addArguments("--no-proxy-server");
		    options.addArguments("--disable-default-apps");
		    options.addArguments("disable-infobars");
		    options.addArguments("test-type");
		    options.addArguments("no-sandbox");
		    options.addArguments("--allow-running-insecure-content");
		    Map<String, Object> prefs = new HashMap<String, Object>();
		    prefs.put("credentials_enable_service", false);
		    prefs.put("profile.password_manager_enabled", false);
//		    options.setExperimentalOptions("prefs", prefs);
			driver = new ChromeDriver(options);
		}
/*		else if(CONFIG.getProperty("browser").equals("Mozilla"))
			driver=new FirefoxDriver(ffxprofile);*/
		else if(CONFIG.getProperty("browser").equals("IE")) {
			DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
			capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
			System.setProperty("webdriver.ie.driver", Constants.iePath);
			driver = new InternetExplorerDriver();
		}

		else if(CONFIG.getProperty("browser").equals("Safari"))
			driver=new SafariDriver();
		}
	}
	
	public static boolean isBrowserOpened=false;
	public void openBrowser(){
	if(!isBrowserOpened){
		if(CONFIG.getProperty("browser").equals("MOZILLA"))
		     driver = new FirefoxDriver();
		else if (CONFIG.getProperty("browser").equals("IE"))
			 driver = new InternetExplorerDriver();
		else if (CONFIG.getProperty("browser").equals("Chrome"))
			 driver = new ChromeDriver();
		
		isBrowserOpened=true;
		String waitTime=CONFIG.getProperty("default_implicitWait");
//		driver.manage().timeouts().implicitlyWait(Long.parseLong(waitTime), TimeUnit.SECONDS);
	}

	}
	
	public void getEnvironmentDetails() {
		if(CONFIG.getProperty("env").equals("demo")) {
			baseUrl = prop.getProperty("base_url");
		}
	}

	public void navigate(String urlKey) {	
		driver.manage().deleteAllCookies();
	    driver.get(urlKey);
 		test = rep.startTest("Test URL");
 		test.log(LogStatus.INFO, "Navigate to  " + urlKey);
	}
	public void wait(int timeToWaitInSec){
		try {
			Thread.sleep(timeToWaitInSec * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void waitForPageToLoad() {
		wait(1);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String state = (String)js.executeScript("return document.readyState");
		while(!state.equals("complete")){
			wait(2);
			state = (String)js.executeScript("return document.readyState");
		}
	}
	public void softAssert(String msg1, String msg2) {
		test.log(LogStatus.FAIL, msg1 + msg2);
 		takeScreenShot();
	}
	
	public boolean verifyText(String locatorKey, String expectedText){
		test = rep.startTest("Verify Text " +expectedText);
		String actualText=getElement(locatorKey).getText().trim();
		if(actualText.equals(expectedText)) {
			test.log(LogStatus.PASS, actualText + " == " + expectedText);
			return true;
		}
		else {
	 		softAssert("Actual: " + actualText, " Expected: " + expectedText);
	 		wait(3);
	 		return false;
		}		
	}
	public WebElement getElement(String locatorKey){
		waitForPageToLoad();
		WebElement e=null;
		try{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			e = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locatorKey)));
//			e = driver.findElement(By.xpath(prop.getProperty(locatorKey)));
		}catch(Exception ex){
			// fail the test and report the error
			reportFailure(ex.getMessage());
			ex.printStackTrace();
			Assert.fail("Failed the test - "+ex.getMessage());
		}
		return e;
	}

/*	public WebElement getElement(String locatorKey) {
		WebElement e = null;
		try{
			waitUntilElementPresent(locatorKey, 30);
//			isElementPresent(locatorKey);
			e = driver.findElement(By.xpath(locatorKey));
		}catch(Exception ex){
			ex.printStackTrace();
			DateFormat dateFormat = new SimpleDateFormat("M-d-HH-mm"); // 12-31 16:20
			timestamp = dateFormat.format(Calendar.getInstance().getTime());
			System.out.println("assertNotification " + locatorKey);
			addVerificationFailure(ex);
			takeScreenShot();
//			takeScreenShot(timestamp + " " + locatorKey);
//			softAssert();
			Assert.fail("Failed"  + ex.getMessage());
		}	
		return e;
	}*/
	public boolean isElementPresent(String locatorKey) {
		List<WebElement> elementList=null;
		elementList=driver.findElements(By.xpath(prop.getProperty(locatorKey)));
		if(elementList.size()==0) {
			reportFailure("isElementPresent - " + locatorKey);
			System.out.println("isElementPresent - fail");
			return false;
		}
		else {
			System.out.println("isElementPresent - is true");
			return true;
		}
	}
	public void click(String locatorKey){
		test.log(LogStatus.INFO, "Clicking on "+locatorKey);
		getElement(locatorKey).click();
	}
	public String text(String locatorKey){
		test.log(LogStatus.INFO, "Getting Text of "+locatorKey);
		String text = getElement(locatorKey).getText();
		return text;
	}
	public void clickAndWait(String locatorKey) {
		test.log(LogStatus.INFO, "clickAndWait " +  getElement(locatorKey).getText());
		getElement(locatorKey).click();
	}
	public void waitAndClick(String locatorKey) {
		test.log(LogStatus.INFO, "waitAndClick " +  getElement(locatorKey).getText());
		getElement(locatorKey).click();
	}
	public void type(String locatorKey,String data){
		test.log(LogStatus.INFO, "Typing in "+locatorKey+" :: "+data);
		getElement(locatorKey).sendKeys(data);
	}
	public void check(String locatorKey) {
		if(!getElement(prop.getProperty(locatorKey)).isSelected()) {
			test.log(LogStatus.INFO, "Checking box " + locatorKey);
			getElement(prop.getProperty(locatorKey)).click();
		}
	}
	public void select(String locatorKey,String data) {
		test.log(LogStatus.INFO, "Selecting button"+locatorKey+". Data - "+data);
		getElement(locatorKey).sendKeys(data);
	}
	public int count(String locatorKey) {
		test.log(LogStatus.INFO, "Number of elements" +locatorKey);
		int num_items = driver.findElements(By.xpath(locatorKey)).size();
		return num_items;
	}
	
	
	String no, yes;
	
	public void reaction(String expected,String actual) {
		if(actual.equals(expected))
			yes = actual + " meet " + expected;
		if(!actual.equals(expected))
		no = actual + " does not meet " + expected;
	}
	

	public void waitForInVisible(String locatorKey) {
		test = rep.startTest("waitForInVisible");
		test.log(LogStatus.INFO, "waitForInVisible");
		waitForPageToLoad();
		try{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(locatorKey)));
		}catch(Throwable t){
			
/*			System.out.println( "THIS IS e.printStackTrace();");
			e.printStackTrace();*/
			
			
			softAssert(locatorKey, "");
			System.out.println(t);
		}
	}
	public void waitForSpinnersInvisible() {
		test.log(LogStatus.INFO, "waitForSpinnersInvisible ");
		waitForInVisible("global_loading_spinner");
		waitForInVisible("global_loading_spinner2");
	}
	
	public void waitUntilElementPresent(String locatorKey, int seconds) {
	new WebDriverWait(driver, seconds).until(ExpectedConditions.presenceOfElementLocated(By.xpath(locatorKey)));
// WebElement myDynamicElement = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(locatorKey)));
	}
	public void waitTime(long waitseconds)	{
		try {
			Thread.sleep(waitseconds);
			} catch (InterruptedException e) {	
				e.printStackTrace();
			}
	}	

	public void quitDriver() {
 		if(driver != null) {
 			driver.quit();
 			driver=null;
 		}
 		if(rep != null) {
 			rep.endTest(test);
 			rep.flush();
 		}
		softAssertion.assertAll();
	}
	public void killChromeDriver() {
		try {
			Runtime.getRuntime().exec("taskkill /F /IM chromedriver.EXE");
			waitTime(1000L);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void takeScreenShot(){
		Date d=new Date();
		String screenshotFile=d.toString().replaceAll(" EST 2018", "").replace(":", "_").replace(" ", "_")+".png";
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile, new File(System.getProperty("user.dir")+"//screenshots//"+screenshotFile));
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(LogStatus.INFO,"FAILURE "+ test.addScreenCapture(System.getProperty("user.dir")+"//screenshots//"+screenshotFile));
	}
	
	public void reportPass(String msg){
		test.log(LogStatus.PASS, msg);
	}
	
	public void reportFailure(String msg){
		test.log(LogStatus.FAIL, msg);
		takeScreenShot();
		Assert.fail(msg);
	}
	
	private static Map<ITestResult,List> verificationFailuresMap = new HashMap<ITestResult,List>();
	
/*	public static void addVerificationFailure(Throwable e) {
		System.out.println("*addVerificationFailure*");
		List verificationFailures = getVerificationFailures();
		verificationFailuresMap.put(Reporter.getCurrentTestResult(), verificationFailures);
		verificationFailures.add(e);
	}

	public static List getVerificationFailures() {
		System.out.println("*getVerificationFailures*");
		List verificationFailures = verificationFailuresMap.get(Reporter.getCurrentTestResult());
		return verificationFailures == null ? new ArrayList() : verificationFailures;
	}*/
	public void loadProps() {
		JOB_NUMBER = new Properties();
		try {
			FileInputStream fs = new FileInputStream(Constants.JOB_NUMBER);
			JOB_NUMBER.load(fs);
		} catch (Exception e) {	e.printStackTrace();
		}
	}

	public void waitUntilVisible(String locatorKey) {
		try{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locatorKey)));
			waitTime(1000L);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locatorKey)));
		}catch(Throwable t){
			System.out.println(t);
			DateFormat dateFormat = new SimpleDateFormat("M-d-HH-mm");
			timestamp = dateFormat.format(Calendar.getInstance().getTime());
			ErrorUtil.addVerificationFailure(t);
			TestUtil.takeScreenShot(timestamp);
			System.out.println("waitUntilElementVisible " + locatorKey);
		}
	}
	public void waitUntilInvisible(String locatorKey) {
		try{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(locatorKey)));
			waitTime(1000L);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(locatorKey)));
		}catch(Throwable t){
			System.out.println(t);
			DateFormat dateFormat = new SimpleDateFormat("M-d-HH-mm");
			timestamp = dateFormat.format(Calendar.getInstance().getTime());
			ErrorUtil.addVerificationFailure(t);
			TestUtil.takeScreenShot(timestamp);
			System.out.println("waitUntilElementInVisible " + locatorKey);
		}
	}
	
	
}
