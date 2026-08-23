package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/features"},
		glue = {"steps"},
		plugin = {"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		dryRun = false,
		monochrome = true,
		tags= "@pExce1"
		
		) 
		
		//name = {"Logo"}
////// samson javadala

public class TestRunner {

	
	
}
