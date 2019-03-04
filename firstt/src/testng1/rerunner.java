package testng1;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.annotations.Test;

public class rerunner {
	@Test
	public void runn()// to run automatically the failed test class
	{
		TestNG test=new TestNG();
		List<String> ls=new ArrayList<>();
		ls.add("");
		test.setTestSuites(ls);
		test.run();
		
	}

}
