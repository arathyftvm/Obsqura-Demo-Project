package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;
	
public HomePage(WebDriver driver)
{
	 this.driver = driver ;
     PageFactory.initElements(driver,this);
}
@FindBy(xpath ="//a[contains(text(),'Home')]") WebElement homeMenu;
@FindBy(xpath ="//a[contains(text(),'Input Form')]") WebElement inputForm;
@FindBy(xpath ="//a[contains(text(),'Table')]") WebElement table;
@FindBy(xpath ="//a[contains(text(),'Date Pickers')]") WebElement datepicker;
@FindBy(xpath ="//a[contains(text(),'Progress')]") WebElement progressBar;
@FindBy(xpath ="//a[contains(text(),'Alert')]") WebElement alertandModal;
@FindBy(xpath ="//a[contains(text(),'List Box')]") WebElement listBox;
@FindBy(xpath ="//a[contains(text(),'Others')]") WebElement otherMenu;

public void homeButtonClick()
{
homeMenu.click();
}
public void inputFormClick()
{
inputForm.click();
}
public void tableClick()
{
	table.click();
}
public void datepickerClick()
{
	datepicker.click();
}
public void alertandModalClick()
{
	alertandModal.click();
}
public void listBoxClick()
{
	listBox.click();
}
public void progressbarClick()
{
	progressBar.click();
}
public void otherMenuClick()
{
	otherMenu.click();
}
}