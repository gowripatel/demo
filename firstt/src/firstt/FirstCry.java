package firstt;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstCry 
{

	WebDriver driver;
	@BeforeMethod
	public void open()
	 {
		System.setProperty("webdriver.chrome.driver", "./jars/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.firstcry.com/");		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 }
	@Test
	public void test() throws InterruptedException
	{
		
		List<WebElement> categories = driver.findElements(By.xpath("//ul/li[@class='double']/a"));
		for(int i=categories.size();i>=0;i--)
		{
			System.out.println(categories.get(i).getText());
		}
		
	}
		@AfterMethod
		public void close()
		{
			driver.close();
		}
}
