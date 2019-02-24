package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="features",
				glue="StepDefination",
				plugin= {"json:target/Report.json"},
				monochrome= true)
public class TestRunner {

}
