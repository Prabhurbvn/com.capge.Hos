package Com.Capge.Hos.Utility;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import Com.Capge.Hos.Base.Testbase;

public class Testutil extends Testbase
{
	public static void Maximize()
	{
		driver.manage().window().maximize();
		
	}
	
	public static void implicitlywait()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public static void Screenshot()
	{
		try
		{
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(src, new File(".//src//main//java//Com//Capge//Hos//Screen//fb"+System.currentTimeMillis()+".jpg"));
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public static void Dropdownday(WebElement ele, int day)
	{
		Select sel=new Select(ele);
		sel.selectByIndex(day);
	}
	
	public static void Dropdownmonth(WebElement web, String month)
	{
		Select sel=new Select(web);
		sel.selectByVisibleText(month);
	}
	
	public static void Dropdownyear(WebElement el , String year)
	{
		Select sel=new Select(el);
		sel.selectByValue(year);
	}
	

}
