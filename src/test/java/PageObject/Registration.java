package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registration extends BasePage{

	public Registration(WebDriver driver) {
		super(driver);
	}
	
	//Elements
	@FindBy(xpath = "//input[@id='gender-male']")
	WebElement rdBtnMl;
	
	@FindBy(css = "#FirstName")
	WebElement txtFirstName;
	
	@FindBy(css = "#LastName")
	WebElement txtLasttName;
	
//	@FindBy(css = "select[name='DateOfBirthDay']")
//	WebElement selectDay;
//	
//	@FindBy(css = "select[name='DateOfBirthMonth']")
//	WebElement selectMonth;
//	
//	@FindBy(css = "select[name='DateOfBirthYear']")
//	WebElement selectYear;
	
	@FindBy(css = "#Email")
	WebElement txtEmail;
	
	@FindBy(css = "#Password")
	WebElement txtPassword;
	
	@FindBy(css = "#ConfirmPassword")
	WebElement txtConfirmPassword;
	
	@FindBy(xpath = "//button[@id='register-button']")
	WebElement btnRegister;
	
	@FindBy(xpath = "//div[@class='result']")
	WebElement msgConfirmation;
	
	//Actions
	public void setGender()
	{
		rdBtnMl.click();
	}

	public void setFirstNm(String fname)
	{
		txtFirstName.sendKeys(fname);
	}
	
	public void setLastNm(String lname)
	{
		txtLasttName.sendKeys(lname);
	}
	
	public void setEmail(String email)
	{
		txtEmail.sendKeys(email);
	}
	
	public void setPassword(String password)
	{
		txtPassword.sendKeys(password);
	}
	
	public void setConfirmPassword(String password)
	{
		txtConfirmPassword.sendKeys(password);
	}
	
	public void clickRegister()
	{
		btnRegister.click();
	}
	
	public String getConfirmationMsg()
	{
		try {
			return(msgConfirmation.getText());
		}
		catch(Exception e)
		{
			return (e.getMessage());
		}
	}
		
}
