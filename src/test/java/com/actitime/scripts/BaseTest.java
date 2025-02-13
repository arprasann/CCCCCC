package com.actitime.scripts;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public abstract class BaseTest implements ActiTime_ConstantData
{
public WebDriver driver;

Logger log;

@BeforeMethod
public void preCondtion() throws InterruptedException
{
	log = Logger.getLogger("devpinoyLogger");
	log.debug("Open the Browser");
	driver = new ChromeDriver();
	Thread.sleep(2000);
	
	log.debug("Maximize the Browser");
	driver.manage().window().maximize();
	log.debug("Enter the URL");
	driver.get("http://localhost/login.do");
	//Implictilywait 120 seconds
	driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
}


@AfterMethod
public void postCondtion() throws InterruptedException
{
	log.debug("Close the Browser");
	Thread.sleep(2000);
	driver.close();
}


//Close
public void close()
{
	try {
	driver.close();
	} catch (Exception e) {
		driver.quit();
	}
}

//takeCurrentURL
public void takeCurrentURL()
{
	try {
		driver.getCurrentUrl();
	} catch (ElementNotInteractableException e) {
		System.out.println("We are getting Exception="+e);
	}
}

//Select by Value
public void selectUsingValue(String value,WebElement web)
{
	try {
		
		Select s1 = new Select(web);
		s1.selectByValue(value);
		
	} catch (Exception e) {
		// TODO: handle exception
	}
}
}
