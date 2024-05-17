package util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot {
WebDriver driver;
public void takeScreenShotMethod(WebDriver driver,String screenshotname) throws IOException
{
	String filelocation=System.getProperty("user.dir")+"\\test-output";
	TakesScreenshot takesScreenshot = (TakesScreenshot)driver ;
    File file = takesScreenshot.getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(file,new File(filelocation+"\\"+screenshotname+".png"));
}
	
}
