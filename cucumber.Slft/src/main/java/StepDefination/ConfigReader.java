package StepDefination;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	Properties pro;
	
	public ConfigReader()
	{
		try {
			File src = new File("./src/main/resources/Config.property");
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} 
		catch (Exception e) {
			System.out.println("Exception is =="+e.getMessage());
		} 
		
	}
	
	public String getUsername()
	{
		return pro.getProperty("username");
	}
	
	public String getPassword()
	{
		return pro.getProperty("password");
	}
	
	public String getChromePath() 
	{
		return pro.getProperty("Chromepath");
	}
	
	public String getUrl()
	{
		return pro.getProperty("URL");
	}

}
