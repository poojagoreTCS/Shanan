package selenium_popup;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class child_browser_popup2 {
	public static void main(String[] args)throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\POOJA GORE\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("");
		Thread.sleep(4000);
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).click();
	     Set<String> allwindows=driver.getWindowHandles();
		 ArrayList<String> al = new ArrayList<String>(allwindows);
		  String mainid=al.get(0);
		  System.out.println(mainid);
		  driver.switchTo().window(al.get(1));
		  String cwind=al.get(1);
		  System.out.println(cwind);
		  String tittle=driver.getTitle();
		  System.out.println(tittle);
		
	}

}
