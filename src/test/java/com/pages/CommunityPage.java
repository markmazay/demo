package com.pages;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.junit.Assert;

import com.base.BaseTest;
import com.relevantcodes.extentreports.LogStatus;
import com.resources.Constants;

public class CommunityPage extends BaseTest {
	
	public void switchToPopularQuestions() {
			test = rep.startTest("switchToPopularQuestions");
			click(Constants.second_dropdown_arrow);
			click(Constants.popular_questions_link);
	}
	
	public boolean checkStringIsNumeric(String str) {
		try {
			double d = Double.parseDouble(str);
			System.out.println("# of Answers is numeric " + d);
		} catch (NumberFormatException nfe) {
			System.out.println("# of Answers not numeric.");
			return false;
		}
		return true;
	}

	
	public void addToProps(String prop_name, String value) {
		if (!prop_name.equals("")) {
			test = rep.startTest("Add To Props " +prop_name + " = " +value );
			if (JOB_NUMBER == null) {
				JOB_NUMBER = new Properties();
				try {
					FileInputStream fs = new FileInputStream(Constants.JOB_NUMBER);
					JOB_NUMBER.load(fs);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			try {
				FileInputStream fileName = new FileInputStream(Constants.JOB_NUMBER);
				Properties props = new Properties();
				props.load(fileName);
				props.setProperty(prop_name, value);
				fileName.close();
				FileOutputStream outFileName = new FileOutputStream(Constants.JOB_NUMBER);
				props.store(outFileName, "");
				outFileName.close();
				// props.load(fileName);
				FileInputStream fs = new FileInputStream(Constants.JOB_NUMBER);
				JOB_NUMBER.load(fs);
			} catch (IOException io) {
				io.printStackTrace();
			}
		}
	}
	
	public boolean verifyPopularGreaterThanResent(String one, String two) {
		test = rep.startTest("verifyPopularGreaterThanResent");
		one = one.replace(" Answers", "");
		two = two.replace(" Answers", "");
/*		System.out.println(one);
		System.out.println(two);*/
		
		int value1 = Integer.valueOf(one);
		int value2 = Integer.valueOf(two);
		if(value2 > value1) {
			System.out.println(two+ " is greater than " +one);
			Assert.assertTrue(value2 > value1);
			return true;
		}else
			System.out.println(two+ " is not greater than " +one);;
			Assert.fail();
			return false;
	}
	
}


