package pageobjectmadule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import HybridDrivenframework.Repoflipkart;

public class Assertion {
WebDriver w;
Repoflipkart repo;
@BeforeClass
public void launchbrowser() {
	w=new ChromeDriver();
	repo = new Repoflipkart(w);
}
@BeforeMethod
public void Navigattoflipcart() {
	repo.navigateTosite("https://www.flipkart.com/");
}
@Test
public void search() throws Exception {
	repo.EnterSerch("Mobile");
	Thread.sleep(2000);
	//hart or soft
	Assert.assertEquals(w.getCurrentUrl(), "\"Mobile 5g- Buy Products Online at Best Price in India - All Categories | Flipkart.com\"");
	//soft
	SoftAssert soft =new SoftAssert();
	soft.assertEquals(w.getCurrentUrl(), "Mobile 5g- Buy Products Online at Best Price in India - All Categories | Flipkart.com\\");
	soft.assertEquals(w.getCurrentUrl(), "https://www.flipkart.com/");
	soft.assertAll();
}
@Test
public void cart() throws Exception {
	Thread.sleep(2000);
	try {
		repo.closeLogin();
	} catch (Exception e) {
		// TODO: handle exception
	}
	Thread.sleep(2000);
	repo.viewcart();
	Thread.sleep(2000);
	Assert.assertEquals(w.getTitle(), "Shopping Cart | Flipkart.com");
}
	@AfterClass
	public void closeandBrowser() {
		repo.closeandbrowser();
	}
	
}
