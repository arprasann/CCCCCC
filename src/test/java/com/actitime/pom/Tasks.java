package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Tasks extends BasePage
{

	
	@FindBy(xpath="//div[text()='TASKS']")
	private WebElement tasks;
	
	@FindBy(name="visiableFilterString")
	private WebElement enterTaskName;
	
	@FindBy(id="tasksFilterSubmitButton")
	private WebElement applayFilter;
	
	@FindBy(xpath="//*[@class='listtblcell tablerightborder']")
	private WebElement taskList;
	
	public Tasks(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnTasks()
	{
		tasks.click();
	}
	
	
	public void eneterFilterTaskByName(String fTaksName)
	{enterTaskName.sendKeys(fTaksName);
	}
		
	
	public void clickOnApplyButtonANDValidationTasks()
	{
		applayFilter.click();
	}
	
}
