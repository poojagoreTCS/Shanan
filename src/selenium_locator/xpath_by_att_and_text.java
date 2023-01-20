package selenium_locator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_by_att_and_text {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "\\C:\\Users\\POOJA GORE\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login.php");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc@gmail");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='login']")).click();
		String expectT="login ";
		String actualT=driver.getTitle();
		if(expectT.equals(actualT))
		{
			System.out.println("tc is pass");
		}
		else
		{
			System.out.println("tc is fail");
		}
		
	}

}
