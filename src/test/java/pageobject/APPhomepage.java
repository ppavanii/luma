package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class APPhomepage extends Basedriver
{
	public APPhomepage(WebDriver driver)
	{
		super(driver);
	}
@FindBy(xpath="//div[@class='panel header']//a[normalize-space()='Create an Account']")
WebElement createaccount;


@FindBy(xpath="//div[@class='panel header']//a[contains(text(),'Sign In')]")
WebElement sigin;

public void clickaccount()
{
	createaccount.click();
}

public void clicksignin()
{
	sigin.click();
}
}
