package TestNG_framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HOMEPAGE2 {
	@FindBy(xpath="//td[text()='Enter Time-Track']")private WebElement text;
	
	public   HOMEPAGE2(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public String verifyText() {
		String actText = text.getText();
		return actText;
	}
	
	
}


