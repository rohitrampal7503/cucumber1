package com.SharedData;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class SharedClass 
{
	WebDriver driver;

	@Before
	public WebDriver setup()
	{

		System.setProperty("webdriver.chrome.driver","D:\\Selenium Training\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www-tst.towerhobbies.de/LogonForm?catalogId=12051&myAcctMain=1&langId=-3&storeId=30001&sourceDomain=hheu-de");

		return driver;
	}
	
	@After
	public void TearDown()
	{
		driver.quit();
	}
}
