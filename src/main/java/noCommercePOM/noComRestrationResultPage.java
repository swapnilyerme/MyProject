package noCommercePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import noCommerceUtility.NoCUtility;

public class noComRestrationResultPage
{
@FindBy(xpath = "//a[text()='Continue']") private WebElement continueButton;

public noComRestrationResultPage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}

public void clickOnContinue(WebDriver driver)
{  NoCUtility.waitTime(driver, 1000);
   continueButton.click();	
}
}
