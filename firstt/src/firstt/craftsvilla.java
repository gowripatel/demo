package firstt;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class craftsvilla {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./SeleniumServer/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.craftsvilla.com/");
		driver.findElement(By.id("searchval")).sendKeys("sarees");
		driver.findElement(By.xpath("//i[@class='icon cv-search']")).click();
		Thread.sleep(5000);
		List<WebElement> choices = driver.findElements(By.xpath("//div[@class='col-xs-12 product-details']//a"));
		System.out.println("The number of choices are : "+choices.size());
		List<WebElement> prices = driver.findElements(By.xpath("//span[@class='product-offer-price']"));
		for (int i = 0; i < choices.size(); i++) 
			System.out.println("The choices are : "+choices.get(i).getText()+"and its price is"+prices.get(i).getText());
		Thread.sleep(2000);
		driver.close();
	}
}
    