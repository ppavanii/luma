package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Accountcreation extends Basedriver
{
	public Accountcreation(WebDriver driver)
	{
		super(driver);
	}
	

	@FindBy(xpath="//input[@name='firstname']") 
WebElement firstname;

	@FindBy(xpath="//input[@name='lastname']")
WebElement lastname;

	@FindBy(xpath="//input[@name='email']")
WebElement email;

@FindBy(xpath="//input[@id='password']") 
WebElement password;

@FindBy(xpath="//input[@id='password-confirmation']") 
WebElement confirmpassword;

@FindBy(xpath="//button[@title='Create an Account']") 
WebElement createbutton;

public void Firstname(String fname)
{
	firstname.sendKeys(fname);
}

public void Lastname(String lname)
{
	lastname.sendKeys(lname);
}

public void Email(String emaiL)
{
	email.sendKeys(emaiL);
}

public void Password(String pass)
{
	password.sendKeys(pass);
}

public void CPassword(String Cpass)
{
	password.sendKeys(Cpass);
}

public void Cbutton()
{
	createbutton.click();
}

}
