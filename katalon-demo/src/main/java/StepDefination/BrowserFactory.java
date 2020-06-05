package StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
	
	static ConfigReader config;
	
		
	public static WebDriver StartApplication(WebDriver driver, String browserName)
	{
		if(browserName.equals("Chrome"))
		{
			config = new ConfigReader();
			System.setProperty("webdriver.chrome.driver", config.getChromePath());
		    driver = new ChromeDriver();
		    
		}
		else if(browserName.equals("FireFox"))
		{
			
		}
		else if(browserName.equals("IE"))
		{
			
		}
		else
		{
			System.out.println("Sorry Browser doesn't support");
		}
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    return driver;
	}

	public static void QuitBrowser(WebDriver driver)
	{
		//driver.quit();
		driver.close();
	}
}
