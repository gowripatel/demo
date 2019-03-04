package dependsOnGroups;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public final class DemoD {
  @Parameters("filmname")
	@Test
	public void normaltestclass(String s) {
		System.out.println(s);
	}

}
