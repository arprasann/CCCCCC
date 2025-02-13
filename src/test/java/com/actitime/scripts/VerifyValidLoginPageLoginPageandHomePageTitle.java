package com.actitime.scripts;

import org.testng.annotations.Test;

import com.actitime.generics.Excel;
import com.actitime.pom.LoginPage;
import com.actitime.pom.Logout;

public class VerifyValidLoginPageLoginPageandHomePageTitle extends BaseTest {

	
	
	
	@Test
	public void verifyValidLoginPageandTitle() throws InterruptedException
	{
		String sheet = "LoginPageE";
		
		String un = Excel.getCellValue(PATH, sheet, 1, 1);
		String pw = Excel.getCellValue(PATH, sheet, 1, 2);
		String lpt = Excel.getCellValue(PATH, sheet, 1, 3);
		String hpt = Excel.getCellValue(PATH, sheet, 1, 4);
		
		LoginPage l1 = new LoginPage(driver);
		          l1.verifyTitle(lpt);
		         l1.setUserName(un);
		         
		         l1.setPassword(pw);
		         
		         l1.clickOnLoginButton();
		         
		         Thread.sleep(3000);
		Logout l2 = new Logout(driver);
		       l2.verifyTitle(hpt);
		       
		       l2.clickOnLogoutButton();
	}
	
}
