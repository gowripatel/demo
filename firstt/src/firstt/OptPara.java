package firstt;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OptPara {
@Parameters("city")
	@Test
	
	public void test(@Optional("Pune") String s)
	{
		System.out.println(s);
	}
	

}
