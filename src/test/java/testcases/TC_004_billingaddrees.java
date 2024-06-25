package testcases;

import org.testng.annotations.Test;

import pageobject.APPhomepage;
import pageobject.Billingaddrees;
import pageobject.Signin;
import pageobject.Welcome;
import testbase.Basicsetup;

public class TC_004_billingaddrees extends Basicsetup
{
	@Test
	public void bill() throws InterruptedException
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
					
					Billingaddrees ba=new Billingaddrees(driver);
					Thread.sleep(5000);
					ba.clickbillmail(p.getProperty("email"));
					Thread.sleep(5000);
					ba.clickbillfname(p.getProperty("fname"));
					Thread.sleep(5000);
					ba.clickbilllname(p.getProperty("lname"));
					Thread.sleep(5000);
					ba.clickbillstreet(p.getProperty("street"));
					Thread.sleep(5000);
					ba.clickbillcity(p.getProperty("city"));
					Thread.sleep(5000);
					ba.clickbillcountry(p.getProperty("country"));
					Thread.sleep(5000);
					
					Thread.sleep(5000);
					
					ba.clickbillstate(p.getProperty("state"));
					Thread.sleep(5000);
					ba.clickbillpostal(p.getProperty("postal"));
					Thread.sleep(5000);
					ba.clickbillphonenumber(p.getProperty("phonenumber"));
					//Thread.sleep(5000);
					//ba.clickbillfixedbutton();
					
					Thread.sleep(5000);
					ba.clickbillnxtbutton();
					
					Thread.sleep(10000);
					
					ba.clickplaceorder();
	}
}
