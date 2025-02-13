package com.actitime.scripts;

import org.testng.annotations.Test;

import com.actitime.pom.LoginPage;
import com.actitime.pom.Logout;
import com.actitime.pom.Tasks;

public class VerifyTasks extends BaseTest
{

	@Test
	public void verifyTask() throws InterruptedException
	{
		log.debug("****Verify Task Test cases Started*****");
		LoginPage l1 = new LoginPage(driver);
		log.debug("Enter valid Username");
        l1.setUserName("admin");
        log.debug("Enter Valid Password");
        l1.setPassword("manager");
        log.debug("Clcin On LoginButton");
        l1.clickOnLoginButton();
        
        Thread.sleep(2000);
        Tasks t1 = new Tasks(driver);
        log.debug("Click on Create Tasks");
        
              t1.clickOnTasks();
              log.debug("Enter Filter Task Name");
              t1.eneterFilterTaskByName("JavawithSelenium");
              log.debug("Click on Apply Button");
              t1.clickOnApplyButtonANDValidationTasks();
        
        Thread.sleep(2000);
        Logout l2 = new Logout(driver);
        log.debug("Click on Logout Button");
               l2.clickOnLogoutButton();
               log.debug("****Successfully Task screen Validated****");
	}
}
