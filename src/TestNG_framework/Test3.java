package TestNG_framework;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test3 {
	@Test
	public void TC1() {
		System.setProperty("webdriver.chrome.driver","\\C:\\Users\\POOJA GORE\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Reporter.log("open facebook",true);
	}
	@Test
	public void TC2() {
		System.setProperty("webdriver.chrome.driver","\\C:\\Users\\POOJA GORE\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		Reporter.log("open instageam",true);
	}
	@Test
	public void TC3() {
		System.setProperty("webdriver.chrome.driver","\\C:\\Users\\POOJA GORE\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Reporter.log("open amazon",true);
		Assert.fail();
	}

}
