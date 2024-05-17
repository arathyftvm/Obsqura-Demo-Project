package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.DriverIntializer;
import pages.AjaxFormSubmitPage;
import pages.HomePage;
import pages.InputForm;

public class AjaxformSubmission extends DriverIntializer {
	WebDriver driver;
	HomePage homepage;
	InputForm input;
	AjaxFormSubmitPage formSubmit;
	
	@Test
	public void ajaxformSubmissionStringVerficationTest() throws InterruptedException
	{
		driver= getDriver();
		homepage = new HomePage(driver);
		homepage.inputFormClick();
		input =new InputForm(driver);
		input.ajaxFormDemoMenuClick();
		formSubmit=new AjaxFormSubmitPage(driver);
	    formSubmit.subjectSendKeys();
		formSubmit.descriptionSendKeys();
		formSubmit.ajaxSubmitButton();
		Thread.sleep(2000);
		String AchualResultSubject= formSubmit.suceessSubjectGetText();
		System.out.println(AchualResultSubject);
		String AchualResultDiscription=formSubmit.suceessdescriptionGetText();
		System.out.println(AchualResultDiscription);
		String subject="Looks good!";
		String discription="Looks good!";
		Assert.assertEquals(AchualResultSubject,subject);
		Assert.assertEquals(AchualResultDiscription,discription);
	}
}
