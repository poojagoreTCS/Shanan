package selenium_method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sel_getcurre2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","\\C:\\Users\\POOJA GORE\\Downloads\\chromedriver_win32\\chromedriver.exe\\" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/?gws_rd=ssl");
		String link=driver.getCurrentUrl();
		System.out.println(link);
		
	}

}
