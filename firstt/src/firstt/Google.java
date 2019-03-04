package firstt;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Google {
	@Test
	public void selenium() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
	 WebDriver driver = new ChromeDriver(); 
	 /* System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe" );
	 WebDriver driver = new FirefoxDriver();*/
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 
	driver.get("https://www.google.co.in/");
	driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("Selenium");
	Thread.sleep(500);
	List<WebElement> suggestions = driver.findElements(By.xpath("//li[@data-view-type='1']"));
	 int count = suggestions.size();
	 System.out.println(count);
	 for(int i =0;i<=count;i++)
	 {
		 WebElement auto = suggestions.get(i);
		 String text = auto.getText();
		 System.out.println(text);
		 Thread.sleep(5000);
	 }
	 
	/* suggestions.get(2).click();
	 driver.navigate().back();
	 driver.switchTo().activeElement().sendKeys("Selenium");
		Thread.sleep(3000);
	 
	 List<WebElement> allsuggest = driver.findElements(By.xpath("//span[conatins(.,'Selenium')]"));
	 int rcount = allsuggest.size();
	 System.out.println(rcount);
	 //to print in reverse order
	 
	 for(int i=count-1;i>=0;i--)
	 {
		 WebElement auto = allsuggest.get(i);
		 String text = auto.getText();
		 System.out.println(text);
		 
	 } */
	 
	 driver.close();

}
}
