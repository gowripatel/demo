package firstt;

import org.testng.Reporter;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Invocat {
	@Test(invocationCount=6)
	public void test1()
	{
		Reporter.log("from test1",true);
	}
	
	@Test(invocationCount=0)
	public void tes2()
	{
		Reporter.log("from test2",true);
	}

	@Test(enabled=false)
	public void test3()
	{
		Reporter.log("from test3",true);
	}
	
	@Ignore
	@Test()
	public void test4()
	{
		Reporter.log("from test4",true);
	}


}
