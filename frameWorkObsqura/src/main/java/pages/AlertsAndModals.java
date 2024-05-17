package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertsAndModals {
WebDriver driver;
public AlertsAndModals(WebDriver driver){
	 this.driver = driver ;
     PageFactory.initElements(driver,this);
}

@FindBy(xpath ="//a[contains(text(),'Window Popup')]") WebElement windowPopUpButton;
@FindBy(xpath ="//a[contains(text(),'Javascript Alert')]") WebElement javaScriptAlertButton;
@FindBy(xpath="//a[contains(text(),'Progress Bar Modal')]")WebElement progressBarModal;
public void windowPopUpButtonClick(){
	windowPopUpButton.click();
}

public void javaScriptAlertButtonClick(){
	javaScriptAlertButton.click();
}

public void progressBarModalClick(){
	progressBarModal.click();
}
}

