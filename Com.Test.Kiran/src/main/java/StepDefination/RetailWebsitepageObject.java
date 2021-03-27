package StepDefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RetailWebsitepageObject {
	
	WebDriver driver;
	
	ConfigReader config;
	public RetailWebsitepageObject(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	
	@FindBy(partialLinkText="Sign") WebElement signinlink;
	@FindBy(id="email") WebElement username;
	@FindBy(id="passwd") WebElement password;
	@FindBy(id="SubmitLogin") WebElement signinBtn;
	
	
	@FindBy(xpath="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/a") WebElement Tshirtlink;
	@FindBy(xpath="/html/body/div[2]/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a") WebElement proceedBtn;
	
	@FindBy(id="txt_visit_date") WebElement Visitdate;
	@FindBy(xpath="/html/body/div/div[1]/table/tbody/tr[2]/td[4]") WebElement selectDate;
	
	@FindBy(id="txt_comment") WebElement enterComment;
	@FindBy(id="btn-book-appointment") WebElement Bookappbtn;
	//@FindBy(css="#summary > div > div > div:nth-child(7) > p > a") WebElement backtoHomePage;
	@FindBy(id="menu-toggle") WebElement menu;
	@FindBy(xpath="//*[@id='sidebar-wrapper']/ul/li[5]/a") WebElement logoutbtn;
	
	public void getuserName(String uname, String pass)
	{
		signinlink.click();
		username.sendKeys(uname);
		password.sendKeys(pass);
	}
	
	public void clickSigninbtn()
	{
		signinBtn.click();
		
		if(driver.getPageSource().contains("My account")){
	    	System.out.println("Login pgae Validation: Text is present");
	    	}else{
	    	System.out.println("Login pgae Validation: Text is not present");
	    	}
		
		String validationLoginPage = driver.getTitle();
	    System.out.println("Login pgae Validation:" +validationLoginPage);
	    String expectedtitle = "My account - My Store";
	    Assert.assertEquals(expectedtitle, validationLoginPage);
	}
	
	public void selectTshirt() throws InterruptedException
	{
		Tshirtlink.click();
		
		String validationTshirtPage = driver.getTitle();
	    System.out.println("T-shirt page:" +validationTshirtPage);
	    String expectedtitle = "T-shirts - My Store";
	    Assert.assertEquals(expectedtitle, validationTshirtPage);	    
		
		Actions action = new Actions(driver);
	    WebElement we = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[3]/div[2]/ul/li/div/div[1]/div/a[1]/img"));
	    action.moveToElement(we).moveToElement(driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li/div/div[2]/div[2]/a[1]/span"))).click().build().perform();
	     
	    String validationcartPage = driver.getTitle();
	    System.out.println("Cart page:" +validationcartPage);
	    String expectedcarttitle = "T-shirts - My Store";
	    Assert.assertEquals(expectedcarttitle, validationcartPage);
	    
	    driver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div[3]/div/div/div[4]"));
	    @SuppressWarnings("deprecation")
		WebDriverWait wait = new WebDriverWait(driver,30);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a")));
	    // click on the proceed button as soon as the "proceed to Checkout" button is visible
	    proceedBtn.click();
	    	   
	    String validationcheckoutPage = driver.getTitle();
	    System.out.println("Checkoutpage1:" +validationcheckoutPage);
	    String expectedcheckouttitle = "Order - My Store";
	    Assert.assertEquals(expectedcheckouttitle, validationcheckoutPage);
	    
	    //Summary page
	    
	    driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/p[2]"));
	    driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/p[2]/a[1]")).click();
	    	    
	    String validationsummarypage = driver.getTitle();
	    System.out.println("Summarypage:" +validationsummarypage);
	    String expectedsummarypage = "Order - My Store";
	    Assert.assertEquals(expectedsummarypage, validationsummarypage);
	    
	    //Address page
	    driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/form/p"));
	    driver.findElement(By.name("processAddress")).click();
	    	    
	    String validationaddresspage = driver.getTitle();
	    System.out.println("Addresspage:" +validationaddresspage);
	    String expectedaddresspage = "Order - My Store";
	    Assert.assertEquals(expectedaddresspage, validationaddresspage);
	    
	    // Shipping page
	    
	    driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form"));
	    
	    driver.findElement(By.id("cgv")).click();
	    
	    driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/p"));
	    driver.findElement(By.name("processCarrier")).click();
	    
	    String validationshippingpage = driver.getTitle();
	    System.out.println("Shippingpage:" +validationshippingpage);
	    String expectedshippingpage = "Order - My Store";
	    Assert.assertEquals(expectedshippingpage, validationshippingpage);
	    
	    //Payment Page
	    
	    driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[3]/div[1]/div/p/a")).click();
	    
	    String validationpaymentpage = driver.getTitle();
	    System.out.println("Paymentpage:" +validationpaymentpage);
	    String expectedpaymentpage = "My Store";
	    Assert.assertEquals(expectedpaymentpage, validationpaymentpage);
	    
	    //Confirm order
	    
	    driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/form/p"));
	    driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/form/p/button")).click();	
	    
	    
	    String validationconfirmpage = driver.getTitle();
	    System.out.println("Paymentpage:" +validationconfirmpage);
	    String expectedconfirmpage = "Order confirmation - My Store";
	    Assert.assertEquals(expectedconfirmpage, validationconfirmpage);
	    
	    // verify order
	    
	    driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div"));
	    String text = driver.findElement(By.tagName("div")).getAttribute("innerText");
	    //System.out.println(text);
	    if(text.contains("order reference")){
	    	System.out.println("Order is placed successfully");
	    	}else{
	    	System.out.println("Order is not plcaed sucessfully");
	    	}
	    	    
	    // Back to orders
	    
	    driver.findElement(By.linkText("Back to orders")).click();
	    
	    String validationorderhistorypage = driver.getTitle();
	    System.out.println("Orderhistorypage:" +validationorderhistorypage);
	    String expectedorderhistorypage = "Order history - My Store";
	    Assert.assertEquals(expectedorderhistorypage, validationorderhistorypage);
	    
	}
}	 
