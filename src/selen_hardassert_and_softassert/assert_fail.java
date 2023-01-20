package selen_hardassert_and_softassert;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class assert_fail {
	@Test
	public void tc1()
	{
		Reporter.log("tunning tc first",true);
		Assert.fail();
		System.out.println("i am after failing tc1");
	
	}
    @Test
	public void tc2() 
	{
	  Reporter.log("running tc second",true);
	}

}
