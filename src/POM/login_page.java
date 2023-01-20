package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_page {
	@FindBy(xpath="//input[@id='username']")private WebElement un;
	@FindBy(xpath="//input[@name='pwd']")private WebElement pwd;
	@FindBy(xpath="//div[text()='Login ']")private WebElement loginBtn;
	public login_page(WebDriver driver) 
	{
		PageFactory.initElements( driver,this);
	}
	//use constructor
	//public void LoginPage(WebDriver driver) {
		//PageFactory.initElements(driver,this);
	//}
	//getters and setters
	public void enterUn()
	{
		un.sendKeys("admin");
	}
	public void entePWD()
	{
		pwd.sendKeys("manager");
	}
	public void clickLoginBtn()
	{
		loginBtn.click();
     }
		
}
