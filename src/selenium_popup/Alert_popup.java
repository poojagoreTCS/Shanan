package selenium_popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_popup {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\POOJA GORE\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
	    driver.get("https://demo.guru99.com/test/delete_customer.php");
      
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("9878");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		Alert alt = driver.switchTo().alert();
		//alt.accept();
		alt.dismiss();
		//String text = alt.getText();
		//System.out.println(text);
	}

}
