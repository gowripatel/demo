package firstt;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion2 
{
	@Test
	public void b1()
	{
		boolean aTitle = true;
		boolean eTitle = false;
		
		Assert.assertEquals(aTitle, eTitle); // we will get an exception
		
		System.out.println("both titles are matching");
	}

}
