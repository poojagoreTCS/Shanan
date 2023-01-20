package selenium_webElement;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class list {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "\\C:\\Users\\POOJA GORE\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		//opent the app
		driver.get("https://www.facebook.com/r.php");
		//click on create new acccount btn
	
		//driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		//select Day listbox
		Thread.sleep(4000);
		WebElement day= driver.findElement(By.xpath("//select[@id='day']"));
		//create object of select class
		Select s=new Select(day);
		s.selectByVisibleText("15");
		
		Thread.sleep(4000);
		WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
		Select s1=new Select(month);
		s1.selectByVisibleText("Feb");
		
		Thread.sleep(4000);
		WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
		Select s2=new Select(year);
		s2.selectByVisibleText("1998");
		
	}
		
	}