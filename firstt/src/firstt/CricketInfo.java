package firstt;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CricketInfo {
	@Test
	public void scoreCard() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
	 WebDriver driver = new ChromeDriver(); 
	 /* System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe" );
	 WebDriver driver = new FirefoxDriver();*/
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 
	driver.get("http://www.espncricinfo.com/");
	Thread.sleep(1000);
	//driver.findElement(By.className("sprite close dark")).click();
	driver.findElement(By.xpath("//h2[text()='IND v AUS']")).click();
	Thread.sleep(1000);
	driver.findElement(By.className("\"button-alt sm\"")).click();;
	}
}
