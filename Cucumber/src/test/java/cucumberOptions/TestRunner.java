package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/automationTCs/Homepage.feature",
		glue = "stepDefinitionFiles"
		)
public class TestRunner {

}
