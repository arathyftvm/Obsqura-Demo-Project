package util;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportClass {
	WebDriver driver;
	 static ExtentReports extentReports;
	 ExtentTest extenTest;
	 

	 public void generateReports()
	 { 
	  String reportPath = System.getProperty("user.dir") + "/test-output/ExtentSparkReport.html"; 
	  ExtentSparkReporter htmlReporter = new ExtentSparkReporter(reportPath);
	 htmlReporter.config().setDocumentTitle("Automation Report");
	 htmlReporter.config().setReportName("Test Automation Results"); 
	 htmlReporter.config().setTheme(Theme.STANDARD);
	  extentReports= new ExtentReports(); 
	 extentReports.attachReporter(htmlReporter);
	//return extentReports; 
	 
	 }
	// ExtentReports extentReports;
	 /*public void createExtentReports()
	 {
		 extentReports= generateReports();
	 }*/
	 
	 public void createTest(String testname)
	 {
	 extenTest =extentReports .createTest(testname);
	 }
	 public void loginfo(String text)
	 {
	  
	  extenTest.log(Status.INFO,text); 
	 }
	 public void logpass(String text)
	 {
	  
	  extenTest.log(Status.PASS,text); 
	 }
	 public void logfail(String text)
	 {
	  
	  extenTest.log(Status.FAIL,"test passed"); 
	 }
	 public void flush()
	 {
	  
	  extentReports.flush();
	 }
}