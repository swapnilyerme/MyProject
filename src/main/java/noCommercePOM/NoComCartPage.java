package noCommercePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import noCommerceUtility.NoCUtility;

public class NoComCartPage 
{

	@FindBy(id = "checkout_attribute_1") private WebElement giftWrapping;
	@FindBy(id = "termsofservice") private WebElement termOfService;
	@FindBy(id = "checkout") private WebElement checkout;
	
	public NoComCartPage(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}
	
	public void selectGiftWrapper(WebDriver driver)
	{
		NoCUtility.waitTime(driver, 1000);
		Select sel = new Select(giftWrapping);
		sel.selectByVisibleText("Yes [+$10.00]");
	}
	
	public void selectTermCondition(WebDriver driver)
	{
		NoCUtility.waitTime(driver, 1000);
		termOfService.click();
	}

	public void clickOnCheckout(WebDriver driver)
	{
		NoCUtility.waitTime(driver, 1000);
		checkout.click();
	}
}
