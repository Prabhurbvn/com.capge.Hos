package Com.Capge.Hos.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Capge.Hos.Base.Testbase;

public class LoginPage extends Testbase
{
	@FindBy(id="email")
    WebElement Emailorphone;
	
	@FindBy(name="pass")
	WebElement Password;
	
	@FindBy(xpath="//a[@role='button']")
	WebElement CreateNewAccount;
	
	@FindBy(name="firstname")
	WebElement Firstname;
	
	@FindBy(xpath="//label[text()='Female']")
	WebElement FemaleRadiobutton;
	
	@FindBy(xpath="//select[@id='day']")
	public WebElement Dropdown_Day;
	
	@FindBy(xpath="//select[@id='month']")
	 public WebElement Dropdown_Month;
	
	@FindBy(xpath="//select[@id='year']")
	 public WebElement Dropdown_Year;
	
	public LoginPage()
	{
		super();
		PageFactory.initElements(driver,this );
	}
	
	public String VerifyTitle()
	{
		String t=driver.getTitle();
		return t;
	}
	
	public String VerifyUrl()
	{
		String u=driver.getCurrentUrl();
		return u;
	}
	
	public void VerifyCreate()
	{
		CreateNewAccount.click();
	}
	
	public String verifyCreateNewAccount()
	{
		String h=CreateNewAccount.getText();
		return h;
	}
	
	public void VerifyFirstname(String name)
	{
		Firstname.sendKeys(name);
	}
	
	public boolean VerifyRadio()
	{
		return FemaleRadiobutton.isDisplayed();
	}
	
	public void VerifyEmail(String username)
	{
		Emailorphone.sendKeys(username);
	}
	
	public void VerifyPass(String password)
	{
		Password.sendKeys(password);
	}
	
	public void VerifyTest(String username,String password) throws InterruptedException
	{
		Emailorphone.clear();
		Emailorphone.sendKeys(username);
		Thread.sleep(2000);
		Password.clear();
		Password.sendKeys(password);
		Thread.sleep(2000);
	}
}
