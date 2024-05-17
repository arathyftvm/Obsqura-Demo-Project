package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.DriverIntializer;
import pages.FormSubmitPage;
import pages.HomePage;
import pages.InputForm;

public class FormSubmitWithoutTermsAndCondition extends DriverIntializer {
	WebDriver driver;
	HomePage homepage;
	InputForm input;
	FormSubmitPage form;
	String expectedText="You must agree before submitting.";
	
	@Test
	public void FormSubmitWithoutTermsAndConditionVerification() throws InterruptedException
	{
		driver= getDriver();
		homepage = new HomePage(driver);
		homepage.inputFormClick();
		input =new InputForm(driver);
		input.formSubmitMenuClick();
		form=new FormSubmitPage(driver);
		form.firstnameEnter();
		form.lastnameEnter();
		form.usernameEnter();
		form.cityEnter();
		form.stateEnter();
		form.zipEnter();
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//button[contains(text(),'Submit form')]"))));
		form.SubmitClick();
		String achualSucessmsg=form.notAcceptMsgGetText();
		boolean invalidCheck=form.isSelectedCheck();
		System.out.println(achualSucessmsg);
		System.out.println(expectedText);
		System.out.println(invalidCheck);
		if(invalidCheck==false){
				Assert.assertEquals(achualSucessmsg, expectedText);
				 System.out.println("passed");
		}
		else{
				System.out.println("Failed");
			}
		
		
	}

}
