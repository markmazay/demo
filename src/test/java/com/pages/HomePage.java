package com.pages;

import com.base.BaseTest;
import com.relevantcodes.extentreports.LogStatus;

public class HomePage extends BaseTest {

	public void goToCommunitypage() {	
			test = rep.startTest("goToCommunitypage");
			click("//a[text()='Community']");
	}
}