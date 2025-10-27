package pageobjectmadule;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotationtestng {
	@BeforeSuite
	public void beforsuit(){
		System.out.println("This is an beforesuit method ");
		
	}
	@BeforeTest
	public void beforetest(){
		System.out.println("This is an befortest method ");
	}
	
	@BeforeClass
	public void BeforeClass(){
		System.out.println("This is an BeforeClass method ");
	}
	@BeforeMethod
	public void BeforeMethod(){
		System.out.println("This is an BeforeMethod method ");
	}
	@Test
	public void testcase1() {
		System.out.println("This is an first condition ");
	}
	@Test
	public void testcase2() {
		System.out.println("This is an second condition ");
	}
	//post condition
	@AfterMethod
	public void Aftermethod () {
		System.out.println("This is an after Method");
	}
	@AfterClass
	public void AfterClass () {
		System.out.println("This is an AfterClass");
	}
	@AfterTest
	public void Aftertest () {
		System.out.println("This is an Aftertest");
	}
	@AfterTest
	public void Aftersuit () {
		System.out.println("This is an Aftersuit");
	}			
}

	
	







