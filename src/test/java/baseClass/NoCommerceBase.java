package baseClass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import noCommerceUtility.NoCUtility;

public class NoCommerceBase 
{
	protected	WebDriver driver;
	
	
	public void launchBrowser() throws IOException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\Selenium\\selenium-java-4.4.0\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(NoCUtility.readDataFromPropertiesFile("url"));	
		
	}
	
}
