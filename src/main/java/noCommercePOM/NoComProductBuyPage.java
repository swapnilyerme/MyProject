package noCommercePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import noCommerceUtility.NoCUtility;

public class NoComProductBuyPage 
{
@FindBy(id = "product_attribute_1") private WebElement processor;
@FindBy(id = "product_attribute_2") private WebElement ram;
@FindBy(xpath = "//label[text()='400 GB [+$100.00]']") private WebElement hdd;
@FindBy(id = "product_attribute_4_8") private WebElement os;
@FindBy(id = "product_attribute_5_11") private WebElement software;
@FindBy(id = "add-to-cart-button-1") private WebElement addToCart;
@FindBy(xpath = "//span[text()='Shopping cart']") private WebElement cart;

public NoComProductBuyPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void selectProc(WebDriver driver)
{
	NoCUtility.waitTime(driver,1000 );
	Select sel= new Select(processor);
	sel.selectByIndex(2);
}

public void selectRam(WebDriver driver)
{
	NoCUtility.waitTime(driver,1000 );
	Select sel= new Select(ram);
	sel.selectByIndex(1);
}

public void selectHDD(WebDriver driver)
{
	NoCUtility.waitTime(driver,1000 );
	hdd.click();
}

public void selectOS(WebDriver driver)
{
	NoCUtility.waitTime(driver,1000 );
	os.click();
}

public void selectSoftware(WebDriver driver)
{
	NoCUtility.waitTime(driver,1000 );
	software.click();
}

public void clickOnAddToCart(WebDriver driver)
{
	NoCUtility.waitTime(driver,1000 );
	addToCart.click();
}

public void clickOnShoppingCart(WebDriver driver)
{
	NoCUtility.waitTime(driver,1000 );
	cart.click();
}
}
