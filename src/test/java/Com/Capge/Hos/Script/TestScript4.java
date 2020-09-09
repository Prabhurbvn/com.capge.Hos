package Com.Capge.Hos.Script;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Com.Capge.Hos.Base.Testbase;
import Com.Capge.Hos.Pages.LoginPage;
import Com.Capge.Hos.Utility.Testutil;

public class TestScript4 extends Testbase
{
    LoginPage log;
    
    @BeforeTest(alwaysRun=true)
    public void Setup()
    {
    	Openbrowser();
    	log =new LoginPage();
    }
    
    @Test
    public void ValidateTitle()
    {
    	String title=log.VerifyTitle();
    	Assert.assertEquals(title, "Facebook – log in or sign up");
    }
    @Test
    public void ValidateUrl()
    {
    	String url=log.VerifyUrl();
    	Assert.assertEquals(url, "https://www.facebook.com/");
    }
  
  
    
    @Test
    public void validateEmail()
    {
    	log.VerifyEmail("arirohit");
    }
    
    @Test 
    public void validatePass()
    {
    	log.VerifyPass("sel12345");
    }
    
    @Test
    public void ValidateClick()
    {
    	log.VerifyCreate();
    }
    
    @Test 
    public void ValidateCreateNewAccount()
    {
    	String s=log.verifyCreateNewAccount();
    	Assert.assertEquals(s, "Create New Account");
    }
    
   
    
     
     @Test
     public void ValidateDrop_Year()
     {
     	Testutil.Dropdownyear(log.Dropdown_Year, "1999");
     }
    
    @AfterTest
    
    public void Teardown()
    {
    	driver.close();
    }
}
