package selenium_screenshot;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot2 {
	
		public static void main(String[] args) throws Throwable{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\POOJA GORE\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			TakesScreenshot ts=(TakesScreenshot) driver;
			 File src=ts.getScreenshotAs(OutputType.FILE);
			 File dest=new File("C:\\Users\\POOJA GORE\\Desktop\\screenshot\\facebook.png");
			 com.google.common.io.Files.copy(src, dest);
			// Files.copy(src,dest);

	}

}
