package selenium_method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","\\C:\\Users\\POOJA GORE\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.google.com/?gws_rd=ssl");
		driver.navigate().to("https://www.facebook.com//");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}

}
