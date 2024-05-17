package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JavaScriptAlertPage {


	WebDriver driver;
	
public JavaScriptAlertPage(WebDriver driver)
{
	 this.driver = driver ;
     PageFactory.initElements(driver,this);
}
@FindBy(xpath ="//button[@class='btn btn-success']") WebElement javaScriptAlertBox;
@FindBy(xpath ="\"//button[contains(text(),'Click for Prompt Box')]\"") WebElement javaScriptConfirmBox;


public void  javaScriptAlertBoxClickMe()
{
	javaScriptAlertBox.click();	
}

public String javaScriptAlertBoxClickMeGetText()
{
	String alertText=javaScriptAlertBox.getText();
	return alertText;
}


public void javaScriptConfirmBoxClickMe()
{
	javaScriptConfirmBox.click();	
}
}
