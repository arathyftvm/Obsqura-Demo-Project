package tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.DriverIntializer;
import pages.AlertsAndModals;
import pages.HomePage;
import pages.JQueryUiProgressPage;

public class JqueryUIProgressBar extends DriverIntializer{
WebDriver driver;
HomePage page;
AlertsAndModals alertAndModal;
JQueryUiProgressPage progressBar;
@Test
public void progressBarVerfication() throws InterruptedException
{
	driver=getDriver();
	page =new HomePage(driver);
	page.progressbarClick();
	//alertAndModal =new AlertsAndModals(driver);
	//alertAndModal.progressBarModalClick();
	
	progressBar=new JQueryUiProgressPage(driver);
	progressBar.startDownloadButtonClick();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	wait.until(ExpectedConditions.visibilityOf(progressBar.CloseButton));
	progressBar.closeButtonClick();
	Thread.sleep(2000);
}
}
