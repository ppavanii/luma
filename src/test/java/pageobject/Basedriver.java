package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Basedriver 
{
 WebDriver driver;
public Basedriver(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
}
