package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NhsWalesPageObject {
	
	private static WebElement element=null;

	public static WebElement clickStart(WebDriver driver){
		
		element = driver.findElement(By.xpath("/html/body/main/div[2]/form/div/div[3]/div/input"));
		return element;
	}
	public static WebElement selectWales(WebDriver driver){
		
		element = driver.findElement(By.xpath("/html/body/main/div[2]/div/form/div[1]/fieldset/label[3]"));
		return element;
	}
	public static WebElement clickNextbtn(WebDriver driver){
		
		element = driver.findElement(By.xpath("/html/body/main/div[2]/div/form/div[2]/div/input"));
		return element;
	}
	
	

}
