package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Welcome extends Basedriver
{
	public Welcome(WebDriver driver)
	{
		super(driver);
	}
	@FindBy(xpath="//a[@id='ui-id-4']//span[contains(text(),'Women')]")
	WebElement women;
	
	@FindBy(xpath="//div[@id='store.menu']//ul[@role='menu']//a[@id='ui-id-9']")
	WebElement tops;
	
	@FindBy(xpath="//div[@id='store.menu']//ul[@role='menu']//a[@id='ui-id-13']")
	WebElement tees;
	
	@FindBy(xpath="//img[@alt='Karissa V-Neck Tee']")
	WebElement vneck;
	
	@FindBy(xpath="//div[@id='option-label-size-143-item-167']")
	WebElement size;
	
	@FindBy(xpath="//div[@id='option-label-color-93-item-58']")
	WebElement colour;
	
	@FindBy(xpath="//span[normalize-space()='Add to Cart']")
	WebElement addcart;
	
	@FindBy(xpath="//a[@class='action showcart']")
	WebElement showcart;
	
	@FindBy(xpath="//button[@id='top-cart-btn-checkout']")
	WebElement proceed;
	
	Actions act=new Actions(driver);
	
	public void clickwomen()
	{
		
		act.moveToElement(women).perform();
	}
	public void clicktops()
	{
		
		act.moveToElement(tops).perform();	
	}
	
	public void clicktees()
	{
		tees.click();
	}
	
	public void clickvneck()
	{
		
		vneck.click();	
	}
	public void clicksize()
	{
		size.click();
	}
	public void clickcolour()
	{
		colour.click();
	}
	public void clickaddcart()
	{
		addcart.click();
	}
	
	public void clickshowcart()
	{
		showcart.click();
	}
	public void clickproceed()
	{
		proceed.click();
	}
}
