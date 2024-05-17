package tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import base.DriverIntializer;
import pages.AlertsAndModals;
import pages.HomePage;
import pages.JavaScriptAlertPage;

public class Javascriptpromptalert extends DriverIntializer{
	WebDriver driver;
	HomePage homepage;
	AlertsAndModals alertModals;
	JavaScriptAlertPage javaalert;
	public static String achualText="I am a Javascript alert box!";
	@Test
	public void JavascriptpromptalertTest() throws InterruptedException{
		driver= getDriver();
		homepage = new HomePage(driver);
		homepage.alertandModalClick();
		alertModals=new AlertsAndModals(driver);
		alertModals.javaScriptAlertButtonClick();
		javaalert =new JavaScriptAlertPage(driver);
		javaalert.javaScriptAlertBoxClickMe();
		try{
		Alert alert=driver.switchTo().alert();
		String expectedText=javaalert.javaScriptAlertBoxClickMeGetText();
		Assert.assertEquals(expectedText, achualText);
		alert.accept();
		}catch(UnhandledAlertException  e) {
		    // No alert found on page, proceed with test.
		}
		}
}
