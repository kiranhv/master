package StepDefination;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RetailWebsite {

	WebDriver driver;
	
	ConfigReader config;
	
	@Before
	public void setUp() throws InterruptedException
	{
		driver = BrowserFactory.StartApplication(driver, "Chrome");
		config = new ConfigReader();
	    driver.get(config.getUrl());
	    String Homepage = driver.getTitle();
	    System.out.println(Homepage);
	    String expectedtitle = "My Store";
	    Assert.assertEquals(expectedtitle, Homepage);
	    
	}
	
	@Given("Access webpage and click sign in button and Enter vaild user name & password")
	public void access_webpage_and_click_sign_in_button_and_Enter_vaild_user_name_password() {
		RetailWebsitepageObject retailwebapp = PageFactory.initElements(driver, RetailWebsitepageObject.class);
		retailwebapp.getuserName(config.getUsername(), config.getPassword());
	}

	@Then("Click on Signin button")
	public void click_on_Signin_button() {
		RetailWebsitepageObject retailwebapp = PageFactory.initElements(driver, RetailWebsitepageObject.class);
		retailwebapp.clickSigninbtn();
	}

	@Then("Goto Tshirt page and select	Tshirt and add to cart and proceed checkout and confirm order and verify order")
	public void goto_Tshirt_page_and_select_Tshirt_and_add_to_cart_and_proceed_checkout_and_confirm_order_and_verify_order() throws InterruptedException {
		RetailWebsitepageObject retailwebapp = PageFactory.initElements(driver, RetailWebsitepageObject.class);
		retailwebapp.selectTshirt();
		
		}
	
	@After
	public void TearDown()
	{
		BrowserFactory.QuitBrowser(driver);
	}
}
