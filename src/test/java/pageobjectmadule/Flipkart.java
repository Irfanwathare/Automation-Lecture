package pageobjectmadule;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import HybridDrivenframework.Repoflipkart;

public class Flipkart {
 Logger log;	

    WebDriver w;
//	DesiredCapabilities dc;
//	RemoteWebDriver w;
	Repoflipkart repo;
	@Parameters("Browsers")	
	@BeforeClass
	public void launchbrowser(String BrowserName) {
	//	dc=new DesiredCapabilities();
	//	dc.setPlatform(Platform.WINDOWS);
		log =LogManager.getFormatterLogger();
		
	if (BrowserName.equalsIgnoreCase("chrome")) {
	//	dc.setBrowserName("chrome");
		//w =new RemoteWebDriver();
	w = new ChromeDriver();
	log.info("User launch an chrome Browser");
	} else if (BrowserName.equalsIgnoreCase("Firefox")) {
	//	dc.setBrowserName("firefox");
		//w =new RemoteWebDriver(dc);
	w = new FirefoxDriver();
	log.info("User launch an firefox Browser");
	} 
			repo = new Repoflipkart(w);
	}
	@BeforeMethod
	public void navigateflipkarturl() {
		repo.navigateTosite("https://www.flipkart.com/");
		log.info("User has been redirected to flipkart side");
	}
	@Test
	public void search () throws Exception {
		try {
			repo.closeLogin();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		repo.EnterSerch("mobile");
		log.info("User search an Mobile in search field");
		Thread.sleep(2000);
		
	}
	@Test
	public void viewcart() throws Exception {
		repo.closeLogin();
		log.info("user close login element");
		Thread.sleep(2000);
		repo.viewcart();
		log.info("user click on view cart button");
		Thread.sleep(2000);
	}
	@AfterClass
	public void closeBrowser() {
		repo.closeandbrowser();
		log.info("user close an browser ");
	}
	
}
