package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class InvalidLoginPage extends BasePage
{

	@FindBy(xpath="//span[contains(text(),'Username or Password is invalid')]")
	private WebElement errorMsg;

	
	public InvalidLoginPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void verifyInvalidLoginPage()
	{
		Assert.assertTrue(errorMsg.isDisplayed());
	}
	
	
}
