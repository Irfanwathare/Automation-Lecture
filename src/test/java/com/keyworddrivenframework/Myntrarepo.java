package com.keyworddrivenframework;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Myntrarepo {


	 private WebDriver w;
		public Myntrarepo(WebDriver w) {
			this.w = w;
		}
//		1.Without pageFactory --> by locator
//		2.With pageFactory
//		Locator -->
		 private By search = By.cssSelector("input[class=\"desktop-searchBar\"]");
		 private By ProductName = By.className("product-product");
		 private By Sizes = By.xpath("//*[@class=\"size-buttons-size-buttons\"]/div/div/button");
		 private By AddToBag =By.cssSelector("div.pdp-add-to-bag.pdp-button.pdp-flex.pdp-center");
		 private By next = By.cssSelector("li[class=\"pagination-next\"]");
//		Actions --> Set methods 
		public void EnterSearch(String search) {
			w.findElement(this.search).sendKeys(search);
		}
		public void SumbitSearch() {
			w.findElement(search).sendKeys(Keys.ENTER);
		}
		public void ClearSearch() {
			w.findElement(search).sendKeys(Keys.CONTROL,"a",Keys.BACK_SPACE);
		}
		public void FirstProduct() {
			w.findElement(ProductName).click();
		}
		public void SelectProduct(String ProductName) {
			while (true) {
				List<WebElement> pn =	w.findElements(this.ProductName);
				for (WebElement p : pn) {
					if (p.getText().equalsIgnoreCase(ProductName)||p.getText().contains(ProductName)) {
						p.click();
						return;
					}
				}
				w.findElement(next).click();
			}	
		}
		public void SelectSize(String size) {
			List<WebElement> si = w.findElements(Sizes);
			for (WebElement s : si) {
				if (s.getText().equalsIgnoreCase(size)) {
					s.click();
					break;
				}
			}
		}
		public void AddToBag() {
			w.findElement(AddToBag).click();
		}
	}


