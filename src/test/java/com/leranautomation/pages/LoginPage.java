package com.leranautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver ldriver) {
		this.driver = ldriver;
	}

	/*@FindBy(xpath = "//input[@type='submit']")
	WebElement loginButton; */

	@FindBy(name = "username")
	WebElement uname;

	@FindBy(name = "password")
	WebElement pass;

	@FindBy(xpath = "//input[@type='submit']")
	WebElement login;

	public void loginToCRM(String username, String password) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	//	loginButton.click();
		uname.sendKeys(username);
		pass.sendKeys(password);
		login.click();

	}
}
