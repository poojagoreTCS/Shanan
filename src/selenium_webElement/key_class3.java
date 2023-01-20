package selenium_webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class key_class3 {
	public static void main(String[] args) throws Throwable{
		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\POOJA GORE\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.get(" https://identity.monster.com/login?state=hKFo2SBwYnZkNzMtcFZXbENQWHdvREJ6MjNhd2RTS3hnZms1baFupWxvZ2luo3RpZNkgUjl6Z2ZtREc4RElFX1c1eG03U1VjSUxWSXc5dkNhbUWjY2lk2SBzQm53NzJtNE82QTFheHVPZ1FxUDBGaDhuSDV6ckRyZQ&client=sBnw72m4O6A1axuOgQqP0Fh8nH5zrDre&protocol=oauth2&redirect_uri=https%3A%2F%2Fwww.monster.com%2Fprofile%2Fauth%2Fcallback&response_type=code&audience=profiles-profile-app-service&scope=openid%20profile%20email%20offline_access&monsterProps=eyJsYW5ndWFnZVRhZyI6ImVuLVVTIiwicmVjb2duaXplZFVzZXIiOmZhbHNlLCJtb2RlIjoiTG9naW4ifQ ");
		Thread.sleep(4000);
	
		driver.findElement(By.xpath("//input[@id='email'] ")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
		
	}

}
