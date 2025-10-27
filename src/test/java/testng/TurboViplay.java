package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TurboViplay {

	DesiredCapabilities dc;
//		WebDriver w;
	RemoteWebDriver w;
		@BeforeClass
		public void launchAndbrowser() {
			 dc = new DesiredCapabilities();
			 dc.setPlatform(Platform.LINUX);
			 dc.setBrowserName("chrome");
			w = new RemoteWebDriver(dc);
//			w=new ChromeDriver();
		}
	@BeforeMethod
	public void NavigateTosite() {
		w.get("https://turboviplay.com/login");	
	}
	
	@Test(dataProviderClass=Dataprovide.class,dataProvider="TurboViPlay")
	public void invalidloginTesting(String Username,String Password) throws Exception {
	Thread.sleep(2000);
	w.findElement(By.id("email")).sendKeys(Username);
	Thread.sleep(2000);
	w.findElement(By.id("password")).sendKeys(Password);
	Thread.sleep(2000);
	w.findElement(By.id("btn-login")).click();
	String errormessage=w.findElement(By.cssSelector("div[class=\"text-danger mt-1 ms-2\"]")).getText();
	
	Assert.assertEquals(errormessage.trim(), "Incorrect login email");		

}
@AfterClass
public void closeBrowser() {
	w.quit();
}
}
