package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SimpleFormDemoPage {

	WebDriver driver;
	public SimpleFormDemoPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="single-input-field") WebElement simpleInputField;
	@FindBy(xpath ="//button[contains(text(),'Show Message')]") WebElement showMessageButton;
	@FindBy(id="message-one") WebElement messageCheck;
	
	public String simpleInputFieldType(String a)
	{
		simpleInputField.sendKeys(a);
		return a;
		
	}
	
	public void clickShowMsg()
	{
		showMessageButton.click();
		//showMessageButton.sendKeys(keys.);
	}
	public String messageCheck()
	{
	return messageCheck.getText();
	
	}
}
