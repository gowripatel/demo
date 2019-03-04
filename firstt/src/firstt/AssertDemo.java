package firstt;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.testng.IRetryAnalyzer;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertDemo {

	@Test
	public void assertdemo() {
		String act = "Expectedtitle.homepage";
		String exp = "Expectedtitle.homepa";
		//				Set<String> s1 = new HashSet<String>();
		//				Collections.addAll(s1, "ranju","viju","nice");
		//				Set<String> t1 = new HashSet<String>();
		//				Collections.addAll(t1, "ranju","viju","nice");
		//				
		//				Assert.assertNotEqualsDeep(t, s);

		SoftAssert s = new SoftAssert();
		s.assertEquals(act, exp, "not working");
		System.out.println("Remaining lines of code is executed");
		s.assertAll();
//		s.assertEquals(s1, t1);

	}
}
