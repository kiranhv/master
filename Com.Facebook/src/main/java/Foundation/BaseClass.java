package Foundation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ConfigReader.Reader;

public class BaseClass {
	
	static WebDriver driver;
	
	public static void Setup()
	{
		driver= new ChromeDriver();
		Reader read=new Reader();
		System.setProperty("Webdriver.chrome.driver",read.getChromepath());
		driver.get(read.getURL());
		driver.manage().window().maximize();
		
	}
}