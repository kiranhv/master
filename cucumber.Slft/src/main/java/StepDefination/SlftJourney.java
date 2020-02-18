package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SlftJourney extends PortalLogin{
	
	WebDriver driver;
	
	ConfigReader config;
	
	PortalLogin log = new PortalLogin();
	
	
	@Before
	public void setUp() throws InterruptedException 
	{
		config = new ConfigReader();
		
		System.setProperty("webdriver.chrome.driver", config.getChromePath());
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get(config.getUrl());
	    
	    driver.findElement(By.xpath("//*[@id='user_username']")).sendKeys(config.getUsername());
		driver.findElement(By.xpath("//*[@id='user_password']")).sendKeys(config.getPassword());
	    driver.findElement(By.xpath("//*[@id='signin']")).click();
	    
	    Thread.sleep(3000);
	     
	}
	
	@After
	public void TearDown()
	{
		driver.findElement(By.xpath("/html/body/header/div/div/div[2]/nav/ul/li[4]/a")).click();
	    driver.close();
	    driver.quit();
	}
	
	
	@When("Login to Portal")
	public void login_to_Portal() {
	    //log.Login();
	}
	
	@Then("click on SLft button")
	public void click_on_SLft_button() throws InterruptedException {
		driver.findElement(By.linkText("Create SLfT return")).click();
		System.out.println("Inside click");
		Thread.sleep(2000);
	}
	
	
	@Then("Logout from Portal")
	public void logout_from_Portal() {
	   // log.Logout();
	}

}
