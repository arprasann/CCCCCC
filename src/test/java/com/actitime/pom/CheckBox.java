package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CheckBox extends BasePage
{

	@FindBy(name="remember")
	private WebElement checkBox;
	
	public CheckBox(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	
	public void validateCheckBox()
	{
		checkBox.click();
		
		Assert.assertTrue(checkBox.isSelected());
	}
}
