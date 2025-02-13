package com.actitime.scripts;

import org.testng.annotations.Test;

import com.actitime.generics.Excel;
import com.actitime.pom.Version;

public class VerifyVersionE extends BaseTest
{

	
	@Test
	public void verifyVersionE()
	{
		String sheet = "VersionE";
		
		Version v1 = new Version(driver);
		
		String ver = Excel.getCellValue(PATH, sheet, 1, 1);
		
		v1.verifyVersion(ver);
	}
}
