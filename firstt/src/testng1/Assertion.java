package testng1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion {
	@Test
	public void asser()
	{
		
		String exceptedtitle="aliabhatt.fb.co";
		String actualtitle="aliabhatt.fb.com";// title come from browser
		Assert.assertEquals(actualtitle, exceptedtitle);
		System.out.println("actual is matching with excepted title");

	}
}