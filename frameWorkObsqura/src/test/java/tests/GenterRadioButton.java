package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import base.DriverIntializer;
import pages.HomePage;
import pages.InputForm;
import pages.RadioButtonPage;

public class GenterRadioButton extends DriverIntializer{
	WebDriver driver;
	HomePage homepage;
	InputForm input;
	RadioButtonPage radioButtonCheck;
	String expecxtedText ="Radio button 'Male' is checked";
@Test	
public void genterVerification(){
	driver= getDriver();
	homepage = new HomePage(driver);
	homepage.inputFormClick();
	input =new InputForm(driver);
	input.radioButtonDemoMenuClick();
	radioButtonCheck=new RadioButtonPage(driver);
	radioButtonCheck.genterSelectCheckbox();
	radioButtonCheck.showSelectedValueButtonClick();
	String achualMsg=radioButtonCheck.genterValidationMsgCheck();
	System.out.println(achualMsg);
	Assert.assertEquals(achualMsg,expecxtedText);
	
}

}
