package testcases;

import org.testng.annotations.Test;

import pageobject.APPhomepage;
import pageobject.Signin;
import testbase.Basicsetup;


public class TC_002_sigin extends Basicsetup
{
	@Test
public void sigging() 
{
		//TC_001 
	APPhomepage ah=new APPhomepage(driver);
	ah.clicksignin();
	
	Signin sig=new Signin(driver);
	sig.entermail(p.getProperty("email"));
	sig.enterpass(p.getProperty("password"));
	sig.clicksigninbutton();
			
}
}
