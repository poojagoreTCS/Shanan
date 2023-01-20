package POM;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
	@FindBy(xpath = "//input[@id='email']")private WebElement un;
	@FindBy(xpath = "//input[@id='pass']")private WebElement pwd;
	@FindBy(xpath = "//button[text()='Log in']")private WebElement verifytext;
	
	public LoginPage(WebDriver driver) 
	{
		PageFactory.initElements( driver,this);
	}
	public void enterUN1(String username)
	{
		un.sendKeys("admin");
	}
		public void enterun()
	{
		un.sendKeys("admin");
	}
	public void enterpwd()
	{
		pwd.sendKeys("admin");
	}
	public void clickloginbtn()
	{
	  clickloginbtn();	
	}
	public void enterUN(String username) {
		// TODO Auto-generated method stub
		
	}

}
