package firstt;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MakeMyTrip {
	@Test
	public void searchResort() throws InterruptedException
	{
		/*System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
	 WebDriver driver = new ChromeDriver(); */
	 System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe" );
	 WebDriver driver = new FirefoxDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	// driver.get("https://www.makemytrip.com/");

	 driver.findElement(By.id("header_tab_hotels")).click();
	 driver.findElement(By.id("hp-widget__sDest")).sendKeys("Kerala");
	 

}
}
