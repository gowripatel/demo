package firstt;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class iretryanalizer implements IRetryAnalyzer
{
	int count = 0;
	int max_Count = 3;
	
	@Override
	public boolean retry(ITestResult result) {
		if(count<max_Count)
		{
			count++;
			return true;
		}
		// TODO Auto-generated method stub
		return false;
	}

}
