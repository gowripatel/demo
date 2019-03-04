package dependsOnGroups;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class DemoC {
	@Parameters({"filmname","actor"})
	@Test
	public void normaltestclass(String s,String v)
	{
		System.out.println( s+" "+v);
	}

}
