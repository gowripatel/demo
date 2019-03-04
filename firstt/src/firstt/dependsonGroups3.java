package firstt;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependsonGroups3
{
	@Test(groups="bahubali2",dependsOnGroups="bahubali1")
	public void b1()
	{
		System.out.println("b1");
	}
	
	@Test(groups="bahubali1")
	public void b2()
	{
		System.out.println("b2");
		Assert.fail();
	}

}
