package firstt;

import org.testng.annotations.Test;

public class dependsonMethods2 
{
	@Test
	public void a1()
	{
		System.out.println("a1");
	}
	
	@Test(invocationCount=3, dependsOnMethods="a3")
	public void a2()
	{
		System.out.println("a2");
	}
	
	@Test(priority=2)
	public void a3()
	{
		System.out.println("a3");
	}

}
