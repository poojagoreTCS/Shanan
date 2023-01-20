package TestNG_framework;

import java.io.FileInputStream;

//import java.io.IOException;
//import java.time.Duration
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class text1 {
	Sheet sh;
	WebDriver driver;
	loginpage1 l;
	homepage1 h;
	@BeforeClass
	public void openBrowser() throws Throwable
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\POOJA GORE\\Documents\\testNG.xlsx");
		 sh=WorkbookFactory.create(fis).getSheet("sheet1");
		System.setProperty("webdriver.chrome.driver", "\\C:\\Users\\POOJA GORE\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
		 driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait( Duration.ofseconds(10));
		driver.get("https://demo.actitime.com/login.do");
		 l=new loginpage1(driver);
		 h=new homepage1(driver);
	}
	@BeforeMethod
	public void openApp()
	{
		
		String username=sh.getRow(0).getCell(0).getStringCellValue();
		l.enterUN(username);
		String password=sh.getRow(0).getCell(1).getStringCellValue();
		l.enterPWD(password);
		l.clickloginBTN();
	}
	@Test
	public void verifytext()
	{
		Reporter.log("running verify text",true);
		String expText=sh.getRow(0).getCell(2).getStringCellValue();
		String actText=h.verifytext();
		Assert.assertEquals(expText, actText);
	}
	@AfterMethod
	public void logout()
	{
		Reporter.log("logout for app",true);
	}
	@AfterClass
	public void closebrowser()
	{
		Reporter.log("close the browser",true);
	}
}
