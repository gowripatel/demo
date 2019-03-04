package firstt;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class BookMyshow {


	@Test
	public void search() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
	 WebDriver driver = new ChromeDriver(); 
	 /* System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe" );
	 WebDriver driver = new FirefoxDriver();*/
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 
	driver.get("https://in.bookmyshow.com/");
	
	//to count img
	List<WebElement> img = driver.findElements(By.xpath("//img"));
	int icount = img.size();
	System.out.println("No. of images = "+icount);
	
	//to count links
	List<WebElement> links = driver.findElements(By.xpath("//a"));
	int lcount = links.size();
	System.out.println("No. of links = "+lcount);
	
	//to count buttons
	List<WebElement> buttons = driver.findElements(By.xpath("//input[@type='button']"));
	int bcount = buttons.size();
	System.out.println("No. of buttons = "+bcount);
	
	//to count radio buttons
	List<WebElement> rb = driver.findElements(By.xpath("//input[@type='radio']"));
	int rbcount = rb.size();
	System.out.println("No. of radio button = "+rbcount);
	
	
	List<WebElement> text = driver.findElements(By.xpath("//input[@type='text']"));
	int txtcount = text.size();
	System.out.println("No. of text boxes = "+txtcount);
	
	driver.close();
	
	
}
}
