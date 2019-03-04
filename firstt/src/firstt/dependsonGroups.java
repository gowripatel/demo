package firstt;

import org.testng.annotations.Test;

public class dependsonGroups 
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
	}

}
