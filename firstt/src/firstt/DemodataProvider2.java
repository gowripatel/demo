package firstt;

import org.testng.annotations.Test;

public class DemodataProvider2 {
	@Test(dataProviderClass=firstt.DemoDetaProvider.class,dataProvider="test1")
	public void run(String s1,String s2)
	{
		
		System.out.println(s1);
		System.out.println(s2);
	}

}
