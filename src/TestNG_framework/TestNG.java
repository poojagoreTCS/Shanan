package TestNG_framework;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG {
	@BeforeClass
	public void openbrowser()
	{
		Reporter.log("open browser",true);
	}
	@BeforeMethod
	public void loginapp()
	{
		Reporter.log("login browser",true);
	}
	@Test
	public void verifyuserid()
	{
		Reporter.log("running user id",true);
	}
	@AfterMethod
	public void logoutapp()
	{
		Reporter.log("logout app",true);
	}
	@BeforeClass
	public void closebrowser()
	{
		Reporter.log("close browser",true);
	}
	

}
