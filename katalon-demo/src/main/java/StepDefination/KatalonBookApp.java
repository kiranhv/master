package StepDefination;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class KatalonBookApp {

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
	    String expectedtitle = "CURA Healthcare Service";
	    Assert.assertEquals(expectedtitle, Homepage);
	    
	}
	
	@Given("Access webpage and click on make appointment button and Enter vaild user name and password")
	public void access_webpage_and_click_on_make_appointment_button_and_Enter_vaild_user_name_and_password() {
		KatalonBookAppPageObject katalonbookapp = PageFactory.initElements(driver, KatalonBookAppPageObject.class);
		katalonbookapp.getuserName(config.getUsername(), config.getPassword());
	}

	@Then("Click on Login button")
	public void click_on_Login_button() {
		KatalonBookAppPageObject katalonbookapp = PageFactory.initElements(driver, KatalonBookAppPageObject.class);
		katalonbookapp.clickLoginbtn();
	}

	@Then("Complete the Make appointment page and click on Book appointment button")
	public void complete_the_Make_appointment_page_and_click_on_Book_appointment_button() {
		KatalonBookAppPageObject katalonbookapp = PageFactory.initElements(driver, KatalonBookAppPageObject.class);
		katalonbookapp.bookAppPage(config.getComment(),config.getVisitDate());
				
	}

	@Then("Go Back to Home page and Click on Logout")
	public void go_Back_to_Home_page_and_Click_on_Logout() {
		KatalonBookAppPageObject katalonbookapp = PageFactory.initElements(driver, KatalonBookAppPageObject.class);
		katalonbookapp.clickLogoutbtn();
	}
	
	@After
	public void TearDown()
	{
		BrowserFactory.QuitBrowser(driver);
	}
}
