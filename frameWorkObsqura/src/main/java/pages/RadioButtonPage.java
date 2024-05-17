package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RadioButtonPage {

	
	WebDriver driver;

	public RadioButtonPage(WebDriver driver)
	{
		 this.driver = driver ;
	     PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//button[@id='button-one']/preceding-sibling::div//following::div//child::input") 
	WebElement genterMale;
	@FindBy(xpath="//button[@id='button-one']") 
	WebElement showSelectedValueButton;
	@FindBy(xpath="//div[@id='message-one']") 
	WebElement genterValidationMsgEntered;
	
	
	public void genterSelectCheckbox()
	{
		genterMale.click();
	}
	
	public void showSelectedValueButtonClick()
	{
		showSelectedValueButton.click();
	}

		public String genterValidationMsgCheck()
	{
	String validationmMsg=genterValidationMsgEntered.getText();
	return validationmMsg;
	
	}
}

