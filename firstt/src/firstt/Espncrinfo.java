package firstt;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Espncrinfo
{
	WebDriver driver;
	@BeforeMethod
	public void open()
	 {
		System.setProperty("webdriver.chrome.driver", "./jars/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.espncricinfo.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 }
	@Test
	public void test() throws InterruptedException
	{
		driver.findElement(By.xpath("//span[@class='sprite close dark']")).click();
		WebElement IndaivsAus = driver.findElement(By.xpath("//section[@class='col-one']/descendant::li[@class='quicklinks_list__item']/following-sibling::li/a"));
		IndaivsAus.click();
		
	}
	@AfterMethod
	public void close()
	{
		driver.close();
	}
}
