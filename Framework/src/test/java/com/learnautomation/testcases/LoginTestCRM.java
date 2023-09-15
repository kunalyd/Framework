package com.learnautomation.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.leranautomation.pages.BaseClass;
import com.leranautomation.pages.LoginPage;

public class LoginTestCRM extends BaseClass {

	@Test
	public void loginapp() {
		
		logger = report.createTest("Login to CRM");

		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);

		logger.info("Starting Application");
		
		loginpage.loginToCRM(excel.getStringData("Login", 0, 0), excel.getStringData("Login", 0, 1));

		logger.pass("Login Successfull");
	}
}
