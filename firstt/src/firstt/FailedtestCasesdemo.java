package firstt;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class FailedtestCasesdemo implements IRetryAnalyzer {
	int count = 0;
	int maxCount = 40;
	@Override
	public boolean retry(ITestResult result) {
		if(count<maxCount) {
			count++;
			return true;
		}
		return false;
	}

}
