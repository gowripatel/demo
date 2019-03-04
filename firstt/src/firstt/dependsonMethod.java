package firstt;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependsonMethod 
{
	@Test
	public void a1()
	{
		System.out.println("a1");
	}
	
	@Test(invocationCount=1, dependsOnMethods="a3")
	public void a2()
	{
		System.out.println("a2");
	}
	
	@Test
	public void a3()
	{
		System.out.println("a3");
		Assert.fail();
	}
}
