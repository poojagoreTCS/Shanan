package selenium_locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_by_contains_using_attri {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "\\C:\\Users\\POOJA GORE\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.linkedin.com/login/");
		//enter username
		driver.findElement(By.xpath("//input[contains(@id,'username')]")).sendKeys("admin");
		//enter pass
		driver.findElement(By.xpath("//input[contains(@id,'password')]")).sendKeys("manager");
		//click on login button
		driver.findElement(By.xpath(" //button[contains(text(),'Sign in')]")).click();
	}

}
