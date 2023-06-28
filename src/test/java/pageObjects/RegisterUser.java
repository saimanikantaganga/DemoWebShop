package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterUser {
	
	WebDriver driver;

	public RegisterUser(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="gender-male")
	WebElement clickMale;
	public void clickMalee()
	{
		clickMale.click();
	}
	
	@FindBy(id="gender-female")
	WebElement clickFeMale;
	public void clickFeMalee()
	{
		clickFeMale.click();
	}
	
	@FindBy(name="FirstName")
	WebElement fName;
	public void enterfirstName(String fname)
	{
		fName.sendKeys(fname);
	}
	
	@FindBy(name="LastName")
	WebElement lName;
	public void enterlastName(String lname)
	{
		lName.sendKeys(lname);
	}
	
	@FindBy(id="Email")
	WebElement email;
	public void enterEmail(String emaill)
	{
		email.sendKeys(emaill);
	}
	
	@FindBy(id="Password")
	WebElement pwd;
	public void enterPassword(String passwordd)
	{
		pwd.sendKeys(passwordd);
	}
	
	@FindBy(id="ConfirmPassword")
	WebElement pwdd;
	public void enterConfirmPassword(String cnfmPwd)
	{
		pwdd.sendKeys(cnfmPwd);
	}
	
	@FindBy(id="register-button")
	WebElement clickRegBtn;
	public void clickRegisterButton()
	{
		clickRegBtn.click();
	}
	
	@FindBy(xpath="//div[@class='result']")
	WebElement getConfText;
	public String getText()
	{
		return getConfText.getText();
	}
	
	@FindBy(xpath="//a[@href='/logout']")
	WebElement logout;
	public void clickLogout()
	{
		logout.click();
	}
	
	

}
