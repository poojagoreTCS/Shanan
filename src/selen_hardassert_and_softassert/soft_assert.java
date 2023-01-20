package selen_hardassert_and_softassert;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class soft_assert {
	@Test
	public void tc1()
	{
		String s1="hii";
		String s2="hello";
		SoftAssert s=new SoftAssert();
		s.assertEquals(s1,s2);
		System.out.println("i am after failing tc1");
		s.assertAll();
	}

}
