package tests;



import java.lang.reflect.InvocationTargetException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import base.DriverIntializer;
import pages.DragandDrop;
import pages.HomePage;

public class DragandDropTest extends DriverIntializer {
	 WebDriver driver;
	 DriverIntializer intial;
	 HomePage main;
	 //OthersPage other;
	 DragandDrop drag;
		
	 @BeforeMethod
	 public void run(){
	   driver=getDriver();
	  }
		
	 @Test
	 public void verify()throws InvocationTargetException {
	  main=new HomePage(driver);
	  main.otherMenuClick();
	  //other=new OthersPage(driver);
	  //other.draganddropclick();
	  drag=new DragandDrop(driver);
	  drag.dragclick();
	  drag.dropcomplete("Draggable n°1");
	     

	}
	}

	

