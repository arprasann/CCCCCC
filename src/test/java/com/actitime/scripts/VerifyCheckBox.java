package com.actitime.scripts;

import org.testng.annotations.Test;

import com.actitime.pom.CheckBox;

public class VerifyCheckBox extends BaseTest
{

	
	@Test
	public void verifyCheckBox()
	{
		log.debug("***Verify CheckBox Test case Started*****");
		CheckBox c1 = new CheckBox(driver);
		log.debug("Checkbox Validation");
		          c1.validateCheckBox();

		          log.debug("***Verify CheckBox Testcase Successfully Executed*****");
	 log.debug("");
	}
}
