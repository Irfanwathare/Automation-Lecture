package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
WebDriver W;
@Given("user launch an chromebrowser")
public void user_launch_an_chromebrowser() {
	W= new ChromeDriver();		
}
@Given("user navigate to practicetestautomation")
public void user_navigate_to_practicetestautomation() {
	W.get("https://practicetestautomation.com/practice-test-login/");
}
@When("Enter {String} in User NameField.")
public void Enter_in_user_name_field(String user) {
	W.findElement(By.name("username")).sendKeys(user);
}
@When("Enter{String} in Password Field.")
public void Enter_In_Password_field(String Pass) {
W.findElement(By.id("password")).sendKeys(Pass);	
}
@When("User click on submit button.")
public void User_click_On_submit_Button() {
	W.findElement(By.id("submit")).click();
}
@Then("Verify User login or not by {String}.")
public void Verify_User_Login_or_not_by_(String title) {
Assert.assertEquals(W.getTitle().contains(title),true);
}
@Then("close the browser")
public void close_the_browser() {
	W.quit();
}



}
