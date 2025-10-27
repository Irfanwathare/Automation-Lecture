package pageobjectmadule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testngdemo {
	
@Test(priority = 0)
public void google () {

	WebDriver w = new ChromeDriver();
	w.get("https://www.google.com/");
		
}

@Test(priority = 1,enabled = true)
public void facebook () throws Exception {

	WebDriver w = new ChromeDriver();
	Thread.sleep(5000);
	w.get("https://www.facebook.com/");
		
}
}