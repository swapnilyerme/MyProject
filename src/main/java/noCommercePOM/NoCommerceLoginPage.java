package noCommercePOM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import noCommerceUtility.NoCUtility;

public class NoCommerceLoginPage 
{
  @FindBy(xpath = "//a[text()='Register']") private WebElement register;
  @FindBy(id = "gender-male") private WebElement gender;
  @FindBy(id = "FirstName") private WebElement firstName;
  @FindBy(id = "LastName") private WebElement lastName;
  @FindBy(xpath = "//select[@name='DateOfBirthDay']") private WebElement day;
  @FindBy(xpath = "//select[@name='DateOfBirthMonth']") private WebElement month;
  @FindBy(xpath = "//select[@name='DateOfBirthYear']") private WebElement year;
  @FindBy(id = "Email") private WebElement email;
  @FindBy(id = "Company") private WebElement company;
  @FindBy(id = "Password") private WebElement password;
  @FindBy(id = "ConfirmPassword") private WebElement cnfPassword;
  @FindBy(id = "register-button") private WebElement regButton;
  
  public NoCommerceLoginPage(WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
  }
  
  public void clickOnregister(WebDriver driver)
  {	  NoCUtility.waitTime(driver,1000);
	  register.click();
  }
  public void selectGen(WebDriver driver)
  {  NoCUtility.waitTime(driver,1000);
	  gender.click();
  }
  
  public void enterFn(WebDriver driver) throws IOException
  {  NoCUtility.waitTime(driver,1000);
	  firstName.sendKeys(NoCUtility.readDataFromPropertiesFile("fn"));
  }
  
  public void enterLn(WebDriver driver) throws IOException
  { NoCUtility.waitTime(driver,1000);
	  lastName.sendKeys(NoCUtility.readDataFromPropertiesFile("ln"));
  }
  
  public void selectDay(WebDriver driver)
  { NoCUtility.waitTime(driver,1000);
	  Select sel = new Select(day);
	  sel.selectByIndex(7);
  }
  
  public void selectMonth(WebDriver driver)
  { NoCUtility.waitTime(driver,1000);
	  Select sel = new Select(month);
	  sel.selectByValue("8");
  }
  
  public void selectYear(WebDriver driver)
  {
	  NoCUtility.waitTime(driver,1000);
	  Select sel = new Select(year);
	  sel.selectByValue("1996");
  }
  public void enterEmail(WebDriver driver) throws IOException
  {
	  NoCUtility.waitTime(driver,1000);
	  email.sendKeys(NoCUtility.readDataFromPropertiesFile("email"));
  }
  
  public void enterCompanyName(WebDriver driver) throws IOException
  {
	  NoCUtility.waitTime(driver,1000);
	  company.sendKeys(NoCUtility.readDataFromPropertiesFile("company"));
  }
  
  public void enterPassword(WebDriver driver) throws IOException
  {
	  NoCUtility.waitTime(driver,1000);
	  password.sendKeys(NoCUtility.readDataFromPropertiesFile("password"));
  }
  
  public void enterconfirmp(WebDriver driver) throws IOException
  {
	  NoCUtility.waitTime(driver,1000);
	  cnfPassword.sendKeys(NoCUtility.readDataFromPropertiesFile("cpassword"));
  }
  
  public void clickOnRegisterButton(WebDriver driver) throws IOException
  {
	  NoCUtility.waitTime(driver,1000);
	  regButton.click();
  }
  
  
 
}

