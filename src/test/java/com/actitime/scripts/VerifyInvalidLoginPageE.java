package com.actitime.scripts;

import org.testng.annotations.Test;

import com.actitime.generics.Excel;
import com.actitime.pom.InvalidLoginPage;
import com.actitime.pom.LoginPage;

public class VerifyInvalidLoginPageE extends BaseTest
{

	
	@Test
	public void verifyInvalidLoginPageE() throws InterruptedException
	{
		String sheet = "InvalidLoginPageE";
		
		int totalRows = Excel.getRowCount(PATH, sheet);
		
		for(int i=1; i <= totalRows; i++)
		{
			String un = Excel.getCellValue(PATH, sheet, i, 1);
			String pw = Excel.getCellValue(PATH, sheet, i, 2);
			
			LoginPage l1 = new LoginPage(driver);
			          l1.setUserName(un);
			          
			          l1.setPassword(pw);
			          
			          l1.clickOnLoginButton();
			          
			          Thread.sleep(2000);
			          
			 InvalidLoginPage i2 = new InvalidLoginPage(driver);
			                   i2.verifyInvalidLoginPage();
		}
	}
}
