package selenium_scroll_handling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll3 {
	public static void main(String[] args) throws Throwable{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\POOJA GORE\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/?tag=hymsabk-20&ref=pd_sl_6gwjrxu9p1_e&adgrpid=1341405838299434&hvadid=83838130693494&hvnetw=o&hvqmt=e&hvbmt=be&hvdev=c&hvlocint=&hvlocphy=149340&hvtargid=kwd-83838874655187:loc-90&hydadcr=28884_11845481");
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		//scroll down
		jse.executeScript("window.scrollBy(0,4000);");
		//scroll up
		Thread.sleep(4000);
		jse.executeScript("window.scrollBy(0,-5000);");
		
	}

}
