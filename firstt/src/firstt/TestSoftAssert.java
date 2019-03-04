package firstt;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestSoftAssert {
	@Test
	
	public void testSoftAssert()
	{
		boolean actual = true;
		boolean expected = false;
		
		String actual = 
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actual, expected);
		System.out.println(" not matching");
		sa.assertAll();
	}
	

}
