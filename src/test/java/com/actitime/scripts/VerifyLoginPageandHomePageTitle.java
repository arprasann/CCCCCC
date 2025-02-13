package com.actitime.scripts;

import org.testng.annotations.Test;

import com.actitime.pom.LoginPage;
import com.actitime.pom.Logout;

public class VerifyLoginPageandHomePageTitle extends BaseTest
{

	
	@Test
	public void verifyLoginPageandHomePageTitle() throws InterruptedException
	{
		LoginPage l1 = new LoginPage(driver);
		          l1.verifyTitle("actiTIME - Login");
        l1.setUserName("admin");
        l1.setPassword("manager");
        l1.clickOnLoginButton();
        
        Thread.sleep(2000);
        Logout l2 = new Logout(driver);
                l2.verifyTitle("actiTIME - Enter Time-Track");
               l2.clickOnLogoutButton();
	}
}
