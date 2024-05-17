package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormSubmitPage {

	WebDriver driver;

	public FormSubmitPage(WebDriver driver)
	{
		 this.driver = driver ;
	     PageFactory.initElements(driver,this);
	}

	@FindBy(id="validationCustom01") WebElement firstname;
	@FindBy(id="validationCustom02") WebElement lastname;
	@FindBy(id="validationCustomUsername") WebElement username;
	@FindBy(id="validationCustom03") WebElement city;
	@FindBy(id="validationCustom04") WebElement state;
	@FindBy(id="validationCustom05") WebElement zip;
	@FindBy(id="invalidCheck") WebElement agreetermsandConditions;
	@FindBy(xpath="//button[contains(text(),'Submit form')]")WebElement submitForm;
	@FindBy(xpath="//div[contains(text(),'Form has been submitted successfully!')]") WebElement successMsgofSubmitForm;
	@FindBy(xpath="//div[contains(text(),' You must agree before submitting.')]") WebElement notAcceptMsg;
	@FindBy(id="invalidCheck") WebElement invalidCheck;
	public void firstnameEnter()
	{
		firstname.sendKeys("Arathy");
	}
	
	public void lastnameEnter()
	{
		lastname.sendKeys("Francis");
	}
	public void usernameEnter()
	{
		username.sendKeys("Arathyftvm");
	}
	public void cityEnter()
	{
		city.sendKeys("tvm");
	}
	public void stateEnter()
	{
		state.sendKeys("Kerala");
	}
	public void zipEnter()
	{
		zip.sendKeys("00000");
	}
	public void agreetermsandConditionsClick()
	{
		agreetermsandConditions.click();
	}
	
	
	public void SubmitClick()
	{
		submitForm.click();
	}
	
	
	public String successMsgofSubmitFormGetText()
	
	{
		String msgform =successMsgofSubmitForm.getText();
		return msgform;
	}
	
public String notAcceptMsgGetText()
	
	{
		String notAccpetmsgform =notAcceptMsg.getText();
		return notAccpetmsgform;
	}

public boolean isSelectedCheck()
{
	boolean invalidVar=invalidCheck.isSelected();
	return invalidVar;
}
}
