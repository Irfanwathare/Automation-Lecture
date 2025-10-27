package com.keyworddrivenframework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("./src/test/resources/myntra.xlsx");
		XSSFWorkbook work = new XSSFWorkbook(fis);
		XSSFSheet sheet = work.getSheet("sheet1");
		for(int i =1; i <=2; i++) {
			XSSFRow row= sheet.getRow(i);
			XSSFCell teststeps = row.getCell(0);
			String[] teststep = teststeps.toString().split("[0-9]");
			WebDriver w = null;
			Myntrarepo repo =null;
			for (String s : teststep) {
				if (s.trim().contains("user launch an chrome browser")) {
					w =new ChromeDriver();
					repo = new Myntrarepo(w);
				}else if (s.trim().contains("user navigate to myntra site")) {
					w.get("https://www.myntra.com/");
					w.manage().window().maximize();
				}else if (s.trim().contains(" myntra search and product")) {
					repo.EnterSearch("shirt");
					repo.SumbitSearch();
					Thread.sleep(2000);
				}else if (s.trim().contains("select an product")) {
					repo.FirstProduct();
					Thread.sleep(2000);
					String main = w.getWindowHandle();
					Set<String> multi = w.getWindowHandles();
					for (String m : multi) {
					if (!m.equals(main)) {
						w.switchTo().window(m);
						}
					}
					
				}else if (s.trim().contains("select size of an product")) {
					Thread.sleep(2000);
					repo.SelectSize("44");
				}else if (s.trim().contains("Add to bag an product")) {
					repo.AddToBag();
					
				}else if (s.trim().contains("add to bag an product")) {
					repo.AddToBag();
				}else {
					System.out.println("Error in this step");
					
				}
					
				}	
					Thread.sleep(2000);
					w.quit();
					
				}	
					
	}}
					
				
					
					
				
				
			
				
			
			
		
		
		

	


