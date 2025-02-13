package com.actitime.scripts;

import org.testng.annotations.Test;

import com.actitime.pom.LoginPage;
import com.actitime.pom.Logout;
import com.actitime.pom.ReportsDownLoad;

public class VerifyReportsDownload extends BaseTest
{
@Test
public void verifyReportsDownload() throws InterruptedException
{
	LoginPage l1 = new LoginPage(driver);
	          l1.setUserName("admin");
	          l1.setPassword("manager");
	          l1.clickOnLoginButton();
	          Thread.sleep(3000);
	ReportsDownLoad r1 = new ReportsDownLoad(driver);
	                r1.clickOnReports();
	                r1.clickOnNewReport();
	                r1.clickOnConfigureReport();
	                r1.clickOnGenerateHTMLReport();
	                Thread.sleep(3000); 
	                r1.clickOnGenerateExportCSVReport();
	                Thread.sleep(3000);    
	 Logout l2 = new Logout(driver);
	        l2.clickOnLogoutButton();
}
	
}
