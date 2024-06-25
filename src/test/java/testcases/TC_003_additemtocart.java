package testcases;

import org.testng.annotations.Test;

import pageobject.APPhomepage;
import pageobject.Signin;
import pageobject.Welcome;
import testbase.Basicsetup;

public class TC_003_additemtocart extends Basicsetup
{
	@Test
public void cart() throws InterruptedException
{
		//TC_001
		APPhomepage ah=new APPhomepage(driver);
		ah.clicksignin();
		
		//TC_003
		Signin sig=new Signin(driver);
		sig.entermail(p.getProperty("email"));
		sig.enterpass(p.getProperty("password"));
		sig.clicksigninbutton();
		
		Welcome wel=new Welcome(driver);
				wel.clickwomen();
				wel.clicktops();
				wel.clicktees();
				
				wel.clickvneck();
				wel.clicksize();
				wel.clickcolour();
				wel.clickaddcart();
				
				Thread.sleep(15000);
				
				wel.clickshowcart();
				wel.clickproceed();
}
}
