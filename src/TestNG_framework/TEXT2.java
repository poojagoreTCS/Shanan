package TestNG_framework;

import java.io.FileInputStream;

import java.time.Duration;

//import org.apache.commons.math3.analysis.function.Sinh;
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

//import POM.HomePage;
//import POM.LoginPage;

public class TEXT2 {
	Sheet sh;
	WebDriver driver;
	LOGINPAGE2 l;
	HOMEPAGE2 h;
	
	@BeforeClass
	public void openBrower() throws Throwable {
		FileInputStream fis =new FileInputStream("C:\\Users\\POOJA GORE\\Documents\\testNG.xlsx");
		 sh = WorkbookFactory.create(fis).getSheet("Sheet1");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\POOJA GORE\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");
		//all objects we need to create
		 l=new LOGINPAGE2(driver);
		 h=new HOMEPAGE2(driver);
	}
	@BeforeMethod
	public  void openApp() {
		String username = sh.getRow(0).getCell(0).getStringCellValue();
		l.enterUN(username);
		String password=sh.getRow(0).getCell(1).getStringCellValue();
		l.enterPWD(password);
		l.clickloginBTN();
	}
	@Test
	public void verifyText() {
		Reporter.log("Running VerifyText",true);
		String expText = sh.getRow(0).getCell(2).getStringCellValue();
		String actText = h.verifyText();
	    Assert.assertEquals(expText,actText);
	}
	@AfterMethod
	public void logout() {
		Reporter.log("logout from app",true);
	}
	@AfterClass
	public void closeBrowser() {
		Reporter.log("close the browser",true);
	}


}
