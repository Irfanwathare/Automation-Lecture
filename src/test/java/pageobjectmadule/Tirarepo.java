package pageobjectmadule;

import java.security.PrivateKey;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.Advice.Enter;

public class Tirarepo {
	WebDriver w;
public Tirarepo(WebDriver w) {
	PageFactory.initElements(w, this);
	this.w=w;
}
	@FindBy (id="search")
	private WebElement search;
	@FindBy (css="a[class=\"wishlist-icon\"]")
	private WebElement cart;
	@FindBy (linkText = "Men")
	private WebElement Men;	
	@FindBy(linkText = "Shampoo")
	private WebElement Shampoo;	
	
	public void Entersearch(String Search) {
		this.search.sendKeys(Search,Keys.ENTER);		
	}
	public void cart() {
		cart.click();
		}
	Actions act;
	public void men() {
		act=new Actions(w);
		act.moveToElement(Men).perform();
	}
	public void shampoo() {
		act = new Actions(w);
		act.moveToElement(Shampoo).click().perform();
	}
	
}
