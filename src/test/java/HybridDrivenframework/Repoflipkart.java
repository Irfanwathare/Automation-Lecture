package HybridDrivenframework;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Repoflipkart extends Utility{

	public Repoflipkart(WebDriver w) {
		super(w);
		PageFactory.initElements(w, this);	
	}
	@FindBy(name="q")
	private WebElement search;
	@FindBy (className="CGtC98")
	private WebElement product;
	@FindBy(css = "button[class=\"QqFHMw vslbG+ In9uk2\"]")
	private WebElement gotocard;
	@FindBy(css = "button[class=\"QqFHMw vslbG+ _3Yl67G _7PdlFp\"]")
	private WebElement buyNow;
	@FindBy(css= "a[title=\"Cart\"]")
	private WebElement viewcart;
	@FindBy(css= "span[class=\"_30XB9F\"]")
	private WebElement closelogin;
	public void EnterSerch(String Search) {
		this.search.sendKeys(Search,Keys.ENTER);	
	}
	public void clearSearch() {
			search.sendKeys(Keys.CONTROL,"a",Keys.BACK_SPACE);
	
		}
		
		public void Clickfirstproduct() {
			product.click();
		}
		public void goTocart() {
			gotocard.click();
		}
		public void buyNow() {
			buyNow.click();
		}
		
		public void viewcart() {
			viewcart.click();
		}
		public void closeLogin() {
			closelogin.click();
			// TODO Auto-generated method stub
			
		}}

