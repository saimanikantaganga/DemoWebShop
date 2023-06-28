package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	WebDriver driver;

	public Login(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="Email")
	WebElement enterEmail;
	public void enterEmailid(String emaill)
	{
		enterEmail.sendKeys(emaill);
	}
	
	@FindBy(name="Password")
	WebElement entPwd;
	public void enterPassword(String pwdd)
	{
		entPwd.sendKeys(pwdd);
	}
	
	@FindBy(xpath="//input[@class='button-1 login-button']")
	WebElement clickLogin;
	public void clickLoginBtn()
	{
		clickLogin.click();
	}
	
	@FindBy(xpath = "//a[@href='/customer/info']")
	WebElement acHolderName;
	public String getAccountHolderName()
	{
		return acHolderName.getText();
	}
	
	@FindBy(xpath = "//a[@href='/customer/info']")
	WebElement acHolderNameisVisible;
	public boolean isAccHolderNameVisible()
	{
		try {
		return acHolderNameisVisible.isDisplayed();
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	@FindBy(xpath="//a[@href='/logout']")
	WebElement logout;
	public void clickLogout()
	{
		logout.click();
	}
	
	@FindBy(xpath="//a[@href='/logout']")
	WebElement logoutLink;
	public boolean isLogoutLinkVisible()
	{
	  return logoutLink.isDisplayed();
	}
	
	//for incorrect password
	@FindBy(xpath = "//div[@class='message-error']")
	WebElement errMsg;
	public boolean isErrorMessageDisplayed()
	{
		return errMsg.isDisplayed();
	}
	
	
	
	

}
