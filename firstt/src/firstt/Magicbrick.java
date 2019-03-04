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

public class Magicbrick 
{
	WebDriver driver;
	@BeforeMethod
	public void open()
	 {
		System.setProperty("webdriver.chrome.driver", "./jars/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.magicbricks.com/");		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 }
	@Test
	public void test() throws InterruptedException
	{
	WebElement enterLocation = driver.findElement(By.xpath("//input[@placeholder='Enter Location, Project or Landmark']"));	
	enterLocation.sendKeys("Bangalore-South");
	WebElement propertType = driver.findElement(By.xpath("//div[@id='buy_propertyType']"));
	propertType.click();
	WebElement flat = driver.findElement(By.xpath("//div[@class='col1 columnCommon']/descendant::li/span/input"));
	flat.click();
	WebElement housevilla = driver.findElement(By.xpath("//div[@class='col1 columnCommon']/descendant::ul/descendant::li[3]/span/input"));
	housevilla.click();
	WebElement bhk = driver.findElement(By.xpath("//div[@class='bhkWrap']/descendant::span[@class='checkBox']/parent::li/following-sibling::li/span/input"));
	bhk.click();
	WebElement budget = driver.findElement(By.xpath("//input[@value='Budget']"));
	budget.click();
	 WebElement minValue = driver.findElement(By.xpath("//div[@class='range rangeMin']/ul/li/following-sibling::li[@actualval='5000000']"));
	minValue.click();
	 WebElement maxValue = driver.findElement(By.xpath("//div[@class='range rangeMax']/ul/li/following-sibling::li[@actualval='7000000']"));
	 maxValue.click();
	 WebElement search = driver.findElement(By.xpath("//div[@class='formField btnContN']/input"));
	search.click();
	Thread.sleep(4000);
	String win = driver.getWindowHandle();
	driver.switchTo().window(win);
  List<WebElement> properties = driver.findElements(By.xpath("//h3/a"));
  System.out.println(properties.size());
	/*for(int i=0;i<properties.size();i++)
	{
		String propertiesText = properties.get(i).getText();
		System.out.println(propertiesText);
	}*/
	WebElement newProjects = driver.findElement(By.xpath("//li[@class='ft_lt']/following-sibling::li/a"));
	newProjects.click();
	Thread.sleep(5000);
	String win1 = driver.getWindowHandle();
	driver.switchTo().window(win1);
	List<WebElement> newProjectsLink = driver.findElements(By.xpath("//p[@class='proHeading']/strong"));
	for(int i=0;i<newProjectsLink.size();i++)
	{
		String newProjectsLinkText = newProjectsLink.get(i).getText();
		System.out.println(newProjectsLinkText);
	}
	}
	@AfterMethod
	public void close()
	{
		driver.close();
	}
}
