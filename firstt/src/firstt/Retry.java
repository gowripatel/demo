package firstt;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer{
     int count=0;
     int max_count=22;
	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		
		if(count<max_count)
		{
			count++;
			return true;
		}
		return false;
	}
	
	

}
