package firstt;

import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DemoParameter {
	@Parameters("city")
	@Test
	public void run(String s   )
	{
		
		Reporter.log(s, true);
	}

}
