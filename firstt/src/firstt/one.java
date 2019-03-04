package firstt;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class one
{
	@Parameters("name")
	@Test
	public void b1(String name)
	{
		System.out.println(name);
	}
}
