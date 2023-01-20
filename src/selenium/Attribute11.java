package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Attribute11 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","\\C:\\Users\\POOJA GORE\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.get("https://integrator.actitime.com/auth/at");
		driver.findElement(By.xpath("//input[@name='actiTimeUrl']")).sendKeys("1234");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("pooja");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("gore");
		driver.findElement(By.xpath("//span[text()='Login']")).click();
	
	}

}
