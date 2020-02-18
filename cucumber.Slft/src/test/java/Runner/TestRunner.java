package Runner;

//import StepDefination.PortalLogin;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(features={"src/test/resources/Slft.feature"},
				  glue={"StepDefination"}
//				  plugin={"pretty","html:target/cucumber-html-report"}
				 )
public class TestRunner {

	
}
