package selenium_popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_popup2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\POOJA GORE\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
	    driver.get("https://nxtgenaiacademy.com/alertandpopup/");
	    driver.findElement(By.xpath("//button[@name='promptalertbox1234']")).click();
	    Alert alt = driver.switchTo().alert();
		String text = alt.getText();
		 System.out.println(text);
	}

}
