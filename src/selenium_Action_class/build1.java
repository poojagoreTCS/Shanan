package selenium_Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class build1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\POOJA GORE\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement Target = driver.findElement(By.xpath("//a[text()='Images']"));
		Actions act=new Actions(driver);
		act.moveToElement(Target).perform();
		act.contextClick(Target);
		//act.click(Target);
		act.moveToElement(Target).doubleClick().perform();
		
	}

}
