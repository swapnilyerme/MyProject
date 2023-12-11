package noCommerceTest;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseClass.NoCommerceBase;
import noCommercePOM.NoCoBillingPage;
import noCommercePOM.NoComCartPage;
import noCommercePOM.NoComHomePage;
import noCommercePOM.NoComProductBuyPage;
import noCommercePOM.NoCommerceLoginPage;
import noCommercePOM.noComRestrationResultPage;

public class NoCTest extends NoCommerceBase 
{
	//This is testing branch of github
	NoCommerceLoginPage login;
	noComRestrationResultPage result;
	NoComHomePage  home;
	NoComProductBuyPage product;
	NoComCartPage cart;
	NoCoBillingPage billing;
	
	@BeforeClass  
	public void launchNoCommerce() throws IOException
	{
		launchBrowser();
		login = new NoCommerceLoginPage(driver);
		result = new noComRestrationResultPage(driver);
		home = new NoComHomePage(driver);
		product = new NoComProductBuyPage(driver);
		cart= new NoComCartPage(driver);
		billing = new NoCoBillingPage(driver);
	}
	
	@BeforeMethod
	public void registerToNoCommerce() throws IOException
	{
		//login page elements
		login.clickOnregister(driver);
		login.selectGen(driver);
		login.enterFn(driver);
		login.enterLn(driver);
		login.selectDay(driver);
		login.selectMonth(driver);
		login.selectYear(driver);
		login.enterEmail(driver);
		login.enterCompanyName(driver);
		login.enterPassword(driver);
		login.enterconfirmp(driver);
		login.clickOnRegisterButton(driver);
		Reporter.log("Creating new Registration", true);
		//result page elements
		result.clickOnContinue(driver);
		//home page elements
		home.clickOnProduct(driver);
		//product page elements
		product.selectProc(driver);
		product.selectRam(driver);
		product.selectHDD(driver);
		product.selectOS(driver);
		product.selectSoftware(driver);
		product.clickOnAddToCart(driver);
		product.clickOnShoppingCart(driver);
		//cart page elements
		cart.selectGiftWrapper(driver);
		cart.selectTermCondition(driver);
		cart.clickOnCheckout(driver);
//		//billing page elements
//		billing.selectCountry(driver);
//		billing.selectCity(driver);
//		billing.enterAdd(driver);
//		billing.enterAdd2(driver);
//		billing.enterZip(driver);
//		billing.enterPhone(driver);
//		billing.enterFax(driver);
//		billing.clickOnCont();
		driver.close();
	}
	@Test
  public void f()
  {
		
  }
}
