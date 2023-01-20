package selen_hardassert_and_softassert;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class assert_false {
	@Test
	public void tc1()
	{
		Reporter.log("tunning tc first",true);
		boolean actResult=false;
		 Assert.assertFalse(actResult);
	}

}
