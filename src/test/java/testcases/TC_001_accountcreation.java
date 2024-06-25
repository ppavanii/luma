package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobject.APPhomepage;
import pageobject.Accountcreation;
import testbase.Basicsetup;

public class TC_001_accountcreation extends Basicsetup
{
	@Test
public void verifyfirstname()
{
		try
		{
			//Opening App Homepage and Clicking Account creation//
			APPhomepage ah=new APPhomepage(driver);
			 ah.clickaccount();
			 
			 //Creating the Account//
		Accountcreation ac=new Accountcreation(driver);
		ac.Firstname(p.getProperty("name"));
		ac.Lastname(p.getProperty("Lname"));
		ac.Email(p.getProperty("email"));
		String rpass=p.getProperty("password");
		ac.Password(rpass);
		ac.CPassword(rpass);
		ac.Cbutton();
		}
		catch(Exception e)
		{
			Assert.fail("Account Creation Failed");
		}
		
				
}
}
