package selenium_webElement;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robot2 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\POOJA GORE\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.get(" https://identity.monster.com/login?state=hKFo2SBoblg5Uk1aWTdqalVGMmotNDdjN3E3TWF0UHFUQmVtSKFupWxvZ2luo3RpZNkgdVdUQU5sMWlQbEZKTTNLMFRnYUNaOFZlNGRSVkUxbkijY2lk2SBzQm53NzJtNE82QTFheHVPZ1FxUDBGaDhuSDV6ckRyZQ&client=sBnw72m4O6A1axuOgQqP0Fh8nH5zrDre&protocol=oauth2&redirect_uri=https%3A%2F%2Fwww.monster.com%2Fprofile%2Fauth%2Fcallback&response_type=code&audience=profiles-profile-app-service&scope=openid%20profile%20email%20offline_access&monsterProps=eyJsYW5ndWFnZVRhZyI6ImVuLVVTIiwicmVjb2duaXplZFVzZXIiOmZhbHNlLCJtb2RlIjoiTG9naW4ifQ");
		Robot r=new Robot();
		Thread.sleep(4000);
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		Thread.sleep(4000);
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		Thread.sleep(4000);
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
	}

}
