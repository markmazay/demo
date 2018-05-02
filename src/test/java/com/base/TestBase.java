package com.base;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
//import org.openqa.selenium.IOUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
//import com.sun.java_cup.internal.runtime.Scanner;
import com.resources.Constants;
import com.resources.ErrorUtil;
import com.resources.TestUtil;
import com.resources.Xls_Reader;
// parameterize
// ant, exe-bat
// xslt reports 
public class TestBase {
	@FindBy(xpath=Constants.welcome_email)
	public WebElement welcome_email;
	@FindBy(xpath=Constants.welcome_password)
	public WebElement welcome_password;
	@FindBy(xpath=Constants.welcome_login_button)
	public WebElement welcome_login_button;
	@FindBy(xpath=Constants.dob_now_build_component)
	public WebElement dob_now_build_component;
	@FindBy(xpath=Constants.found_job)
	public WebElement found_job;
	@FindBy(xpath=Constants.job_number_search)
	public WebElement job_number_search;
	@FindBy(xpath=Constants.eljob_number_filter)
	public WebElement eljob_number_filter;
	@FindBy(xpath=Constants.job_search_input_box)
	public WebElement job_search_input_box;
	@FindBy(xpath=Constants.search_button)
	public WebElement search_button;
	@FindBy(xpath=Constants.search_for_records_one)
	public WebElement search_for_records_one;
	@FindBy(xpath=Constants.search_for_records_one_field)
	public WebElement search_for_records_one_field;
	@FindBy(xpath=Constants.search_for_records_one_image)
	public WebElement search_for_records_one_image;
	@FindBy(xpath=Constants.search_results_job_subject)
	public WebElement search_results_job_subject;
	
	@FindBy(xpath=Constants.crm_top_nav_search_button)
	public WebElement crm_top_nav_search_button;
	
	@FindBy(xpath=Constants.pw1_confirm_save_button)
	public WebElement pw1_confirm_save_button;
	@FindBy(xpath=Constants.global_save_step_button)
	public WebElement global_save_step_button;
	@FindBy(xpath=Constants.global_notification_ok_button)
	public WebElement global_notification_ok_button;
	@FindBy(xpath=Constants.global_loading_spinner)
	public WebElement global_loading_spinner;
	
	public static Logger APPLICATION_LOGS = null;
	public static Properties CONFIG=null;
	public static WebDriver driver=null;
	public static boolean isLoggedIn=false;
	public static Properties OR_PROPERTIES=null;
	public static Properties TEXT_PROPERTIES=null;
	public static Properties JOB_NUMBER=null;
	public static final String browsername = null;
	public static String pagesource = null;
	public static String timestamp = null;
	public static String base_url = null;
	public static String location = null;

	public static FileReader fr = null;
	public static BufferedReader txtReader = null;
	public static String exctracted_job_number = null;
	public static String job_number = null;
	

		
	Xls_Reader xlsx = new Xls_Reader(Constants.testCases);
	FirefoxProfile ffxprofile = new FirefoxProfile(new File(Constants.firefoxProfile));
	
	

	
	public void initConfigurations() {
		if(CONFIG==null) {
		APPLICATION_LOGS = Logger.getLogger("devpinoyLogger");
		 CONFIG = new Properties();
		try {
			FileInputStream fs = new FileInputStream(Constants.CONFIG_FILE_PATH);
			CONFIG.load(fs);
		} catch (Exception e) {	e.printStackTrace();}
		}
		if(OR_PROPERTIES==null) {
		APPLICATION_LOGS = Logger.getLogger("devpinoyLogger");
		OR_PROPERTIES = new Properties();
		try {
			FileInputStream fs = new FileInputStream(Constants.OR_PROPERTIES);
			OR_PROPERTIES.load(fs);
		} catch (Exception e) {	e.printStackTrace();}
		}
		if(TEXT_PROPERTIES==null) {
		APPLICATION_LOGS = Logger.getLogger("devpinoyLogger");
		TEXT_PROPERTIES = new Properties();
		try {
			FileInputStream fs = new FileInputStream(Constants.TEXT_PROPERTIES);
			TEXT_PROPERTIES.load(fs);
		} catch (Exception e) {	e.printStackTrace();}
		}
		if(JOB_NUMBER==null) {
		APPLICATION_LOGS = Logger.getLogger("devpinoyLogger");
		JOB_NUMBER = new Properties();
		try {
			FileInputStream fs = new FileInputStream(Constants.JOB_NUMBER);
			JOB_NUMBER.load(fs);
		} catch (Exception e) {	e.printStackTrace();}
		}
				
		if(CONFIG.getProperty("env").equals("ant_443")) {
			Xls_Reader xlsx = new Xls_Reader(Constants.testCases);
		}
					

	}
	
