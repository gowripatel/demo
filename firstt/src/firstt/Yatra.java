package firstt;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Yatra {

	@Test
	public void searchFlight() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 driver.get("https://www.yatra.com/");
	 Thread.sleep(1000);
	 driver.findElement(By.name("flight_origin_city")).sendKeys("Bangalore, India (BLR)");
	 
	driver.findElement(By.name("flight_destination_city")).sendKeys("Singapore");
	
	driver.findElement(By.name("flight_origin_date" )).click();
	//Date date = new Date();
	driver.findElement(By.xpath("//td[@data-date ='05/03/2019']")).click();
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//input[@value='Search']")).click();
	Thread.sleep(1000);
	
}
}
