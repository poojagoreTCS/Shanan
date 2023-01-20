package selenium_popup;

import java.util.ArrayList;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class child_browser_popup {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\POOJA GORE\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
        
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mobile under 25000",Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='realme 10 Pro+ 5G (Dark Matter, 128 GB)']")).click();
		Set<String> allwindows = driver.getWindowHandles();
		//create object of arraylist
	   ArrayList<String> al=new ArrayList<String>(allwindows);
	    String mainid = al.get(0);
		Thread.sleep(4000);
	    driver.switchTo().window(al.get(1));
	    String cwind = al.get(1);
		System.out.println(cwind);
		Thread.sleep(5000);
		String title = driver.getTitle();
		System.out.println(title);
	}

}
