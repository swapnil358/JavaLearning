package com.qa.hubspot.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		
	}

	
	//defining  page locator:
	
	
	By emailId = By.name("email");
	By password = By.name("password");
	By loginBtn = By.xpath("//div[text()= 'Login']");
	
	
	//page actions:
	
	public String GetLoginPageTitle() {
		return driver.getTitle();
	}
	
	
	public void doLogin(String username, String Password) {
		doSendKey(emailId, username);
		doSendKey(password, Password);
		doClick(loginBtn);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
}
