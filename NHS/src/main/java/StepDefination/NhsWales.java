package StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.junit.Assert;
import StepDefination.NhsWalesPageObject;

public class NhsWales {


	WebDriver driver;
	
	ConfigReader config;
	
	

	@Before
	public void setUp() throws InterruptedException 
	{
		config = new ConfigReader();
		
		System.setProperty("webdriver.chrome.driver", config.getChromePath());
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get(config.getUrl());
	    String Homepage = driver.getTitle();
	    System.out.println(Homepage);
	    String expectedtitle = "Check what help you could get to pay for NHS costs";
	    Assert.assertEquals(expectedtitle, Homepage);
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	/*From the Homepage "Start", select "Wales" and navigating to DOB page.*/
	@Given("I am a person from Wales")
	public void i_am_a_person_from_Wales() throws InterruptedException {
		
		//nhsobj.NhsWalesObj();
		NhsWalesPageObject.clickStart(driver).click();
	    String countrypage =driver.getTitle();
	    //System.out.println("The countrypage is:"+countrypage);
	    String expectedtitlecountrypage = "Which country do you live in?";
	    Assert.assertEquals(expectedtitlecountrypage, countrypage);
	    NhsWalesPageObject.selectWales(driver).click();
	    NhsWalesPageObject.clickNextbtn(driver).click();
	    boolean b1= driver.findElement(By.xpath("/html/body/main/div[2]/div/form/details/summary/span")).isDisplayed();
	    System.out.println(b1);
	    Thread.sleep(2000);
	}
	
	@When("I put my circumstances into the Checker tool")
	public void i_put_my_circumstances_into_the_Checker_tool() throws InterruptedException  {
		driver.findElement(By.xpath("/html/body/main/div[2]/div/form/div[1]/fieldset/div/div[1]/input")).sendKeys(config.getDay());
	    Thread.sleep(2000);
	    driver.findElement(By.name("dateOfBirth.month")).sendKeys(config.getMonth());
	    Thread.sleep(2000);
	    driver.findElement(By.name("dateOfBirth.year")).sendKeys(config.getYear());
	    Thread.sleep(2000);
	    NhsWalesPageObject.clickNextbtn(driver).click();
	    String partnerpage =driver.getTitle();
	    //System.out.println("The partnerpage is:"+partnerpage);
	    String expectedtitlepartnerpage = "Do you live with a partner?";
	    Assert.assertEquals(expectedtitlepartnerpage, partnerpage);
	    
	    /*partner page*/
	    
	    driver.findElement(By.xpath("/html/body/main/div[2]/div/form/div[1]/fieldset/div/label[2]")).click();
	    NhsWalesPageObject.clickNextbtn(driver).click();
	    String benifitspage =driver.getTitle();
	    //System.out.println("The partnerpage is:"+benifitspage);
	    String expectedtitlebenifitspage = "Do you claim any benefits or tax credits?";
	    Assert.assertEquals(expectedtitlebenifitspage, benifitspage);
	    
	    driver.findElement(By.xpath("/html/body/main/div[2]/div/form/div[1]/fieldset/div/label[2]")).click();
	    NhsWalesPageObject.clickNextbtn(driver).click();
	    
	    String pregnantpage =driver.getTitle();
	    //System.out.println("The partnerpage is:"+pregnantpage);
	    String expectedtitlepregnantpage = "Are you pregnant or have you given birth in the last 12 months?";
	    Assert.assertEquals(expectedtitlepregnantpage, pregnantpage);
	    
	    driver.findElement(By.xpath("/html/body/main/div[2]/div/form/div[1]/fieldset/div/label[2]")).click();
	    NhsWalesPageObject.clickNextbtn(driver).click();
	    
	    String illpage =driver.getTitle();
	    //System.out.println("The partnerpage is:"+illpage);
	    String expectedtitleillpage = "Do you have an injury or illness caused by serving in the armed forces?";
	    Assert.assertEquals(expectedtitleillpage, illpage);
	    
	    driver.findElement(By.xpath("/html/body/main/div[2]/div/form/div[1]/fieldset/div/label[2]")).click();
	    NhsWalesPageObject.clickNextbtn(driver).click();
	    String diabeticpage =driver.getTitle();
	   // System.out.println("The partnerpage is:"+diabeticpage);
	    String expectedtitlediabeticpage = "Do you have diabetes?";
	    Assert.assertEquals(expectedtitlediabeticpage, diabeticpage);
	    
	    /*Diabetic page*/
	    driver.findElement(By.xpath("/html/body/main/div[2]/div/form/div[1]/fieldset/div/label[2]")).click();
	    NhsWalesPageObject.clickNextbtn(driver).click();
	 
	    String glaucomapage =driver.getTitle();
	    //System.out.println("The partnerpage is:"+glaucomapage);
	    String expectedtitleglaucomapage = "Do you or a family member have glaucoma?";
	    Assert.assertEquals(expectedtitleglaucomapage, glaucomapage);
	    
	    /*Do you or a family member have glaucoma?*/
	    
	    driver.findElement(By.xpath("/html/body/main/div[2]/div/form/div[1]/fieldset/div/label[2]")).click();
	    NhsWalesPageObject.clickNextbtn(driver).click();
	    
	    String carehomepage =driver.getTitle();
	    //System.out.println("The partnerpage is:"+carehomepage);
	    String expectedtitlecarehomepage = "Do you live permanently in a care home?";
	    Assert.assertEquals(expectedtitlecarehomepage, carehomepage);
	    
	    
	    /*Do you live permanently in a care home?*/
	    
	    driver.findElement(By.xpath("/html/body/main/div[2]/div/form/div[1]/fieldset/div/label[2]")).click();
	    NhsWalesPageObject.clickNextbtn(driver).click();
	    
	    
	    String savingpage =driver.getTitle();
	    //System.out.println("The partnerpage is:"+savingpage);
	    String expectedtitlesavingpage = "Do you have more than £16,000 in savings, investments or property?";
	    Assert.assertEquals(expectedtitlesavingpage, savingpage);
	        		 
	    
	}

	@Then("I should get a result of whether I will get help or not")
	public void i_should_get_a_result_of_whether_I_will_get_help_or_not() {
		
		 /*savings page*/
		driver.findElement(By.xpath("/html/body/main/div[2]/div/form/div[1]/fieldset/div/label[2]")).click();
		NhsWalesPageObject.clickNextbtn(driver).click();
	    
	    driver.findElement(By.xpath("/html/body/main/div[2]/div/div[3]/div[2]/a")).isDisplayed();
	    
	    String helppage = driver.getTitle();
	    System.out.println("The helppage is: " +helppage);
	    String expectedtitlehelppage = "You get help with health costs";
	 
	    if(helppage.equals(expectedtitlehelppage))
	    {
	    	System.out.println("You get help with NHS health costs, so that you can get the treatment you need");
	    }
	    else
	    {
	    	System.out.println("Sorry!!...You will not get help with NHS health costs");
	    }
	}

	@After
	public void TearDown()
	{
		driver.close();
	    driver.quit();
	}
}
