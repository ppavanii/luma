package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Signin extends Basedriver
{

	public Signin(WebDriver driver) 
	{
		super(driver);
		
	}
	@FindBy(xpath="//input[@id='email']")  
	WebElement mail;
	
@FindBy(xpath="//fieldset[@class='fieldset login']//input[@id='pass']")
WebElement pword;

@FindBy(xpath="//fieldset[@class='fieldset login']//button[@id='send2']")
WebElement signinbutton;

public void entermail(String m)
{
	mail.sendKeys(m);
}

public void enterpass(String p)
{
	pword.sendKeys(p);
}

public void clicksigninbutton()
{
	signinbutton.click();
}

}
