package testCases;

import java.util.ResourceBundle;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.Login;

public class TC_02_Ac_loginTest extends Baseclass{


  @Test(groups = {"Master","Regression"})
  public void loginTestTest() {
	  
	  HomePage hp = new HomePage(driver);
	  hp.clickLogin();
	  Login ln = new Login(driver);
	  ln.enterEmailid(rb.getString("email"));
	  ln.enterPassword(rb.getString("password"));
	  ln.clickLoginBtn();
	  System.out.println("Account Holder Name : "+ln.getAccountHolderName());
	  ln.clickLogout();
    
  }
}
