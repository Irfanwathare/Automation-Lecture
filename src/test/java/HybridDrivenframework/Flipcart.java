package HybridDrivenframework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipcart {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("./src\\test\\resources\\flipkartHDF.xlsx");
		XSSFWorkbook work = new XSSFWorkbook(fis);
		XSSFSheet sheet = work.getSheet("sheet1");
		for(int i=1; i<=2; i++) {
			XSSFRow row = sheet.getRow(i);
			XSSFCell testDatas=row.getCell(0);
			String[] testData= testDatas.toString().split(",");
			for (String td : testData) {
			WebDriver w= null;
			Repoflipkart r= null;
			XSSFCell teststeps = row.getCell(1);
			String[] teststep = teststeps.toString().split("[0-9]");
			for (String ts : teststep) {
				if (ts.contains("Launch an Browser ")) {
					w=new ChromeDriver();
					r=new Repoflipkart(w);						
				}
				
				else if (ts.contains("Enter flipkart url")) {
					w.manage().window().maximize();
					r.navigateTosite("https://www.flipkart.com/");
				}
				else if (ts.contains("Search an product")) {
					r.EnterSerch(td);		
				}
				else if (ts.contains("close an Browser")) {
					r.closeandbrowser();
			}	
				else if (ts.contains("Click on buy now")) {
					r.buyNow();
					Thread.sleep(5000);
				}	
				else if (ts.contains("Select an product")) {
					r.Clickfirstproduct();
					r.switchWindowFormEmbeddTomain();
				}									
				else {
					System.out.println("Missing steps "+ts);
				}
//				System.out.println(ts);
			}
				
			
			
		}

	}

	}}
