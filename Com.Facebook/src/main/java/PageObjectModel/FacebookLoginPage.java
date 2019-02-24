package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Foundation.BaseClass;

public class FacebookLoginPage {
	
	static WebDriver driver;
	
	By username=By.xpath("//*[@id=\'email\']");
	By password = By.id("email");
	By login=By.xpath("//*[@id=\'u_0_2\']");

	
	/*public FacebookLoginPage(WebDriver driver)
	{
		FacebookLoginPage.driver=driver;
	}*/
	
	public WebElement typeUsername()
	{
		return driver.findElement(username);
	}
	public WebElement typePassword()
	{
		return driver.findElement(password);
	}
	
	public WebElement ClickOnLoginButton()
	{
		return driver.findElement(login);
	}
	
}
