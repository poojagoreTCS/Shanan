package selen_hardassert_and_softassert;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class assert_notequals {
	@Test
	public void tc1()
	{
	 Reporter.log("tunning tc1",true);	
	 String expT="hii";
	 String actT="Hello";
	 Assert.assertNotEquals(expT,actT);
	}

}
