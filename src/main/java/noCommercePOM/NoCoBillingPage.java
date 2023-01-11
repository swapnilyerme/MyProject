package noCommercePOM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import noCommerceUtility.NoCUtility;

public class NoCoBillingPage 
{
	
	//this master branch
	//this updated code
	//here i have written this from global git repository

	@FindBy(id = "BillingNewAddress_CountryId") private WebElement country;
	@FindBy(id = "BillingNewAddress_StateProvinceId") private WebElement state;
	@FindBy(id = "BillingNewAddress_City") private WebElement city;
	@FindBy(id = "BillingNewAddress_Address1") private WebElement address1;
	@FindBy(id = "BillingNewAddress_Address2") private WebElement address2;
	@FindBy(id = "BillingNewAddress_ZipPostalCode") private WebElement zipCode;
	@FindBy(id = "BillingNewAddress_PhoneNumber") private WebElement phoneNum;
	@FindBy(id = "BillingNewAddress_FaxNumber") private WebElement faxNum;
	@FindBy(xpath = "(//button[text()='Continue'])[1]") private WebElement continuebutt;
	
	
	
	//jhfffjf
	public NoCoBillingPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void selectCountry(WebDriver driver)
	{
		NoCUtility.waitTime(driver, 1000);
		Select sel = new Select(country);
		sel.selectByVisibleText("India");
	}
	
	public void selectCity(WebDriver driver) throws IOException
	{
		NoCUtility.waitTime(driver, 1000);
		city.sendKeys(NoCUtility.readDataFromPropertiesFile("city"));
		
	}
	
	public void enterAdd(WebDriver driver) throws IOException
	{
		NoCUtility.waitTime(driver, 1000);
		address1.sendKeys(NoCUtility.readDataFromPropertiesFile("add1"));
	}
	
	public void enterAdd2(WebDriver driver) throws IOException
	{
		
		NoCUtility.waitTime(driver, 1000);
		address2.sendKeys(NoCUtility.readDataFromPropertiesFile("add2"));
	}
	
	public void enterZip(WebDriver driver) throws IOException
	{
		NoCUtility.waitTime(driver, 1000);
		zipCode.sendKeys(NoCUtility.readDataFromPropertiesFile("zip"));
	}
	
	public void enterPhone(WebDriver driver) throws IOException
	{
		
		NoCUtility.waitTime(driver, 1000);
		phoneNum.sendKeys(NoCUtility.readDataFromPropertiesFile("phoneN"));
	}
	
	public void enterFax(WebDriver driver) throws IOException
	{
		
		NoCUtility.waitTime(driver, 1000);
		faxNum.sendKeys(NoCUtility.readDataFromPropertiesFile("fax"));
	}
	
	public void clickOnCont()
	{
		continuebutt.click();
	}
}