	public void openBrowser() {
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
	
	public void getEnvironmentDetails() {
		if(CONFIG.getProperty("env").equals("demo")) {
			base_url = Constants.base_url;
		}
	}

/*	public void openBrowser() {
		driver.get(CONFIG.getProperty("env"));
	}*/
	public void navigate(String url) {
		driver.get(url);
	}
	
	public WebElement getElement(String elemrnt_locator, int seconds_to_wait) {
		WebElement e = null;
		waitForElement(elemrnt_locator, 30);
		e = driver.findElement(By.xpath(elemrnt_locator));
/*		if(elemrnt_locator.endsWith("_xpath")) {
			waitForElement(elemrnt_locator, 30);
			e = driver.findElement(By.xpath(elemrnt_locator));
		}
		else if(elemrnt_locator.endsWith("_id")) {
			waitForElement(elemrnt_locator, 30);
			e = driver.findElement(By.id(elemrnt_locator));
		}
		else if(elemrnt_locator.endsWith("_name")) {
			waitForElement(elemrnt_locator, 30);
			e = driver.findElement(By.name(elemrnt_locator));
		}
		else if(elemrnt_locator.endsWith("_css")) {
			waitForElement(elemrnt_locator, 30);
			e = driver.findElement(By.cssSelector(elemrnt_locator));
		}*/
/*		System.out.println(elemrnt_locator);
		System.out.println(e);*/
		return e;
		
	}
	
	public void waitForElement(String elemrnt_locator, int seconds_to_wait) {
		WebDriverWait wait = new WebDriverWait(driver, seconds_to_wait);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(elemrnt_locator)));
	}
	public void type(String elemrnt_locator, String text) {
//		waitForElement(elemrnt_locator, 30);
		getElement(elemrnt_locator, 30).sendKeys(text);
	}
	public void click(String elemrnt_locator) {
		waitForElement(elemrnt_locator, 30);
		getElement(elemrnt_locator, 30).click();
	}
	
	
	
	public void driverGetUrl(String url) {		
//		driver.manage().window().setSize(new Dimension(1700, 1000));
		driver.manage().deleteAllCookies();
	    driver.get(url);
//	    driver.manage().window().maximize();
	//	Dimension dimension = new Dimension(1700, 1100);
	//	driver.manage().window().setSize(dimension);
	}
	
	public void kountResults() {
		 if (driver.getPageSource().contains(OR_PROPERTIES.getProperty("kounttokenexist")))		 	{
			 APPLICATION_LOGS.debug("---------------------------------------------------------");
		 }
		 else if (driver.getPageSource().contains(OR_PROPERTIES.getProperty("kounta")))		 		{
			 APPLICATION_LOGS.debug("---------------------------- A --------------------------");
		 }
	 }
	
	public void refreshPage(){
		driver.navigate().refresh();
	}
	
	public void keyPressTab(WebElement fieldName) {
		fieldName.sendKeys(Keys.TAB);
	}
	
	public void scrollDown() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, 500)"); // if the element is on top.

	}	
	
	public void scrollToElement(String elementxpath) {
		WebElement elementToClick = driver.findElement(By.xpath(elementxpath));
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0,"+elementToClick.getLocation().y+")");
	}	
	
	public void scrollUp() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(500, 0)"); // if the element is on bottom
	}	
	
	public void javaScriptClick(String elementxpath) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", elementxpath);
	}
	
	public void assertNotification(String expectedtext, String screenShotName) {
		try{
			waitUntilElementVisible(Constants.global_notification_message, 30);
			String pagesource = driver.getPageSource();
			Assert.assertTrue(pagesource.contains(expectedtext));
//			Assert.assertTrue(driver.getPageSource().contains(testText));
			String part1 = "//p[contains(.,'";
			String part2 = "')]";
			String elementxpath = part1 + expectedtext + part2;
			highlightElement(elementxpath);
		}catch(Throwable t){
			DateFormat dateFormat = new SimpleDateFormat("M-d-HH-mm"); // 12-31 16:20
			timestamp = dateFormat.format(Calendar.getInstance().getTime());
			System.out.println("assertNotification " + expectedtext);
			ErrorUtil.addVerificationFailure(t);
			TestUtil.takeScreenShot(timestamp + " " + screenShotName);
		}
	}
	
	public void assertTextPresent(String expectedtext, String screenShotName) {
		waitTime(3000L);
		try{
			String pagesource = driver.getPageSource();
			Assert.assertTrue(pagesource.contains(expectedtext));
//			Assert.assertTrue(driver.getPageSource().contains(testText));
			String part1 = "//*[contains(.,'";
			String part2 = "')]";
			String elementxpath = part1 + expectedtext + part2;
			highlightElement(elementxpath);
			waitTime(1000L);
		}catch(Throwable t){
			DateFormat dateFormat = new SimpleDateFormat("M-d-HH-mm"); // 12-31 16:20
			timestamp = dateFormat.format(Calendar.getInstance().getTime());
			System.out.println("assertTextPresent " + expectedtext);
			ErrorUtil.addVerificationFailure(t);
			TestUtil.takeScreenShot(timestamp + " " + screenShotName);
		}
	}
	
	public void assertFilingStatus(String expectedtext, String screenShotName) {
		try{
			scrollUp();
			scrollUp();
			scrollUp();
			scrollUp();
			scrollUp();
			waitUntilElementInVisible(Constants.global_notification_ok_button, 30);
			waitUntilElementInVisible(Constants.global_loading_spinner, 60);
			String pagesource = driver.getPageSource();
			Assert.assertTrue(pagesource.contains(expectedtext));
			String part1 = "//span[contains(.,'";
			String part2 = "')]";
			String elementxpath = part1 + expectedtext + part2;
			highlightElement(elementxpath);
		}catch(Throwable t){
			DateFormat dateFormat = new SimpleDateFormat("M-d-HH-mm"); // 12-31 16:20
			timestamp = dateFormat.format(Calendar.getInstance().getTime());
			System.out.println("assertFilingStatus " + expectedtext);
			ErrorUtil.addVerificationFailure(t);
			TestUtil.takeScreenShot(timestamp + " " + screenShotName);
		}
	}
	
	public void assertTextNotPresent(String expectedtext, String screenShotName) {
		waitTime(3000L);
		try{
			pagesource = driver.getPageSource();
			Assert.assertTrue(!pagesource.contains(expectedtext));
//			Assert.assertTrue(driver.getPageSource().contains(testText));
		}catch(Throwable t){
			DateFormat dateFormat = new SimpleDateFormat("M-d-HH-mm"); // 12-31 16:20
			timestamp = dateFormat.format(Calendar.getInstance().getTime());
			System.out.println("assertTextNotPresent error " + screenShotName + " "+ timestamp);
			ErrorUtil.addVerificationFailure(t);
			TestUtil.takeScreenShot(timestamp +" "+ screenShotName);
		}
	}
	
	public void assertTwoTextsPresent(String expectedtext1, String expectedtext2, String screenShotName) {
//		waitTime(3000L);
		try{
//			String pagesource = driver.findElement(By.tagName("body")).getText();
			pagesource = driver.getPageSource();
//			Assert.assertTrue(pagesource.contains(testText));
			if (pagesource.contains(expectedtext1) & pagesource.contains(expectedtext2)){
				System.out.println(expectedtext1 + " " + expectedtext2 + " two texts present");
			}
		}catch(Throwable t){
			DateFormat dateFormat = new SimpleDateFormat("M-d HH-mm"); // 12-31 16:20
			timestamp = dateFormat.format(Calendar.getInstance().getTime());
			System.out.println("assertTwoTextsPresent " + screenShotName + " "+ timestamp);
			ErrorUtil.addVerificationFailure(t);
			TestUtil.takeScreenShot(timestamp +" "+ screenShotName);
		}
	}
	
	public void assertIntEqual(int int1, int int2, String screenShotName) {
		try {
			Assert.assertEquals(int1, int2);
			}
		catch(Throwable t) {
				DateFormat dateFormat = new SimpleDateFormat("M-d HH-mm"); // 12-31 16-31
				timestamp = dateFormat.format(Calendar.getInstance().getTime());
				System.out.println("assertIntEqual error " + screenShotName + " "+ timestamp);
				ErrorUtil.addVerificationFailure(t);
				TestUtil.takeScreenShot(timestamp + " " + screenShotName);
		}
	}
	
	/*
	public void assertIntNotEqual(int int1, int int2, String screenShotName) {
		try {
			Assert.assertNotEquals(int1, int2);
			}
			catch(Throwable t) {
				DateFormat dateFormat = new SimpleDateFormat("M-d-HH-mm"); // 12-31-2014 16-31
				timestamp = dateFormat.format(Calendar.getInstance().getTime());
				System.out.println("assertIntEqual error " + timestamp);
				ErrorUtil.addVerificationFailure(t);
				TestUtil.takeScreenShot(timestamp + " " + screenShotName);
		}
	}
	*/
	
	public void assertTextEquals(String expectedtext1, String expectedtext2, String screenShotName) {
		try {
			Assert.assertEquals(expectedtext1, expectedtext2);
			}
			catch(Throwable t) {
				DateFormat dateFormat = new SimpleDateFormat("M-d-HH-mm"); // 12-31-2014 16-31
				timestamp = dateFormat.format(Calendar.getInstance().getTime());
				System.out.println(expectedtext1 + " not equal " + expectedtext2 + " " + timestamp);
				ErrorUtil.addVerificationFailure(t);
				TestUtil.takeScreenShot(timestamp + " " + screenShotName);
		}
	}
	
	public void assertQuestionAnswer(String expectedtext1, String expectedtext2) {
		try {
			Assert.assertSame(expectedtext1, expectedtext2);
			}
			catch(Throwable t) {
				DateFormat dateFormat = new SimpleDateFormat("M-d HH-mm");
				timestamp = dateFormat.format(Calendar.getInstance().getTime());
				System.out.println("assertIntEqual error " + timestamp);
				ErrorUtil.addVerificationFailure(t);
				TestUtil.takeScreenShot(timestamp);
		}
	}
	
	public void assertElementPresent(String elementxpath, String screenShotName) {
		try{
			Assert.assertTrue(driver.findElement(By.xpath(elementxpath)).isDisplayed());
		}catch(Throwable t){
			DateFormat dateFormat = new SimpleDateFormat("M-d HH-mm");
			timestamp = dateFormat.format(Calendar.getInstance().getTime());
			System.out.println("assertElementPresent " +  timestamp);
			ErrorUtil.addVerificationFailure(t);
			TestUtil.takeScreenShot(timestamp +" "+ screenShotName);
		}
	}

	public void assertElementNotPresent(String elementxpath, String screenShotName) {
		try{
			Assert.assertTrue(!driver.findElement(By.xpath(elementxpath)).isDisplayed());
		}catch(Throwable t){
			DateFormat dateFormat = new SimpleDateFormat("M-d-HH-mm"); // 12-31 16:20
			timestamp = dateFormat.format(Calendar.getInstance().getTime());
			System.out.println("assertElementNotPresent " +  timestamp);
			ErrorUtil.addVerificationFailure(t);
			TestUtil.takeScreenShot(timestamp + " " + screenShotName);
		}
	}
	
	public void getElementText(String elementxpath, String expectedtext) {
		try{
			String actualtext = driver.findElement(By.xpath(elementxpath)).getText();
			Assert.assertEquals(expectedtext, actualtext);
		}catch(Throwable t){
			DateFormat dateFormat = new SimpleDateFormat("M-d-HH-mm");
			timestamp = dateFormat.format(Calendar.getInstance().getTime());
			System.out.println("getElementText " + expectedtext);
			ErrorUtil.addVerificationFailure(t);
			TestUtil.takeScreenShot(timestamp + " " + expectedtext);
		}
	}
	
	public void elementTextContains(String elementxpath, String expectedtext) {
		try{
			String actualtext = driver.findElement(By.xpath(elementxpath)).getText();
//			System.out.println(driver.findElement(By.xpath(elementxpath)).getText());
			Assert.assertTrue(actualtext.contains(expectedtext));
		}catch(Throwable t){
			DateFormat dateFormat = new SimpleDateFormat("M-d-HH-mm");
			timestamp = dateFormat.format(Calendar.getInstance().getTime());
			System.out.println(expectedtext);
			ErrorUtil.addVerificationFailure(t);
			TestUtil.takeScreenShot(timestamp + " " + expectedtext);
		}
	}
	
	public void elementContainsText(String elementxpath, String expectedtext) {
		try{
			String actualtext = driver.findElement(By.xpath(elementxpath)).getText();
			Assert.assertTrue(actualtext.contains(expectedtext));
		}catch(Throwable t){
			DateFormat dateFormat = new SimpleDateFormat("M-d-HH-mm");
			timestamp = dateFormat.format(Calendar.getInstance().getTime());
			System.out.println(expectedtext);
			ErrorUtil.addVerificationFailure(t);
			TestUtil.takeScreenShot(timestamp + expectedtext);
		}
	}
	
	public void elementContainsTextOrText(String elementxpath, String expectedtext1, String expectedtext2) {
		try{
			String actualtext = driver.findElement(By.xpath(elementxpath)).getText();
			Assert.assertTrue(actualtext.contains(expectedtext1) || actualtext.contains(expectedtext2));
		}catch(Throwable t){
			DateFormat dateFormat = new SimpleDateFormat("M-d-HH-mm");
			timestamp = dateFormat.format(Calendar.getInstance().getTime());
			System.out.println(expectedtext1 + " or " + expectedtext2);
			ErrorUtil.addVerificationFailure(t);
			TestUtil.takeScreenShot(timestamp + expectedtext1 + " or " + expectedtext2);
		}
	}
	
	public void assertSourceContains(String expectedtext) {
		try{
			waitTime(2000L);
			pagesource = driver.getPageSource();
			Assert.assertTrue(pagesource.contains(expectedtext));
		}catch(Throwable t){
			DateFormat dateFormat = new SimpleDateFormat("M-d-HH-mm");
			timestamp = dateFormat.format(Calendar.getInstance().getTime());
			System.out.println("assertSourceContains " +  timestamp);
			ErrorUtil.addVerificationFailure(t);
			TestUtil.takeScreenShot(timestamp +" "+ expectedtext);
		}
	}
	
	public void quitDriver() {
		waitTime(1000L);
		driver.quit();
		driver=null;
	}
	
	public void waitTime(long waitseconds)	{
		try {
			Thread.sleep(waitseconds);
			} catch (InterruptedException e) 
			{	e.printStackTrace();
			}
	}
	
	public void waitUntilElementPresent(String elementxpath, int seconds) {
	new WebDriverWait(driver, seconds).until(ExpectedConditions.presenceOfElementLocated(By.xpath(elementxpath)));
//	WebElement myDynamicElement = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.id(elementxpath)));
	}
	
	public static void generateRandomNumber() {
		double d = Math.random() * 1000;
		int num = (int)d;
		System.out.println(num);
	}	
	
	public void mouseOverElementXpath(String elementxpath) {
		Actions actions = new Actions(driver);
		WebElement element = driver.findElement(By.xpath(elementxpath));
		actions.moveToElement(element);
		actions.perform();
	}
	
	public void mouseOverElementId(String elementid) {
		Actions actions = new Actions(driver);
		WebElement element = driver.findElement(By.id(elementid));
		actions.moveToElement(element);
		actions.perform();
	}
	
	public void waitUntilElementVisible(String elementxpath, int seconds) {
		try{
			WebDriverWait wait = new WebDriverWait(driver, seconds);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(elementxpath)));
			waitTime(1000L);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(elementxpath)));
		}catch(Throwable t){
			DateFormat dateFormat = new SimpleDateFormat("M-d-HH-mm");
			timestamp = dateFormat.format(Calendar.getInstance().getTime());
			ErrorUtil.addVerificationFailure(t);
			TestUtil.takeScreenShot(timestamp);
			System.out.println("waitUntilElementVisible " + elementxpath);
		}
	}
	public void waitUForVisibnle(String elementxpath, int seconds) {
		try{
			WebDriverWait wait = new WebDriverWait(driver, seconds);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(elementxpath)));
		}catch(Throwable t){
			System.out.println("waitUntilElementVisible " + elementxpath);
		}
	}
	public void waitUntilElementInVisible(String elementxpath, int seconds) {
		try{
			WebDriverWait wait = new WebDriverWait(driver, seconds);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(elementxpath)));
			waitTime(1000L);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(elementxpath)));
		}catch(Throwable t){
			DateFormat dateFormat = new SimpleDateFormat("M-d-HH-mm");
			timestamp = dateFormat.format(Calendar.getInstance().getTime());
			ErrorUtil.addVerificationFailure(t);
			TestUtil.takeScreenShot(timestamp);
			System.out.println("waitUntilElementInVisible " + elementxpath);
		}
	}
	
	public String convertedTimestamp() {
		String timestamp;
		DateFormat dateFormat = new SimpleDateFormat("M-d HH:mm:ss"); // 07/31/2014 16:31
		timestamp = dateFormat.format(Calendar.getInstance().getTime());
		return timestamp;
	}
	
	public String newJobNumber() {
		waitUntilElementVisible(Constants.job_label, 30);
		String exctracted_job_number = driver.findElement(By.xpath(Constants.job_label)).getText();
		String job_number  = exctracted_job_number.substring(exctracted_job_number.indexOf("M") + 1, exctracted_job_number.indexOf(" Filing"));
		job_number = "M"+ job_number;
		return job_number;
	}
	
	public void clickElement(String elementxpath){
		WebDriverWait wait = new WebDriverWait(driver, 1);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(elementxpath)));
		driver.findElement(By.xpath(elementxpath)).click();
	}

	public void findElement(String elementxpath){
		WebDriverWait wait = new WebDriverWait(driver, 1);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(elementxpath)));
		driver.findElement(By.xpath(elementxpath));
	}
