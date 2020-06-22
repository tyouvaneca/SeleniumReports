package com.selenium.examples.ExtentReports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentreportsSelenium {
     
	ExtentReports extent;

	   @BeforeTest

	public void config()

	{

	// ExtentReports , ExtentSparkReporter

	String path =System.getProperty("user.dir")+"\\reports\\index.html";

	ExtentSparkReporter reporter = new ExtentSparkReporter(path);

	reporter.config().setReportName("Web Automation Results");

	reporter.config().setDocumentTitle("Test Results");

	extent =new ExtentReports();

	extent.attachReporter(reporter);

	extent.setSystemInfo("Tester", "Youvaneca");
	}

	@Test

	public void initialDemo()

	{
		 extent.createTest("Initial Demo");

		 System.setProperty("webdriver.chrome.driver","C:\\SeleniumDrivers\\chromedriver.exe");	
		   WebDriver driver = new ChromeDriver();
			
			driver.get("http://www.google.com");

	driver.get("https://rahulshettyacademy.com");

	System.out.println(driver.getTitle());

	driver.close();
	extent.flush();

	}

}
