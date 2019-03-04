package firstt;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParaOptional {
	@Parameters("city")
	@Test
	public void run(@Optional("hi")String s1)
	{
		System.out.println(s1);
	}
	

}
