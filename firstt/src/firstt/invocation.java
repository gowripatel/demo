package firstt;

import org.testng.annotations.Test;

public class invocation 
{
	@Test(invocationCount=5)
	public void a1()
	{
		System.out.println("Hello");
	}
	
	@Test
	public void a()
	{
		System.out.println("Hi");
	}
	
	@Test(enabled=false)
	public void b()
	{
		System.out.println("bye");
	}
	
	@Test(priority=-1)
	public void b0()
	{
		System.out.println("123");
	}
}
