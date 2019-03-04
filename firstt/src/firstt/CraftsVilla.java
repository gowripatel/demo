package firstt;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CraftsVilla {

	@Test
	public void openBrowser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 
	driver.get("https://www.craftsvilla.com/");
	Thread.sleep(1000);
 driver.findElement(By.name("q")).sendKeys("kurtis");
driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();	
      List<WebElement> products = driver.findElements(By.xpath("//div[@class='col-xs-12 product-details']//a"));
      int list_products = products.size();
      System.out.println("no. of products : "+list_products);
      
      
      driver.close();
	}

}
