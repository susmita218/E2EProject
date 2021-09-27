package CucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:/Users/hp/workspace2/E2EProject/src/test/java/features", 
		glue="stepDefinitions"
		)

public class TestRunner {

}
