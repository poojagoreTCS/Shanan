package TestNG_framework;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1 {
	@Test
	public void tc1() {
		System.setProperty("webdriver.chrome.driver","\\C:\\Users\\POOJA GORE\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().deleteAllCookies();
		driver.get("https://demo.actitime.com/login.do");
		Reporter.log("hii how are you",true);
	}
	@Test
	public void tc2() {
		Reporter.log("i am fine",true);
		Assert.fail();
	}

}
