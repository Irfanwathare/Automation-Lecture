package com.DataDrivenframework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws Exception {
		WebDriver w = new ChromeDriver();
		w.get("https://www.flipkart.com/");
		FileInputStream fis = new FileInputStream("./src\\test\\resources\\Flipkart.xlsx");
		XSSFWorkbook work = new XSSFWorkbook(fis);
		XSSFSheet sh = work.getSheet("Sheet1");
	    for(int i =1; i<=sh.getLastRowNum();i++) {
	    	XSSFRow r =sh.getRow(i);
	    	XSSFCell search=r.getCell(0);
	    	Thread.sleep(2000);
	    	w.findElement(By.name("q")).sendKeys(search.toString(),Keys.ENTER);
	    	Thread.sleep(2000);
	    	w.findElement(By.name("q")).sendKeys(Keys.CONTROL,"a",Keys.BACK_SPACE);
	    	
	    	System.out.println(search.toString());
	    	
	    	
	    	
	    }
		
	}

}
