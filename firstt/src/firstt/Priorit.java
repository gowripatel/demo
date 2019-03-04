package firstt;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priorit {
	
	@Test(priority=-1)
	public void test1()
	{
		Reporter.log("from test1",true);
	}
	
	@Test(priority=3)
	public void test2()
	{
		Reporter.log("from test2",true);
	}

	@Test(priority=4)
	public void test3()
	{
		Reporter.log("from test3",true);
	}
	@Test(priority=2)
	public void test4()
	{
		Reporter.log("from test4",true);
	}



}
