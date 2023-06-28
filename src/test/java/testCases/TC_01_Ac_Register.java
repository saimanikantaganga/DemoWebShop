package testCases;

import java.util.ResourceBundle;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.RegisterUser;

public class TC_01_Ac_Register extends Baseclass{
	

	@Test(groups = {"Master","Sanity"})
	public void testRegister() throws InterruptedException 
	{
		HomePage hp = new HomePage(driver);
		hp.clickRegister();
		
		RegisterUser ru = new RegisterUser(driver);
		ru.clickMalee();
		ru.enterfirstName(rb.getString("firstName"));
		ru.enterlastName(rb.getString("lastName"));
		ru.enterEmail(rb.getString("email"));
		ru.enterPassword(rb.getString("password"));
		ru.enterConfirmPassword(rb.getString("confirmPassword"));
		Thread.sleep(5000);
		ru.clickRegisterButton();
		Thread.sleep(5000);
		System.out.println(ru.getText());
		Thread.sleep(3000);
		ru.clickLogout();
		Thread.sleep(4000);
		
	}

}
