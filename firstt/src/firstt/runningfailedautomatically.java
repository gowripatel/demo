package firstt;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.annotations.Test;

public class runningfailedautomatically
{
	@Test
	public void b1()
	{
		TestNG test = new TestNG();
		
		List<String> ls = new ArrayList<String>();
		ls.add("C:\\Users\\Admin\\git\\demo\\firstt\\test-output\\testng-failed.xml");		
				
		test.setTestSuites(ls);
		
		test.run();
	}

}
