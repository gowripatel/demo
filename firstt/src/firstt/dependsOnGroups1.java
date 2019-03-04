package firstt;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependsOnGroups1
{
	@Test(dependsOnGroups="smoke")
	public void b1()
	{
		System.out.println("b1");
	}
	
	@Test(groups="smoke")
	public void b2()
	{
		Assert.fail();
		System.out.println("b2");
	}

}
