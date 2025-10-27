package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import HybridDrivenframework.Repoflipkart;

public class Flipkartwithdataprovider {
	
	WebDriver w;
	Repoflipkart repo;
	@BeforeClass
	public void launchBrowser() {
		w= new ChromeDriver();
		repo = new Repoflipkart(w);	
	}
	@BeforeMethod
	public void navigateToFlipkartsite() {
		repo.navigateTosite("https://www.flipkart.com/");
	}
	@Test(dataProviderClass =Dataprovide.class,dataProvider="FlipkartSearch" )
    public void Search(String search) {
		repo.EnterSerch(search);
	}
	@AfterClass
	public void closeBrowser() {
		repo.closeandbrowser();
	}
	
	
	
	
}
