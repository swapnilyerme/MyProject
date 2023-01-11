package noCommerceUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class NoCUtility 
{
	public static void screenshot(WebDriver driver,String screenshot) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest  = new File("C:\\Users\\hp\\Desktop\\Selenium\\screenshots\\"+screenshot+".jpd");
		FileHandler.copy(src, dest);
	   
	}
	
	public static String readDataFromPropertiesFile(String key) throws IOException
	{
		FileInputStream myFile = new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\DemoSitr\\NoCommerce.properties");
		Properties pro = new Properties();
		pro.load(myFile);
		String value=pro.getProperty(key);
		return value;
	}
	
	public static void waitTime(WebDriver driver,int minute)
	{
	   driver.manage().timeouts().implicitlyWait(Duration.ofMillis(minute));
	}
}
