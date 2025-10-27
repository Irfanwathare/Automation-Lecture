package HybridDrivenframework;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class Utility {
	WebDriver w;
	String main;
	public Utility(WebDriver w) {
		this.w=w;
	}
public void navigateTosite(String url) {
	w.get(url);		
}
public void switchwindowformmainToEmbedd() {
	String main =w.getWindowHandle();
	this.main=main;
	Set<String>multi =w.getWindowHandles();
	for (String m : multi) {
		if (!m.equals(main)) {
			w.switchTo().window(m);
		}
	}
}
public void switchWindowFormEmbeddTomain()  {
	
	w.switchTo().window(main);
}
public void closeandbrowser() {
	w.quit();
	
}
}
