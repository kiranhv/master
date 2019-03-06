package ConfigReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class Reader {
	
	Properties pro;
	
		public Reader()
	{
		try 
		{
		
			File src= new File("./src/main/resources/Properties/Property.properties");		
			FileInputStream fis= new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println("Error message"+e.getMessage());
		} 
		catch (IOException e) 
		{
			System.out.println("Error message"+e.getMessage());
		} 
		
	}
	
	public String getChromepath()
	{
		return pro.getProperty("chromedriver");
	}
	public String getURL()
	{
		return pro.getProperty("URL");
	}
	

}
