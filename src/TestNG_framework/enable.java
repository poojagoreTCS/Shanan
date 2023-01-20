package TestNG_framework;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class enable {
	@Test
	public void tc1()
	{
		Reporter.log("running tc1",true);
	}
	@Test(enabled = false)
	public void tc2()
	{
		Reporter.log("running tc2",true);
	}

}
