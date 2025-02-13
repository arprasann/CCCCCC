package com.actitime.scripts;

import org.testng.annotations.Test;

import com.actitime.pom.LoginPage;

public class VerifyValidLoginPage extends BaseTest
{

	@Test
	public void verifyValidLoginPage()
	{
		LoginPage l1 = new LoginPage(driver);
		          l1.setUserName("admin");
		          l1.setPassword("manager");
		          l1.clickOnLoginButton();
	}
}
