package selenium_method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sel_maxi2 {
	public static void main(String[] args) {
		System.setProperty("webDriver.chrome.driver", "\\C:\\Users\\POOJA GORE\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com//");
		driver.manage().window().maximize();
	}

}
