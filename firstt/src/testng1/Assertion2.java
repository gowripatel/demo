package testng1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion2 {
	@Test
	public void asser()
	{
		boolean expected=true;
		boolean actual=false;
		
		Assert.assertTrue(false);
		System.out.println("working");
	}

}
