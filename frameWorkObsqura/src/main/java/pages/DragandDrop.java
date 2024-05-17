package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DragandDrop {
	 WebDriver driver ;
	public DragandDrop(WebDriver driver){
	this. driver = driver;
	PageFactory.initElements(driver, this);
	}
		
	 @FindBy(xpath="//span[text()='Draggable n°1']")WebElement sourcelementone;
	 @FindBy(xpath="//span[text()='Draggable n°2']")WebElement sourcelementtwo;
	 @FindBy(id="mydropzone")WebElement targetElement;
	 @FindBy(id="mylist") List<WebElement> droppedelement;
		
	 public void dragclick(){
	  Actions action= new Actions(driver);
	  action.doubleClick().perform();//double click 
	  action.contextClick(sourcelementone).perform(); //right click on an element 
	  action.dragAndDrop(sourcelementone,targetElement).perform(); //drag and drop
	 }
	 public boolean dropcomplete(String text) {
	 boolean found=false;
	 for(WebElement droppeditem:droppedelement){
	 if(droppeditem.getText().equals(text)) {
		 System.out.println(droppeditem.getText());
	     found=true;
	     break;
	    }
	  }
	   return found;
	   }
	}