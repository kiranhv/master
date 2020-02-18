package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class PortalLogin {

	WebDriver driver;
	
	ConfigReader config;
	
	public void Login()
	{
		config = new ConfigReader();
		
		System.setProperty("webdriver.chrome.driver", config.getChromePath());
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get(config.getUrl());
	    
	    driver.findElement(By.xpath("//*[@id='user_username']")).sendKeys(config.getUsername());
		driver.findElement(By.xpath("//*[@id='user_password']")).sendKeys(config.getPassword());
	    driver.findElement(By.xpath("//*[@id='signin']")).click();
	}
	
	
	public void Logout()
	{
			driver.findElement(By.xpath("/html/body/header/div/div/div[2]/nav/ul/li[3]/a")).click();
		    driver.close();
		    driver.quit();
	}

}
