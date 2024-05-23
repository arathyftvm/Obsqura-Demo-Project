package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.DriverIntializer;
import pages.HomePage;
import pages.Table;
import pages.TableWithPagination;
import util.ExcelUtil;
import util.ExtentReportClass;
import util.ScreenShot;

public class TableTest extends DriverIntializer{
	WebDriver driver;
	HomePage homePage;	
	Table table;
	TableWithPagination tableWithPagination;
	ExcelUtil excelUtil;
	String name, position, office, age, startDay, salary;
	String fileName="SampleExcelRead2.xlsx";
	String sheetName="Sheet1";
	int rowNumber;
	ScreenShot screenshot;
	ExtentReportClass reportUtil;	
	
	@Test(priority = 1)
	public void getValuesFromExcel() throws IOException
	{
		excelUtil= new ExcelUtil(fileName, sheetName);
		name= excelUtil.getStringData(1, 0);	
		position= excelUtil.getStringData(1, 1);
		office= excelUtil.getStringData(1, 2);
		age=excelUtil.getIntegerData(1, 3);
		startDay= excelUtil.getStringData(1, 4);
		salary= excelUtil.getStringData(1, 5);
		driver=getDriver();
		homePage=new HomePage(driver);
		homePage.tableClick();
		table=new Table(driver);
		table.clickTableWithPagination();
		tableWithPagination=new TableWithPagination(driver);
		rowNumber=tableWithPagination.getRowNumber(name);	
		SoftAssert soft = new SoftAssert();
		String currentPosition=tableWithPagination.getCurrentPosition(position, rowNumber);
		soft.assertEquals(currentPosition, position);
		String currentOffice=tableWithPagination.getCurrentOffice(office, rowNumber);
		soft.assertEquals(currentOffice, office);	
		String currentAge=tableWithPagination.getCurrentAge(age, rowNumber);
		soft.assertEquals(currentAge, age);
		String currentStartDay=tableWithPagination.getCurrentStartDay(startDay, rowNumber);
		soft.assertEquals(currentStartDay, startDay);
		soft.assertAll();
		ScreenShot s=new ScreenShot();
		s.takeScreenShotMethod(driver,"simpleFormVerify");
		
	}
}