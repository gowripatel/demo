package firstt;

import org.testng.annotations.Test;

public class TestNGgroups
{
	@Test(groups="smoke", priority=2)
	public void b1()
	{
		System.out.println("b1");
	}
	
	@Test(groups={"smoke","reg"}, invocationCount=5)
	public void b2()
	{
		System.out.println("b2");
	}
	
	@Test(groups="reg",priority=3,invocationCount=5)
	public void b3()
	{
		System.out.println("b3");
	}
	
	@Test(priority=-1,invocationCount=2)
	public void b4()
	{
		System.out.println("b4");
	}

}
