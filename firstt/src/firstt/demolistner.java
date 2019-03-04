package firstt;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(firstt.listners.class)

public class demolistner
{
	
	@BeforeSuite
	public void a()
	{
		System.out.println("before suite");
	}
	
	@AfterSuite
	public void a1()
	{
		System.out.println("after suite");
	}
	
	@BeforeClass
	public void c1()
	{
		System.out.println("before class");
	}
	
	@AfterClass
	public void c2()
	{
		System.out.println("after class");
	}
	
	@Test
	public void b1()
	{
		System.out.println("b1");
//		Assert.assertTrue(false);
	}
	
	@Test
	public void b2()
	{
		System.out.println("b2");
	}
	

}
