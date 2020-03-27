package com.qa.hubspot.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);

	}

	
	By loggedInUser = By.xpath("//span[text() = 'swapnil bodade']");
	
	
	public String homePageTitle() {
		return driver.getTitle();

	}
	
	public boolean verifyHomePageDisplay() {
		WebElement ele = driver.findElement(loggedInUser);
		return ele.isDisplayed();
	}

	
	

}
