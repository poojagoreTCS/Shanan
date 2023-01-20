package selenium_framework;

import java.io.FileInputStream;

import java.time.Duration;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DDF {
	public static void main(String[] args)throws Throwable {
		FileInputStream fis=new FileInputStream("C:\\Users\\POOJA GORE\\Documents\\parameterization.xlsx");
        org.apache.poi.ss.usermodel.Sheet sh = WorkbookFactory.create(fis).getSheet("sheet1");
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\POOJA GORE\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://demo.actitime.com/login.do");
	    String un = sh.getRow(0).getCell(0).getStringCellValue();
	    driver.findElement(By.xpath("//input[@id='username']")).sendKeys(un);
	    //enter 
      
	    String pwd = sh.getRow(0).getCell(1).getStringCellValue();
	    driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(pwd); 
        //click on login
	    driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
	}

}
