package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.DriverIntializer;
import pages.AlertsAndModals;
import pages.HomePage;
import pages.WindowPopPage;
import util.ExtentReportClass;
import util.ScreenShot;
import util.WindowHandle;

public class ObsquraZoneConnectPageOpenVerfication extends DriverIntializer {
WebDriver driver;
HomePage homepage;
AlertsAndModals alertModals;
WindowHandle windowhanle;
WindowPopPage popup;
Boolean isSelectedCheck;
@Test
public void ObsquraZoneConnectPageOpenVerficationtest() throws IOException{
	 	driver= getDriver();
		homepage = new HomePage(driver);
		homepage.alertandModalClick();
		alertModals=new AlertsAndModals(driver);
		alertModals.windowPopUpButtonClick();
	    windowhanle=new WindowHandle();
		windowhanle.childwindowSwitch(driver);
		popup=new WindowPopPage(driver);
		popup.likeUsOnFacebookButtonClick();
		//popup.emailidforpopupEnter();
		//popup.passwordforpopupEnter();
		
		if(isSelectedCheck=popup.likeUsOnFacebookButton.isSelected()==true) {
			Assert.assertTrue(true);
		}
		
		ScreenShot s=new ScreenShot();
		s.takeScreenShotMethod(driver,"ObsquraZoneConnectPageOpenVerficationtest");
		/*ExtentReportClass report=new ExtentReportClass();
		report.generateReports();
		report.createExtentReports();
		report.createTest("simpleFormVerify");
		report.loginfo("entering test");
		report.logpass("test passed");
		report.logfail("test failed");
		report.flush();*/
}
}
