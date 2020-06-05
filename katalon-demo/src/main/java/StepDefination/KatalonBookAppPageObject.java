package StepDefination;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class KatalonBookAppPageObject {
	
	WebDriver driver;
	
	ConfigReader config;
	public KatalonBookAppPageObject(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	
	@FindBy(css="#btn-make-appointment") WebElement makeappbtn;
	@FindBy(id="txt-username") WebElement username;
	@FindBy(id="txt-password") WebElement password;
	@FindBy(id="btn-login") WebElement loginBtn;
	
	@FindBy(id="combo_facility") WebElement FacilityDD;
	@FindBy(id="radio_program_medicaid") WebElement HealthRadiobtn;
	
	@FindBy(id="txt_visit_date") WebElement Visitdate;
	@FindBy(xpath="/html/body/div/div[1]/table/tbody/tr[2]/td[4]") WebElement selectDate;
	
	@FindBy(id="txt_comment") WebElement enterComment;
	@FindBy(id="btn-book-appointment") WebElement Bookappbtn;
	//@FindBy(css="#summary > div > div > div:nth-child(7) > p > a") WebElement backtoHomePage;
	@FindBy(id="menu-toggle") WebElement menu;
	@FindBy(xpath="//*[@id='sidebar-wrapper']/ul/li[5]/a") WebElement logoutbtn;
	
	public void getuserName(String uname, String pass)
	{
		makeappbtn.click();
		username.sendKeys(uname);
		password.sendKeys(pass);
	}
	
	public void clickLoginbtn()
	{
		loginBtn.click();
		
		if(driver.getPageSource().contains("Make Appointment")){
	    	System.out.println("Login pgae Validation: Text is present");
	    	}else{
	    	System.out.println("Login pgae Validation: Text is absent");
	    	}
		
		String validationLoginPage = driver.getTitle();
	    System.out.println("Login pgae Validation:" +validationLoginPage);
	    String expectedtitle = "CURA Healthcare Service";
	    Assert.assertEquals(expectedtitle, validationLoginPage);
	}
	
	public void bookAppPage(String comment, String visitdate)
	{
		Select facility = new Select(FacilityDD);
		facility.selectByIndex(1);
		HealthRadiobtn.click();
		Visitdate.sendKeys(visitdate);
		//Visitdate.click();
		//selectDate.click();
		enterComment.sendKeys(comment);
		Bookappbtn.click();	
		
		if(driver.getPageSource().contains("Appointment Confirmation")){
	    	System.out.println("BookAppPageValidation: Appointment Confirmation Text is present");
	    	}else{
	    	System.out.println("BookAppPageValidation: Appointment Confirmation Text is absent");
	    	}
	}
	
	public void clickLogoutbtn()
	{
		//backtoHomePage.click();
		menu.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		logoutbtn.click();
		
		if(driver.getPageSource().contains("We Care About Your Health")){
	    	System.out.println("LogoutPageValidation: Text is present");
	    	}else{
	    	System.out.println("LogoutPageValidation: Text is absent");
	    	}		
	}
}

