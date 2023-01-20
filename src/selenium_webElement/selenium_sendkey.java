package selenium_webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium_sendkey {
	public static void main(String[] args)throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\POOJA GORE\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com//");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='email'] ")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
		
	}

}
