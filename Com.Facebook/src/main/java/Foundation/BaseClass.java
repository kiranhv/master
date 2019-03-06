package Foundation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ConfigReader.Reader;

public class BaseClass {
	
public static WebDriver driver;
	
	public WebDriver getDriver()
	{
		Reader read=new Reader();
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + read.getChromepath());
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
		
	}
	
	
	public static void main(String...args) {
		
		/*
		 * BaseClass b=new BaseClass(); b.setup();
		 */
	}
}