package com.actitime.scripts;

import org.testng.annotations.Test;

import com.actitime.pom.LoginPage;
import com.actitime.pom.Logout;
import com.actitime.pom.ReportsDownLoad;
import com.actitime.pom.Users;

public class VerifyUsersCreation extends BaseTest
{

	
	@Test
	public void verifycreateUser() throws InterruptedException
	{
		LoginPage l1 = new LoginPage(driver);
        l1.setUserName("admin");
        l1.setPassword("manager");
        l1.clickOnLoginButton();
        Thread.sleep(3000);

        Users u1 = new Users(driver);
              u1.clickOnUsers();
              u1.clickOnAddUser();
              u1.enterFirstName("admin");
              u1.enterLastName("ABC");
              u1.enterEmail("admin@gmail.com");
              Thread.sleep(3000);
              u1.enterUserName("aaaaa");
              u1.enterPassword("111111");
              u1.reEnterPassword("111111");
              Thread.sleep(3000);
              u1.clickOnCreateUsers();
              
        
              Thread.sleep(3000);    
Logout l2 = new Logout(driver);
      l2.clickOnLogoutButton();
	}
}
