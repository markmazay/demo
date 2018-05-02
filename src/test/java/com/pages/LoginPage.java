package com.pages;

import org.openqa.selenium.By;

import com.base.BaseTest;
import com.resources.Constants;

public class LoginPage extends BaseTest {

	public void loginToSite() {
		navigate(Constants.base_url);
		test = rep.startTest("loginToSite");
		type(Constants.email_field, Constants.username);
		type(Constants.password_field, Constants.password);
		click(Constants.sign_in_button);
		verifyText("//h3[@class='SpaceCardsHeader--title']", "My paths");
	}
}
