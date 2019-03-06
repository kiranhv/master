package StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import Foundation.BaseClass;
import PageObjectModel.FacebookLoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FacebookLogin extends BaseClass{
	
	WebDriver driver;
	
	FacebookLoginPage loginpage=new FacebookLoginPage();
	
	/*
	 * public FacebookLogin() { this.driver=setup(); }
	 */
	
	public FacebookLogin() {
		this.driver=getDriver();
		
	}
	
	@Given("^Open Chrome URL$")
	public void open_Chrome_URL() throws Throwable {
	//setup();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
	}
	


	@When("^I Enter valid \"(.*?)\" and valid \"(.*?)\"$")
	public void i_Enter_valid_and_valid(String uname, String pass) throws Throwable {
		loginpage.typeUsername().sendKeys(uname);
		loginpage.typePassword().sendKeys(pass);
		
	}

	@Then("^User should be able to login successfully$")
	public void user_should_be_able_to_login_successfully() throws Throwable {
		WebDriverWait wait=new WebDriverWait(driver, 10);
		loginpage.ClickOnLoginButton().click();
	}

	@Then("^Close the browser$")
	public void close_the_browser() throws Throwable {
		driver.quit();
	}

}
