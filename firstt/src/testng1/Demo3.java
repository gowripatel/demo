package testng1;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(testng1.Lisst.class)

public class Demo3 {
	@BeforeSuite
	public void suitet()
	{
		
	}
	@AfterSuite
	public void suitt()
	{
		
	}

	@Test
	public void run()
	{
		//Assert.assertTrue(false);
		//System.out.println("test 3 is running");
	}
	
	@Test
	public void run2()
	{
		
	}
}
