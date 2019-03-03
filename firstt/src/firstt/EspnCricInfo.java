package firstt;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EspnCricInfo {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./SeleniumServer/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.espncricinfo.com");
//		Thread.sleep(2000);
//		driver.switchTo().defaultContent();
//		Thread.sleep(6000);
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//div[@class=\"scoreboard active\"]//div[@data-id='1168242']"))).perform();
		driver.findElement(By.xpath("//div[@class=\"scoreboard active\"]//div[@data-id='1168242']//a")).click();
		Thread.sleep(2000);
		WebElement scoreAus = driver.findElement(By.xpath("//div[@class='cscore_score ']"));
		WebElement scoreIndia = driver.findElement(By.xpath("(//div[@class='cscore_score '])[2]"));
		System.out.println("Australia score is : "+scoreAus.getText());
		System.out.println("India score is : "+scoreIndia.getText());
		
	}
}
