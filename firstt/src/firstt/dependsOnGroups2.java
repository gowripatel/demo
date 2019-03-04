package firstt;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependsOnGroups2 
{
	@Test(dependsOnGroups="smoke")
	public void b1()
	{
		System.out.println("b1");
	}
	
	@Test(groups="smoke")
	public void b2()
	{
		System.out.println("b2");
		Assert.fail();
	}

}
