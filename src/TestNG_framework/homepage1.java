package TestNG_framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage1 {
	@FindBy(xpath = "//td[text()='Enter Time-Track']")private WebElement text;
	public homepage1(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public String verifytext()
	{
		String actText=text.getText();
		return actText;
		
	}
	
	 
}