// 		Actions action = new Actions(driver);
//		action.doubleClick(found_job).perform();
	

	
	public void loginToPortal(String login_email) {
		if (!login_email.equals("")) {
			driverGetUrl(base_url);
			waitUntilElementVisible(Constants.welcome_email, 30);
			welcome_email.sendKeys(login_email);
			welcome_password.sendKeys(OR_PROPERTIES.getProperty("password"));
			welcome_login_button.click();
			waitUntilElementVisible(Constants.global_dob_logo, 30);
			int message = (driver.findElements(By.xpath(Constants.incorrect_email_and_password_message)).size());
			while (message > 0) {
				System.out.println("Email and Password combination is incorrect");
				driverGetUrl(base_url);
				waitUntilElementVisible(Constants.welcome_email, 30);
				welcome_email.sendKeys(login_email);
				welcome_password.sendKeys(OR_PROPERTIES.getProperty("password"));
				welcome_login_button.click();
				waitTime(3000L);
				message = (driver.findElements(By.xpath(Constants.incorrect_email_and_password_message)).size());
			}
			waitUntilElementVisible(Constants.dob_now_build_component, 30);
			dob_now_build_component.click();
			waitUntilElementInVisible(Constants.dob_now_build_component, 30);
		}
	}
	
	public void loginToCrm(String user_name) {
		driverGetUrl(Constants.crm_stage);
		waitTime(5000L);
		setWindowfocus();
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		StringSelection name = new StringSelection(user_name);
		StringSelection pass = new StringSelection(OR_PROPERTIES.getProperty("password_crm"));
		clipboard.setContents(name, null);
		try {
			(new Robot()).keyPress(java.awt.event.KeyEvent.VK_CONTROL);
			(new Robot()).keyPress(java.awt.event.KeyEvent.VK_V);
			waitTime(500);
			(new Robot()).keyRelease(java.awt.event.KeyEvent.VK_CONTROL);
			(new Robot()).keyPress(java.awt.event.KeyEvent.VK_TAB);
			waitTime(500);
			clipboard.setContents(pass, null);
			(new Robot()).keyPress(java.awt.event.KeyEvent.VK_CONTROL);
			(new Robot()).keyPress(java.awt.event.KeyEvent.VK_V);
			waitTime(500);
			(new Robot()).keyRelease(java.awt.event.KeyEvent.VK_CONTROL);
			(new Robot()).keyPress(java.awt.event.KeyEvent.VK_ENTER);
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}
	
	public void searchForJobCrm() {
		driverGetUrl(Constants.crm_stage);
		setWindowfocus();
		waitUntilElementVisible(Constants.crm_top_nav_search_button, 30);
		driver.switchTo().frame("contentIFrame0");
		waitTime(500L);
		driver.switchTo().frame("dashboardFrame");
		waitUntilElementVisible(Constants.search_for_records_one, 30);
		search_for_records_one.click();
		waitUntilElementVisible(Constants.search_for_records_one_field, 30);
		search_for_records_one_field.sendKeys(JOB_NUMBER.getProperty("job_number"));
		waitUntilElementVisible(Constants.search_for_records_one_image, 30);
		search_for_records_one_image.click();
		waitUntilElementVisible(Constants.search_results_job_subject, 10);
		new Actions(driver).doubleClick(search_results_job_subject).perform();
		waitUntilElementVisible(Constants.crm_top_nav_search_button, 30);
		driver.switchTo().frame("contentIFrame0");
		waitUntilElementVisible(Constants.click_here_to_go_to_job_filing, 60);
//		waitUntilElementVisible(Constants.qa_admin_actions_label, 30);
		driver.switchTo().defaultContent();
		
	}
	
	public void searchForJobDob(String user_name) {
		String search_results_xpath = Constants.found_job_part_one + JOB_NUMBER.getProperty("job_number") + Constants.found_job_part_two;
		waitUntilElementVisible(Constants.job_number_search, 30);
/*		job_number_search.click();
		waitUntilElementVisible(Constants.job_search_input_box, 30);
		job_search_input_box.sendKeys(JOB_NUMBER.getProperty("job_number"));
		waitUntilElementVisible(Constants.search_button, 30);
		search_button.click();*/
		
		waitUntilElementVisible(Constants.eljob_number_filter, 30);
		eljob_number_filter.sendKeys(JOB_NUMBER.getProperty("job_number"));
		
		waitUntilElementVisible(Constants.filing_action_label, 30);
		int numbers = driver.findElements(By.xpath(search_results_xpath)).size();
		while(numbers <= 0){
			loginToPortal(user_name);
			waitUntilElementVisible(Constants.job_number_search, 30);
			job_number_search.click();
			waitUntilElementVisible(Constants.job_search_input_box, 30);
			job_search_input_box.clear();
			job_search_input_box.sendKeys(JOB_NUMBER.getProperty("job_number"));
			waitUntilElementVisible(Constants.search_button, 30);
			search_button.click();
			waitUntilElementVisible(Constants.job_filing_label, 30);
			waitUntilElementVisible(Constants.filing_action_label, 30);
			numbers = driver.findElements(By.xpath(search_results_xpath)).size();
		}
 		waitUntilElementVisible(Constants.found_job, 30);
 		Actions action = new Actions(driver);
 		action.doubleClick(found_job).perform();
 		waitUntilElementVisible(Constants.global_notification_ok_button, 30);
 		global_notification_ok_button.click();
	}

	public void doubbleClick(WebElement elementxpath) {
		Actions action = new Actions(driver);
 		action.doubleClick(elementxpath).perform();
	}
	
	public void addToProperties(String test_cases_location) {
		try {
	        FileInputStream fileName=new FileInputStream(Constants.JOB_NUMBER);
	        Properties props = new Properties();
	        props.load(fileName);
	        props.setProperty("test", "my test");
	        props.setProperty("test2", test_cases_location);
	        fileName.close();
	        FileOutputStream outFileName=new FileOutputStream(Constants.JOB_NUMBER);
	        props.store(outFileName, "");
	        outFileName.close();
        } catch (IOException io) {
            io.printStackTrace();
        } 
	/*  Path path = Paths.get(Constants.JOB_NUMBER);
	    Charset charset = StandardCharsets.UTF_8;
	    String content;
		try {
			content = new String(Files.readAllBytes(path), charset);
		    content = content.replaceAll("name=anything", "name=some");
		    Files.write(path, content.getBytes(charset));
		} catch (IOException e1) {
			e1.printStackTrace();
		}*/
	}
		
	public void saveJobNumber(String save, String work_type) {
		if(!save.equals("")) {
			Properties prop = new Properties();
			OutputStream output = null;
			try {
				output = new FileOutputStream(Constants.JOB_NUMBER);
				if(work_type.equals("Antenna") || work_type.equals("CurbCut")) {
					exctracted_job_number = driver.findElement(By.xpath(Constants.job_label)).getText();
					job_number = exctracted_job_number.substring(exctracted_job_number.indexOf("M") + 1,	exctracted_job_number.indexOf(" Filing"));
					job_number = "M" + job_number;
				}
				if(work_type.equals("Electrical")) {
					exctracted_job_number = driver.findElement(By.xpath(Constants.el_job_label)).getText();
					job_number = exctracted_job_number.substring(exctracted_job_number.indexOf("B") + 1,	exctracted_job_number.indexOf("-"));
					job_number = "B" + job_number;
				}
				System.out.println("JOB NUMBER **************** " + job_number);
				prop.setProperty("job_number", job_number);
				prop.store(output, null);
				JOB_NUMBER = new Properties();
				try {
					FileInputStream fs = new FileInputStream(Constants.JOB_NUMBER);
					JOB_NUMBER.load(fs);
				} catch (Exception e) {	e.printStackTrace();}
				} catch (IOException io) {
					io.printStackTrace();
				} finally {
				if (output != null) {
					try {
						output.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}

	public void getJobNumber() {
		Properties prop = new Properties();
		InputStream input = null;
		try {
			input = new FileInputStream("config.properties");
			// load a properties file
			prop.load(input);
			// get the property value and print it out
			System.out.println(prop.getProperty("job_number"));
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}
	
	public void setWindowfocus() {
        String currentWindow = driver.getWindowHandle();
        driver.switchTo().window(currentWindow);
	}
	
	public void ifAlertExistAccept() {
	    try{ 
	        Alert a = new WebDriverWait(driver, 10).until(ExpectedConditions.alertIsPresent());
	        if(a!=null){
//	            System.out.println("Alert is present");
	            driver.switchTo().alert().accept();
	        }else{
	            throw new Throwable();
	        }
	    } 
	    catch (Throwable e) {
//	        System.err.println("Alert isn't present!!");
	    }
	}
	
	public void killChromeDriver() {
		try {
			Runtime.getRuntime().exec("taskkill /F /IM chromedriver.EXE");
			waitTime(1000L);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void loadProps() {
		JOB_NUMBER = new Properties();
		try {
			FileInputStream fs = new FileInputStream(Constants.JOB_NUMBER);
			JOB_NUMBER.load(fs);
		} catch (Exception e) {	e.printStackTrace();
		}
	}
	
	public void highlightElement(String elementxpath) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.xpath(elementxpath));
		waitUntilElementVisible(elementxpath, 30);
//		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
		js.executeScript("arguments[0].style.border='3px solid red'", element);
		waitTime(300L);
		js.executeScript("arguments[0].style.border='3px solid yellow'", element);
/*		waitTime(300L);
		js.executeScript("arguments[0].style.border='3px solid green'", element);
		waitTime(300L);*/
	}
	
    public void javaMessage(String[] args, String test_name) {
        final JOptionPane pane = new JOptionPane(test_name);
//      final JOptionPane pane = new JOptionPane(test_name, JOptionPane.QUESTION_MESSAGE, JOptionPane.OK_CANCEL_OPTION);
        final JDialog dialog = pane.createDialog(null, test_name);
        Timer timer = new Timer(3000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent arg0) {
            dialog.dispose();
        }
        });
        timer.start();
        dialog.setVisible(true);
        dialog.dispose();
    }
	
}
