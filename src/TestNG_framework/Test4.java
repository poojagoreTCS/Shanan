package TestNG_framework;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test4 {
	@Test
	public void TC1() {
		Reporter.log("first tc pass",true);
	}
	@Test
    public void TC2() {
		Reporter.log("second tc pass",true);
	}
	@Test
	public void TC3() {
		Reporter.log("third tc fail",true);
		Assert.fail();
	}
	@Test
	public void TC4() {
		Reporter.log("fourth tc fail",true);
		Assert.fail();
	}

}
