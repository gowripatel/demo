package firstt;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class OptionalDemo {
	@Test
	@Parameters({"un","pw"})
	public void test(@Optional("kochi") String uname,@Optional("kerala") String state) {
		System.out.println(uname+"------- "+state);
	}
}
