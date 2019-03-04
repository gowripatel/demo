package firstt;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(firstt.listners.class)

public class demolistner1
{
	@Test
	public void b1()
	{
		Assert.assertTrue(true);
	}
	
	@Test
	public void b2()
	{
		
	}
	

}
