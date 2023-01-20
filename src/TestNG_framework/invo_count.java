package TestNG_framework;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class invo_count {
	@Test(invocationCount=4)
	public void tc1()
	{
	  Reporter.log("tunning tc",true);
	}	
}
