package Com.Capge.Hos.Base;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import Com.Capge.Hos.Utility.Testutil;

public class Testbase 
{
	File f;
	FileInputStream fis;
	Properties pro;
	public static WebDriver driver ;
	
	public Testbase()
	{
		try
		{
		f=new File(".//src//main//java//Com//Capge//Hos//Config//Config.Properties");
		fis =new FileInputStream(f);
		pro=new Properties();
		pro.load(fis);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public void Openbrowser()
	{
		String browser=pro.getProperty("browsername");
		if(browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver",pro.getProperty("chromepath") );
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver",pro.getProperty("geckopath") );
			driver=new FirefoxDriver();
		}
		
		else if(browser.equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.ie.driver",pro.getProperty("iepath") );
			driver=new InternetExplorerDriver();
		}
		driver.get(pro.getProperty("url"));
		Testutil.Maximize();
		Testutil.implicitlywait();
		Testutil.Screenshot();
	}
	

}
