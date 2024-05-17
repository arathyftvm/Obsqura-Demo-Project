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

public class FortmSubmitValidationclass extends DriverIntializer{
WebDriver driver;
HomePage homepage;
InputForm input;
FormSubmitPage form;
public String expectedText="Form has been submitted successfully!";

@Test
public void formSubmitFormVerification() throws InterruptedException
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
	form.agreetermsandConditionsClick();
	//Thread.sleep(2000);
	WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(60));
	wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//button[contains(text(),'Submit form')]"))));
	form.SubmitClick();
	String achualSucessmsg=form.successMsgofSubmitFormGetText();
	System.out.println(achualSucessmsg+"dfghjkl;lkhgfd");
	Assert.assertEquals(expectedText,achualSucessmsg);
	
	
}

}
