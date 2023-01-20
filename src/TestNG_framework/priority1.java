package TestNG_framework;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class priority1 {
	@Test(priority = 4)
	public void pooja() 
	{
	  Reporter.log("running pooja",true);	
	}
	@Test(priority = 3)
	public void akshay() 
	{
	  Reporter.log("running pooja",true);	
	}
	@Test(priority = 1)
	public void kunal() 
	{
	  Reporter.log("running pooja",true);	
	}
	@Test(priority = 2)
	public void pranav() 
	{
	  Reporter.log("running pooja",true);	
	}
	@Test(priority = 5)
	public void advik() 
	{
	  Reporter.log("running pooja",true);	
	}
}
