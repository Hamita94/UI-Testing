package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
public static WebDriver driver;
	
	
	public static void launchChrome() {
		WebDriverManager.chromedriver().setup();
		 
		driver = new ChromeDriver();

	}
		
	public static void LoadUrl(String url) {
		driver.get(url);
	}
	public static void PrintTitle() {
		System.out.println(driver.getTitle());
	}
	public static void Winmax() {
		driver.manage().window().maximize();
	}
	public static void PrintCurrenturl() {
		System.out.println(driver.getCurrentUrl());
	}
	public static void fill(WebElement ole, String value) {
	    ole.sendKeys(value);
	}
	public static void btnclick(WebElement ele) {
		ele.click();
	}
	public static void scroll(WebElement ele) {
		JavascriptExecutor jk = (JavascriptExecutor) driver;
		jk.executeScript("arguments[0].scrollIntoView();",ele);
	}
	public static void back() {
		driver.navigate().back();
	}
	public static void JavaExecutorclick(WebElement ele) {
		JavascriptExecutor jk = (JavascriptExecutor) driver;
		jk.executeScript("arguments[0].click();", ele);

	}
	public static  String getdata( int rownumber,int cellnumber) throws IOException {
		File f = new File("C:\\Users\\hai\\eclipse-workspace\\MavenSample\\target\\ExcelData\\details.xlsx");
		
		FileInputStream fin = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(fin);
		Sheet s = w.getSheet("sheet1");
		System.out.println(s);
		Row row = s.getRow(rownumber);
		Cell cell = row.getCell(cellnumber);
		System.out.println(cell);
	    int celltype = cell.getCellType();
	    
	    String value="";
		if (celltype==1) {
			value= cell.getStringCellValue();
		} else  if (celltype==0) {
			if (DateUtil.isCellDateFormatted(cell)) {
				Date d = cell.getDateCellValue();
				SimpleDateFormat sim = new SimpleDateFormat("MM-dd-yyyy");
				 value = sim.format(d);
			}
			else {
				double e = cell.getNumericCellValue();
				long l = (long) e;
				value = String.valueOf(l);
			}
		}
		return value;

		}



}
