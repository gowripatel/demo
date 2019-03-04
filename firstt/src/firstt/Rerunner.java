package firstt;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.annotations.Test;

public class Rerunner {
	
	@Test
	public void demo() {
		TestNG test = new TestNG();
		List<String> s = new ArrayList<String>();
		s.add("C:\\Users\\SARANYA\\git\\Testng\\firstt\\test-output\\testng-failed.xml");
		test.setTestSuites(s);
		test.run();
	}
}
