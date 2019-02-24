package StepDefination;

import org.openqa.selenium.WebDriver;

import Foundation.BaseClass;
import PageObjectModel.FacebookLoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FacebookLogin extends BaseClass{
	
	WebDriver driver;
	public FacebookLogin(WebDriver driver)
	{
		this.driver=driver;
	}
			
	@Given("^Open Chrome URL$")
	public void open_Chrome_URL() throws Throwable {
		BaseClass.Setup();
	}
	FacebookLoginPage loginpage=new FacebookLoginPage();
	@When("^I Enter valid \"(.*?)\" and valid \"(.*?)\"$")
	public void i_Enter_valid_and_valid(String uname, String pass) throws Throwable {
		loginpage.typeUsername().sendKeys(uname);
		loginpage.typePassword().sendKeys(pass);
		
	}

	@Then("^User should be able to login successfully$")
	public void user_should_be_able_to_login_successfully() throws Throwable {
	   loginpage.ClickOnLoginButton().click();
	}

	@Then("^Close the browser$")
	public void close_the_browser() throws Throwable {
	    driver.close();
	}



}
