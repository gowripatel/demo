package data_provi;

import org.testng.annotations.Test;

public class ReadDataFrXls1a {
	
	@Test(dataProviderClass=data_provi.ReadDataFrXls1.class,dataProvider="normaltestcase")
	public void run(String s,String s2)
	{
		System.out.println(s);
		System.out.println(s2);
	}

}
