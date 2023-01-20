package charita;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","\"C:\\\\Users\\\\POOJA GORE\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.get("\"https://www.facebook.com/\"");
		driver.close();
		driver.manage().window().maximize();
	}

}
