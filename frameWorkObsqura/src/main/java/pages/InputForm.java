package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InputForm {

WebDriver driver;

public InputForm(WebDriver driver)
{
	 this.driver = driver ;
     PageFactory.initElements(driver,this);
}

@FindBy(xpath ="//div[contains(text(),'Menu')]") WebElement inputFormMenu;
@FindBy(xpath ="//a[contains(text(),'Simple Form Demo')]") WebElement simpleFormDemoMenu;
@FindBy(xpath ="//a[contains(text(),'Checkbox Demo')]") WebElement checkBoxMenu;
@FindBy(xpath ="//a[contains(text(),'Radio Buttons')]") WebElement radioButtonDemoMenu;
@FindBy(xpath ="//a[contains(text(),'Select Input')]") WebElement selectInputDemoMenu;
@FindBy(xpath ="//a[contains(text(),'Form Submit')]") WebElement formSubmitMenu;
@FindBy(xpath ="//a[contains(text(),'Ajax Form Submit')]") WebElement ajaxFormDemoMenu;


public void inputFormMenuClick()
{
	inputFormMenu.click();
}
public void simpleFormDemoMenuClick()
{
	simpleFormDemoMenu.click();
}
public void checkBoxMenuClick()
{
	checkBoxMenu.click();
}
public void radioButtonDemoMenuClick()
{
	radioButtonDemoMenu.click();
}
public void selectInputDemoMenuClick()
{
	selectInputDemoMenu.click();
}
public void formSubmitMenuClick()
{
	formSubmitMenu.click();
}
public void ajaxFormDemoMenuClick()
{
	ajaxFormDemoMenu.click();
}
}
