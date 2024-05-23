package util;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportClass implements ITestListener {
	WebDriver driver;
	 private static final ExtentReports extentReports;
	public ExtentTest extentTest;
	 
static{
	// public void generateReports()
	// { 
	  String reportPath = System.getProperty("user.dir") + "/test-output/ExtentSparkReport.html"; 
	  ExtentSparkReporter htmlReporter = new ExtentSparkReporter(reportPath);
	 htmlReporter.config().setDocumentTitle("Automation Report");
	 htmlReporter.config().setReportName("Test Automation Results"); 
	 htmlReporter.config().setTheme(Theme.STANDARD);
	 extentReports= new ExtentReports(); 
	 extentReports.attachReporter(htmlReporter);
	//return extentReports; 
	 
	 }
	
	 @Override
	 public void onTestStart(ITestResult result) {
		    
		 String testName=result.getMethod().getMethodName();
		 extentTest =extentReports .createTest(testName);
		 extentTest.log(Status.INFO,"Test started");
	    extentTest.assignCategory(result.getMethod().getRealClass().getSimpleName());
	   }
		  
	 @Override
		  public void onTestSuccess(ITestResult result) {
		    extentTest.log(Status.PASS, "Test passed");
		  }

		  
	 @Override
		  public void onTestFailure(ITestResult result) {
		 extentTest.log(Status.FAIL, "Test Failed");
		 extentTest.log(Status.FAIL,result.getThrowable());
		  }

	 @Override
		  public void onTestSkipped(ITestResult result) {
		    // not implemented
		  }

	 @Override
		  public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		    // not implemented
		  }

	 @Override
		  public void onTestFailedWithTimeout(ITestResult result) {
		    onTestFailure(result);
		  }

		  
	 @Override
		  public void onStart(ITestContext context) {
		    // not implemented
		  }

		 
	 @Override
		  public void onFinish(ITestContext context) {
		    System.out.println("Extent Report -Test suite finished"+ context.getName());
		    extentReports.flush();
		  }
}