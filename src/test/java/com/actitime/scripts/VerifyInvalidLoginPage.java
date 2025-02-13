package com.actitime.scripts;

import org.testng.annotations.Test;

import com.actitime.pom.InvalidLoginPage;
import com.actitime.pom.LoginPage;

public class VerifyInvalidLoginPage extends BaseTest
{

	@Test
	public void verifyInvalidLoginPage() throws InterruptedException
	{
		log.debug("***Verify Invalid LoginPage Test Cases Started..");
		LoginPage l1 = new LoginPage(driver);
		log.debug("Enter Invalid Username");
        l1.setUserName("admin111");
        
        log.debug("Enter Invalid Password");
        l1.setPassword("888888");
        
        System.out.println("Click on LoginButton");
        l1.clickOnLoginButton();
        
        Thread.sleep(4000);
        InvalidLoginPage i1 = new InvalidLoginPage(driver);
        log.debug("Verify Error Message..");
                        i1.verifyInvalidLoginPage();
                        log.debug("*****Successfuly Error Message Validated****");
                        log.debug("    ");
	}
}
