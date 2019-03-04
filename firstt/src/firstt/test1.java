package firstt;

import org.testng.annotations.Test;

public class test1 extends Parent
{
	@Test
	public void a1()
	{
		System.out.println("Hi");
	}
	
	@Test(priority=2)
	public void aa()
	{
		System.out.println("Bye");
	}
}
