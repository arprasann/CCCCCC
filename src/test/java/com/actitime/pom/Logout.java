package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout extends BasePage
{

	
	@FindBy(id="logoutLink")
	private WebElement logoutButton;
	
	
	public Logout(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickOnLogoutButton()
	{
		logoutButton.click();
	}
}
