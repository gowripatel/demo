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

public class Google
{

	WebDriver driver;
	@BeforeMethod
	public void open()
	 {
		System.setProperty("webdriver.chrome.driver", "./jars/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 }
	@Test
	public void test() throws InterruptedException
	{
		WebElement search = driver.findElement(By.xpath("//input[@title='Search']"));
		search.sendKeys("Selenium");
		Thread.sleep(2000);
		List<WebElement> suggestions = driver.findElements(By.xpath("//div[@class='sbl1']"));
		System.out.println(suggestions.size());
		for(int i=0;i<suggestions.size();i++)
		{
			String suggestionsText = suggestions.get(i).getText();
			System.out.println(suggestionsText);
		}
		Thread.sleep(2000);
		System.out.println("------------");
		for(int i=suggestions.size()-1;i>=0;i--)
		{
			String suggestionsText1 = suggestions.get(i).getText();
			System.out.println(suggestionsText1);
		}
		Thread.sleep(2000);
		suggestions.get(2).click();
		Thread.sleep(2000);
		
		
		
	}
	@AfterMethod
	public void close()
	{
		driver.close();
	}
}
