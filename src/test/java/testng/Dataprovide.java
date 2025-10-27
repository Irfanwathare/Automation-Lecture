package testng;
import org.testng.annotations.DataProvider;

public class Dataprovide {
	@DataProvider(name="FlipkartSearch")
	public String[] search() {
		String[] search =new String[6];
		search[0]="mobile";
		search[1]="smartwatch";
		search[2]="tv";
		search[3]="AC";
		search[4]="Remote control car";
		search[5]="fan";
		
		return search;
		
	}
@DataProvider(name="TurboViPlay")
public String[] []login(){
	String[][]login=new String[3][2];
	login[0][0]="hello";
	login[0][1]="Hadassh@1234";
	
	
	login[1][0]="helo";
	login[1][1]="helo@546787";
	
	
	login[2][0]="demo";
	login[2][1]="hytgho@87658";
	
	return login;
	
}
}
