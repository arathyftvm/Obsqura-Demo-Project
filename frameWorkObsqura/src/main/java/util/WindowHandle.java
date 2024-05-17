package util;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class WindowHandle {
	 WebDriver driver;
	 String parentWindow;
	 
	public void childwindowSwitch(WebDriver driver)
	{
		this.driver=driver;
   parentWindow = driver.getWindowHandle(); //current window handle
   Set<String> WindowHandlesss= driver.getWindowHandles(); //all windows handle
   for (String childWindow : WindowHandlesss) 
   	{
	   if (!parentWindow.equals(childWindow)) 
	   		{
		   	driver.switchTo().window(childWindow);
	   		}
   	}	
	}
	public void parentWindowSwitch()
	{
		driver.switchTo().window(parentWindow);
	}
}


