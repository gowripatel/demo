package firstt;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestPara 
{
	@Parameters("filmname")
	@Test
	public void m1(String s)
	{
		System.out.println(s);
	}
}
