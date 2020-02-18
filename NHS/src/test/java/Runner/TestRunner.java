package Runner;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(features={"src/test/resources/NHSWALES.feature"},
				  glue={"StepDefination"},
				  format={"pretty","html:target/cucumber-html-report"},
				  monochrome = true
				 )
public class TestRunner {

	
}
