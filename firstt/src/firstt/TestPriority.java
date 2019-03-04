package firstt;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestPriority extends TestDemo2
{
	@Test(alwaysRun = true)
	
		public void logIn()
		{
			Reporter.log("EnterUn", true);
		}
	
	@Test(alwaysRun = true)
	
	public void logOut()
	{
		Reporter.log("EnterUn", true);
	}
	}

