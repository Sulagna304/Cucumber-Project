package Steps;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/resources/Feature",
		glue = {"Steps"},
		plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json" },
		monochrome = true
		)

public class TestRunner {
	
	

}
