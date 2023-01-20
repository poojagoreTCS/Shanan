package TestNG_framework;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample2 {
	@Test
	public void tc1() {
		Reporter.log("running tc4",true);
	}
	@Test
	public void tc2()
	{
		Reporter.log("running tc5",true);
	}
	@Test
	public void tc3()
	{
	    Reporter.log("running tc6",true);	
	}

}
