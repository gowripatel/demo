package firstt;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoFails {
	
@Test(retryAnalyzer = firstt.Fail.class)
public void A()
{
	System.out.println("Hello");
	Assert.fail();
}
@Test
public void B() 
{
	
}
}
