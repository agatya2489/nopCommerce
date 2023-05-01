package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
		
	}
	
	//Elements
	@FindBy(xpath = "//a[text()='Register']")
	WebElement lnkRegister;
	
	@FindBy(xpath =  "//a[text()='Log in']")
	WebElement lnkLogin;
	
	@FindBy(xpath = "//input[@placeholder='Search store']")
	WebElement txtSearchBox;
	
	@FindBy(xpath = "//button[normalize-space()='Search']")
	WebElement btnSearch;
	
	//Action Methods
	public void clickRegister()
	{
		lnkRegister.click();
	}
	
	public void clickLogin()
	{
		lnkLogin.click();
	}
	
	public void enterPrdName(String pName)
	{
		txtSearchBox.sendKeys(pName);
	}
	
	public void clickSearch()
	{
		btnSearch.click();
	}
	
}
