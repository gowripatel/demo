package firstt;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.annotations.Test;

public class PrgTorRunFailed {

	@Test
	public void runn()
	{
		TestNG test =new TestNG();
		List<String>ls=new ArrayList<>();
		ls.add("C:\\Users\\User\\Desktop\\WS3\\Demo1\\firstt\\test-output\\Suite13\\testng-failed.xml");
		test.setTestSuites(ls);
		test.run();
		
	}
}
