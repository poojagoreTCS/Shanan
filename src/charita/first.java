package charita;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class first {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\POOJA GORE\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.google.com//");
	    String expTitle=("amazom.com.spend less.smile more");
	    String actTitle=driver.getTitle();
	    if(expTitle.equals(actTitle))
	    {
	    	System.out.println("title is pass");
	    }
	    else 
	    {
	          System.out.println("");
	     }
	    	
	    }

}
	


