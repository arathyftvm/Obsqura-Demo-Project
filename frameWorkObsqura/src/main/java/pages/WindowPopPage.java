package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WindowPopPage {
WebDriver driver;

public WindowPopPage(WebDriver driver)
{
	this.driver = driver ;
    PageFactory.initElements(driver,this);
}
@FindBy(xpath ="//a[contains(text(),'Like')]")public WebElement likeUsOnFacebookButton;
@FindBy(xpath="//input[@name='email' and @id=':rm:']")WebElement emailidforpopup;
@FindBy(xpath="//input[@name='pass' and @id=':rp:']")WebElement passwordforpopup;

public void likeUsOnFacebookButtonClick()
{
	likeUsOnFacebookButton.click();

}

public void emailidforpopupEnter()
{
	emailidforpopup.sendKeys("arathyftvm@gmail.com");

}
public void passwordforpopupEnter()
{
	passwordforpopup.sendKeys("@rathy1234");

}
}



