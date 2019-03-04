package firstt;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class optionalparameter
{
	@Parameters("city")
	@Test
	public void b1(@Optional("bangalore") String s)
	{
		System.out.println(s);
	}

}
