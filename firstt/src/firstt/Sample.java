package firstt;

import org.testng.annotations.Test;

public class Sample 
{
	@Test(priority=4)
	public void b1()
	{
		System.out.println("Hi");
	}
	
	@Test(priority=2)
	public void b2()
	{
		System.out.println("Bye");
	}
}
