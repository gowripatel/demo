package firstt;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FirstCry2 {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./SeleniumServer/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Actions act = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.firstcry.com");
		driver.findElement(By.xpath("//div[@class='_pop_close _pop_reg_bg']")).click();
		List<WebElement> categoriesHead = driver.findElements(By.xpath("//div[@class='menu-container media-pros']//ul//li"));
		List<WebElement> boldOnes = driver.findElements(By.xpath("(//div[contains(@class,'option-container submenu1')]/ul/li/a[@title][@class='bold spacedown'])[2]"));
		for (int i = 0; i < categoriesHead.size(); i++) {
			for (int j = 0; j < args.length; j++) {
				
			}
			
		}
	}
}
