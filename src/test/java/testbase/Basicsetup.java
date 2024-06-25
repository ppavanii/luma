package testbase;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class Basicsetup
{
	public WebDriver driver;
	public Properties p;
	
	@BeforeClass
	@Parameters({"browser"})
	public void setup(String br) throws IOException
	{
		FileReader file=new FileReader(".//src/test/resources/configproperties");
		p=new Properties();
		p.load(file);
		
		/*if(p.getProperty("execution_env").equalsIgnoreCase("remote"))
		{
			DesiredCapabilities dc=new DesiredCapabilities();
			
			//OS
			if(os.equalsIgnoreCase("windows"))
			{
				dc.setPlatform(Platform.WIN11);
			}
			else if(os.equalsIgnoreCase("mac"))
			{
				dc.setPlatform(Platform.MAC);
			}
			else
			{
				System.out.println("No matching os..");
				return;
			}
			
			//browser
			switch(br.toLowerCase())
			{
			case "chrome" : dc.setBrowserName("chrome"); break;
			case "edge" : dc.setBrowserName("MicrosoftEdge"); break;
			case "firefox":dc.setBrowserName("Firefox");break;
			default: System.out.println("No matching browser.."); return;
			}
			
			driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),dc);
			
		    }
		
	    else if(p.getProperty("execution_env").equalsIgnoreCase("local"))
	      {*/
		switch(br.toLowerCase())
		{
		case "chrome":driver=new ChromeDriver();break;
		case "firefox":driver=new FirefoxDriver();break;
		case "edge":driver=new EdgeDriver();break;
		case "safari":driver=new SafariDriver();break;
		default:System.out.println("no such browser found");
		return;
		}
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(p.getProperty("appURL"));
		driver.manage().window().maximize();
		
	}
	
	@AfterClass
	public void teardown()
	{
		driver.close();
	}
	
	public String randomstring()
	{
		String generatestring=RandomStringUtils.randomAlphabetic(6);
		return generatestring ;
	}
	 public String randomnumber()
	 {
		 String generatenumber=RandomStringUtils.randomNumeric(4);
		 return generatenumber;
	 }
	 public String randommail()
	 {
		 String generatemail=RandomStringUtils.randomAlphabetic(5);
		String generatemail1=RandomStringUtils.randomNumeric(4);
		return (generatemail +"@"+ generatemail1 );
	 }

}
