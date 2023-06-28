package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.Login;
import utilities.DataProviders;

public class TC_03_Login_DDT extends Baseclass{
	
	@Test(dataProvider = "LoginData", dataProviderClass = DataProviders.class)
	public void loginDDT(String email, String password, String exp)
	{
		
		 HomePage hp = new HomePage(driver);
		  hp.clickLogin();
		  Login ln = new Login(driver);
		  ln.enterEmailid(email);
		  ln.enterPassword(password);
		  ln.clickLoginBtn();
		  boolean targetPag = ln.isAccHolderNameVisible();
		  if(exp.equals("valid"))
		  {
			  if(targetPag==true)
			  {
				  ln.clickLogout();
				  Assert.assertTrue(true);
			  }
			  else
				  Assert.assertTrue(false);
		  }
		  
		  else if(exp.equals("invalid"))
		  {
			  if(targetPag==false)
			  {
				  ln.clickLogout();
				  Assert.assertTrue(false);
			  }
			  
			  else
				  Assert.assertTrue(true);
			     
		  }
		 
	
	}
}
