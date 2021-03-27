package Runner;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(features={"src/test/resources/OrderTshirt.feature"},
				  glue={"StepDefination"},
				  format={"pretty","html:target/cucumber-html-report"},
				  monochrome = true,
				  tags={"@Smoke"}
				 )
public class TestRunner {

	
}
