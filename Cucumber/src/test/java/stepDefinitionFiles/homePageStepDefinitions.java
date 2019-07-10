package stepDefinitionFiles;

//import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class homePageStepDefinitions {

    @Given("^Selenium HQ URL$")
    public void selenium_hq_url() throws Throwable {
    	System.out.println("Selenium HQ URL");
    }

    @When("^Launch URL$")
    public void launch_url() throws Throwable {
        System.out.println("URL launched");
    }

    @Then("^Title Should be Selenium HQ$")
    public void title_should_be_selenium_hq() throws Throwable {
    	System.out.println("Title displayed as Selenium HQ");
    }

    @Then("^Verify Selenium download link$")
    public void verify_selenium_download_link() throws Throwable {
    	System.out.println("Selenium download link is displayed in Selenium HQ");
    }

}