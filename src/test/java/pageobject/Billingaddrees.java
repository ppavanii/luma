package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Billingaddrees extends Basedriver
{

	public Billingaddrees(WebDriver driver)
	{
		super(driver);
	}
	@FindBy(xpath="//div[@class='control _with-tooltip']//input[@id='customer-email']")
	WebElement billemail;
	
	@FindBy(xpath="//div[@class='control']//input[@name='firstname']")
	WebElement billfname;

	@FindBy(xpath="//div[@class='control']//input[@name='lastname']")
	WebElement billlname;

	@FindBy(xpath="//div[@class='control']//input[@name='street[0]']")
	WebElement billstreet;

	@FindBy(xpath="//div[@class='control']//input[@name='city']")
	WebElement billcity;

	@FindBy(xpath="//div[@class='control']//input[@name='postcode']")
	WebElement billpostal;
	
	@FindBy(xpath="//select [@name='region_id']")
	WebElement billstate;

	@FindBy(xpath="//select [@name='country_id']")
	WebElement billcountry;

	@FindBy(xpath="//input[@name='telephone']")
	WebElement billphonenumber;

	//@FindBy(xpath="//input[@name='ko_unique_1']")
	//WebElement billfixedbutton;
	
	@FindBy(xpath="//span[normalize-space()='Next']")
	WebElement billnxtbutton;
	
	@FindBy(xpath="//span[normalize-space()='Place Order']")
	WebElement placeorder;

	public void clickbillmail(String m)
	{
		billemail.sendKeys(m);
	}
	public void clickbillfname(String f)
	{
		billfname.sendKeys(f);
	}
	public void clickbilllname(String l)
	{
		billlname.sendKeys(l);
	}
	public void clickbillstreet(String s)
	{
		billstreet.sendKeys(s);
	}
	public void clickbillcity(String c)
	{
		billcity.sendKeys(c);
	}
	public void clickbillpostal(String p)
	{
		billpostal.sendKeys(p);
	}
	public void clickbillcountry(String coun)
	{
		Select s=new Select(billcountry);
				s.selectByVisibleText(coun);
	}
	public void clickbillphonenumber(String phn)
	{
		billphonenumber.sendKeys(phn);
	}
	public void clickbillstate(String st)
	{
		Select s=new Select(billstate);
				s.selectByVisibleText(st);
	}
	/*public void clickbillfixedbutton()
	{
		billfixedbutton.click();
	}*/
	public void clickbillnxtbutton()
	{
		billnxtbutton.click();
	}
	public void clickplaceorder()
	{
		placeorder.click();
	}
}
