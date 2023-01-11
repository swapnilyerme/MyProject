package noCommercePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import noCommerceUtility.NoCUtility;

public class NoComHomePage 
{
@FindBy(xpath = "//a[text()='Build your own computer']") private WebElement product;

public NoComHomePage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void clickOnProduct(WebDriver driver)
{
	NoCUtility.waitTime(driver,1000 );
	product.click();
}
}
