package com.automation.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.automation.pomscript.Demowebshop_gener;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Basicclass implements Freamwork 
{
	public 	ExtentHtmlReporter reporter;
	public ExtentReports reportes;
	public ExtentTest test;
	public  static WebDriver driver;
	public Demowebshop_gener demo;
	@BeforeTest
	public void reportcon()
	{	
		reporter=new ExtentHtmlReporter("./extent/report.html");
		reportes=new ExtentReports();
		reportes.attachReporter(reporter);}



	@BeforeClass
	public void open_browser()
	{
		System.setProperty("webdriver.chrome.driver","./SOFTWARE/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

	}


	@BeforeMethod
	public void open_app()
	{
		//driver.get("https://demowebshop.tricentis.com/");
		driver.get(Test_dataByproperty.getdata("URL"));
		demo=new Demowebshop_gener(driver);
		demo.log_in().click();
		demo.Email().sendKeys(Test_dataByproperty.getdata("EMAIL"));
		demo.password().sendKeys(Test_dataByproperty.getdata("PASS"));
		demo.loginbutton().click();	
	}



	@AfterMethod
	public void close_app()
	{
		demo.logoutbu();	
	}


	@AfterClass
	public void close_bro()
	{
		driver.	quit();

	}


	@AfterTest
	public void reportdis()
	{
		reportes.flush();	

	}

}
