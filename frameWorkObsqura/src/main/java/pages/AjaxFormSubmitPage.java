package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AjaxFormSubmitPage {
WebDriver driver;

public AjaxFormSubmitPage(WebDriver driver)
{
	 this.driver = driver ;
     PageFactory.initElements(driver,this);
}

@FindBy(id ="subject") WebElement subject;
@FindBy(id ="description") WebElement description;
@FindBy(xpath="//input[@type='submit']")WebElement ajaxSubmit;
@FindBy(xpath="//div[contains(text(),'Looks good!')]")WebElement suceessSubject;
@FindBy(xpath="//div[contains(text(),'Looks good!')]")WebElement suceessdescription;
public void subjectSendKeys(){
	subject.sendKeys("Arathy");
}

public String suceessSubjectGetText()
{
	String textSubject=suceessSubject.getText();
	return textSubject;
	
}

public void descriptionSendKeys()
{
	description.sendKeys("Francis");
}
public String suceessdescriptionGetText()
{
	String descriptiontext=suceessdescription.getText();
	return descriptiontext;
	}
public void ajaxSubmitButton()
{
	ajaxSubmit.click();
}

}

