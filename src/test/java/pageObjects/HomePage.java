package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	////T  O  P  M  E  N  U  
	@FindBy(xpath="//a[@href='/register']")
	WebElement reg;
	public void clickRegister()
	{
		reg.click();
	}
	
	@FindBy(xpath="//a[@href='/login']")
	WebElement login;
	public void clickLogin()
	{
		login.click();
	}
	
	
	
	@FindBy(xpath="//a[@href='/cart']")
	WebElement shoppingCart;
	public void shoppingCart()
	{
		
	}
	@FindBy(name="")
	WebElement wishlist;
	public void wishList()
	{
		
	}
	
	@FindBy(name="")
	WebElement enterSearch;
	public void enterSearch()
	{
		
	}
	
	@FindBy(name="")
	WebElement clickSearch;
	public void clickSearch()
	{
		
	}
	
// TOP MENU
	@FindBy(xpath="//ul[@class='top-menu']//a[@href='/books']")
	WebElement books;
	public void books()
	{
		books.click();
	}
	
	@FindBy(xpath="//ul[@class='top-menu']//a[@href='/computers']")
	WebElement computers;
	public void computers()
	{
		computers.click();
	}
	
	@FindBy(xpath="//ul[@class='top-menu']//a[@href='/electronics']")
	WebElement electronics;
	public void electronics()
	{
		electronics.click();
	}
	
	@FindBy(xpath="//ul[@class='top-menu']//a[@href='/apparel-shoes']")
	WebElement apparelShoes;
	public void apparelShoes()
	{
		apparelShoes.click();
	}
	
	@FindBy(xpath="//ul[@class='top-menu']//a[@href='/digital-downloads']")
	WebElement digitalDownloads;
	public void digitalDownloads()
	{
		digitalDownloads.click();
	}
	
	@FindBy(name="")
	WebElement jewellery;
	public void jewellery()
	{
		
	}
	
	@FindBy(name="")
	WebElement giftcard;
	public void giftcard()
	{
		
	}

}
