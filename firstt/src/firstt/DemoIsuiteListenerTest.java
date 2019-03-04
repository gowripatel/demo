package firstt;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(firstt.DemoIsuteListner.class)
public class DemoIsuiteListenerTest {
	
	@BeforeSuite
	public void suite()
	{
		
	}
	@AfterSuite
	
	public void suite2()
	{
	System.out.println("");	
	}
	
	
	@Test
	public void run()
	{
	System.out.println("Pushpendra");	
	}
	@Test
	public void run2()
	{
		System.out.println("Singh");
	}

}
