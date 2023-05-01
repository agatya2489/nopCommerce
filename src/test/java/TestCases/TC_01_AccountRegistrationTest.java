package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.HomePage;
import PageObject.Registration;
import TestBase.BaseClass;

public class TC_01_AccountRegistrationTest extends BaseClass{

	@Test
	public void test_account_registration()
	{
		logger.debug("application logs......");
		logger.info("***  Starting TC_001_AccountRegistrationTest ***");
		try
		{
		HomePage hp=new HomePage(driver);
		
		hp.clickRegister();
		logger.info("Clicked on register link");
		
		Registration regpage=new Registration(driver);
			
		logger.info("Providing customer data");
		
		regpage.setFirstNm(randomString().toUpperCase());
		
		regpage.setLastNm(randomString().toUpperCase());
		
		regpage.setEmail(randomString()+"@gmail.com");// randomly generated the email
		
		String password=randomAlphaNumeric();
		regpage.setPassword(password);
		regpage.setConfirmPassword(password);
		
		regpage.clickRegister();
		logger.info("Clicked on continue");
		
		String confmsg=regpage.getConfirmationMsg();
		
		logger.info("Validating expected message");
		Assert.assertEquals(confmsg, "Your registration completed","Test failed");
		
		}catch(Exception e)
		{
			logger.error("test failed");
			Assert.fail();
		}
		logger.info("***  Finished TC_001_AccountRegistrationTest ***");		
		}

}
