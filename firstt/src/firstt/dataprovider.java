package firstt;

import org.testng.annotations.Test;

public class dataprovider 
{
	@Test(dataProviderClass=firstt.datadriven3.class, dataProvider="b1")
	public void b3(String s, String s1)
	{
		System.out.println(s);
		System.out.println(s1);
	}
}
