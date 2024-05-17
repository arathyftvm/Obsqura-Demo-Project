package tests;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.DriverIntializer;
import pages.HomePage;
import pages.InputForm;
import pages.SimpleFormDemoPage;
import util.ExtentReportClass;
import util.RetryAnalyzer;
import util.ScreenShot;

public class SimpleFormVerficationTest extends DriverIntializer{
	WebDriver driver;
	HomePage homepage;
	InputForm inputform;
	SimpleFormDemoPage simpledemo;
	String achualMsg="Your Message : PageObject Factory";
	//
	//@Test(priority=1,retryAnalyzer =util.RetryAnalyzer.class)
	@Test
	@Parameters({"browser"})
		public void simpleFormVerify() throws IOException
		{ 
		    driver= getDriver();
			homepage =new HomePage(driver);
			homepage.inputFormClick();
			inputform =new InputForm(driver);
			inputform.simpleFormDemoMenuClick();
			simpledemo =new SimpleFormDemoPage(driver);
			simpledemo.simpleInputFieldType("PageObject Factory");
			simpledemo.clickShowMsg();
			String expectedMessage=simpledemo.messageCheck();
			Assert.assertEquals(achualMsg,expectedMessage);
			ScreenShot s=new ScreenShot();
			s.takeScreenShotMethod(driver,"simpleFormVerify");
			ExtentReportClass report=new ExtentReportClass();
			report.generateReports();
			report.createTest("simpleFormVerify");
			//report.createExtentReports();
			report.loginfo("entering test");
			report.logpass("test passed");
			report.logfail("test failed");
			report.flush();
		}
	}
	

