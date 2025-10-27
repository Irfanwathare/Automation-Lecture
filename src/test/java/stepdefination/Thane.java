package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Thane {
WebDriver w;
@Given ("Launch an ChromeBrowser.")
public void launch_an_chrome_Browser() {
	w=new ChromeDriver();			
}
@Given("Navigate to ThaneMuncipalCorporation")
public void navigate_to_thane_muncipal_corporation() {
	w.get("http://103.228.150.75/MainetService/");
}
@When("User Enter {string} in UserID field.")
public void user_enter_in_user_id_field(String Userid) {
	w.findElement(By.name("adminEmployee.emploginname")).sendKeys(Userid);	
}

@When("User Enter {string} in password field.")
public void User_enter_in_password_field(String password) {
	w.findElement(By.id("adminEmployee.emppassword")).sendKeys(password);	
}
@When("user select Thane Muncipal Corportaion from the select organisation dropdown.")
public void user_select_from_the_select_organisation_dropdown() {
	w.findElement(By.xpath("//*[@class=\"chosen-single\"]")).click();
	w.findElement(By.xpath("//*[@class=\"chosen-results\"]/li[2]")).click();
}
@When("user click on sumbit button.")
public void user_click_on_submit_button() {
	w.findElement(By.cssSelector("input[class=\"btn btn-success btn-block\"]")).click();	
}
@Then("Validation of login by url and title.")
public void validation_of_login_by_url_and_title() throws Exception {
	Thread.sleep(2000);
	SoftAssert soft =new SoftAssert();
	soft.assertEquals(w.getCurrentUrl(),"http://103.228.150.75/MainetService/AdminHome.html?");
	soft.assertEquals(w.getTitle(),"ठाणे महानगरपालिका, ठाणे.");
	soft.assertAll();
}
@Then("close the ChromeBrowser.")
public void close_the_chrome_browser() {
	w.quit();

}

	
}
