package selenium_webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class list1 {
	public static void main(String[] args) throws Throwable{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\POOJA GORE\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		
		Thread.sleep(5000);
		WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
		Select b=new Select(day);
		b.selectByValue("22");
		
		Thread.sleep(4000);
		WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
		Select b1=new Select(month);
		b1.selectByVisibleText("Jul");
		
		Thread.sleep(4000);
		WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
		Select b2=new Select(year);
		b2.selectByVisibleText("2020");
		
	}

}
