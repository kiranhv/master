package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTest {

	WebDriver driver;
	@Given("^Open Chrome URL$")
	public void open_Chrome_URL() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "E:\\Chrome driver\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver, 20);	
   
	}

	@When("^I Enter valid \"([^\"]*)\" and valid \"([^\"]*)\"$")
	public void i_Enter_valid_and_valid(String uname, String pass) throws Throwable {
		
	driver.findElement(By.xpath("//*[@id='email']")).sendKeys(uname);
	//driver.findElement(By.id("email")).sendKeys(uname);
    driver.findElement(By.id("pass")).sendKeys(pass);
    
  //*[@id="email"]
	}

	@Then("^User should be able to login successfully$")
	public void user_should_be_able_to_login_successfully() throws Throwable {
		
		driver.findElement(By.id("loginbutton")).click();
		WebDriverWait wait=new WebDriverWait(driver, 20);
		
		 
	}
	
	@Then("^Close the browser$")
	public void close_the_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.close();
	}
	
}
