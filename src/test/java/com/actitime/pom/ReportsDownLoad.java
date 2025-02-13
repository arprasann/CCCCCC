package com.actitime.pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReportsDownLoad extends BasePage
{

	@FindBy(xpath="//div[text()='REPORTS']")
	private WebElement reports;
	
	@FindBy(xpath="//span[text()='New Report']")
	private WebElement newReport;
	
	
	@FindBy(id="configureReportParametersButton")
	private WebElement configureReportParameter;
	
	@FindBy(xpath="(//span[text()='Generate HTML Report'])[2]")
	private WebElement generateHTMLreport;
	
	
	@FindBy(xpath="//td[contains(text(),'Export to CSV')]")
	private WebElement exportToCSVreport;
	
	
	public ReportsDownLoad(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnReports()
	{
		reports.click();
	}
	
	
	public void clickOnNewReport()
	{
		newReport.click();
	}
	
	
	public void clickOnConfigureReport()
	{
		configureReportParameter.sendKeys(Keys.ENTER);
	}
	
	public void clickOnGenerateHTMLReport()
	{
		generateHTMLreport.click();
	}
	
	
	
	public void clickOnGenerateExportCSVReport()
	{
		exportToCSVreport.click();
	}
	
	
}
