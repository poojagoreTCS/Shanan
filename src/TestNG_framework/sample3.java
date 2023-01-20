package TestNG_framework;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample3 {
	@Test
	public void tc1() {
		Reporter.log("running tc7",true);
	}
	@Test
	public void tc2()
	{
		Reporter.log("running tc8",true);
	}
	@Test
	public void tc3()
	{
	    Reporter.log("running tc9",true);	
	}

}
