package selenium_popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_popup1 {
	public static void main(String[] args)throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\POOJA GORE\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
	    driver.get("https://nxtgenaiacademy.com/alertandpopup/");
	    Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@name='alertbox']")).click();
		//driver.findElement(By.xpath("//button[@name='confirmalertbox']")).click();
		Alert alt = driver.switchTo().alert();
		alt.accept();
		//alt.dismiss();
		
	}

}
