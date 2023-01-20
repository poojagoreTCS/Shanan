package selenium_scroll_handling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {
	public static void main(String[] args) throws Throwable{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\POOJA GORE\\Downloads\\chromedriver_win32\\chromedriver.exe\\" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		//scroll down
		Thread.sleep(4000);
		jse.executeScript("window.scrollBy(0,8000);");
		//jse.executeScript("window.scrollBy(0,8000);");
		//scroll up
		Thread.sleep(4000);
		jse.executeScript("window.scrollBy(0,-7000);");
	
	
	}

}
