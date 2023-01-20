package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath = "")private WebElement verifytext;
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void verifytext(WebElement text)
	{
	 String expT="";
	 String actT=text.getText();
	 if(actT.equals(expT))
	 {
		System.out.println("tc is pass"); 
	 }
	 else
	 {
		 System.out.println("tc is fail");
	 }
	}

}
