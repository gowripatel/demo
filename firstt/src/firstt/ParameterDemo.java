package firstt;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterDemo {
	@Parameters({"city","state"})
	@Test
	public void param(String city, String state)
	{
		System.out.println(city+" "+state);
	}
}
