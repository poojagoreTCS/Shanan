package selenium_webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Key_class2 {
	public static void main(String[] args)throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\POOJA GORE\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.get("http://actitime.summant.com/login.jsp");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='username'] ")).sendKeys("pooja",Keys.TAB,"gore",Keys.ENTER);
		
	}

}
