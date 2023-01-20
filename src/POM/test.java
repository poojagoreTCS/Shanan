package POM;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\POOJA GORE\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");
		//call 1st pom class
		login_page l=new login_page(driver);
		l.enterUn();
		l.entePWD();
		l.clickLoginBtn();
		//call 2nd pom class
		home_page h=new home_page(driver);
		h.verifyText();
	}


}
