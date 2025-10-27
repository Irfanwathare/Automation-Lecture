package pom.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		features= "Features",
		glue ="stepdefination",
		tags="@login",
		plugin="html:./CucumberReport/report.html"
		)
public class Run extends AbstractTestNGCucumberTests{

	
}
