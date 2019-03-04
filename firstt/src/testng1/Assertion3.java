package testng1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion3 {
	
	@Test
	public void asser()
	{
		boolean expected=false;
		boolean actual=false;
		
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(expected, actual);
		System.out.println("working");
		sa.assertAll();
	}

}
