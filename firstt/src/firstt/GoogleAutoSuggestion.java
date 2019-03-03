package firstt;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleAutoSuggestion {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./SeleniumServer/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://google.com");
		driver.switchTo().activeElement().sendKeys("Selenium");
		List<WebElement> allSuggestions = driver.findElements(By.xpath("//*[text()='selenium']"));
		System.out.println("The number of suggestions are : "+allSuggestions.size());
		for (WebElement single : allSuggestions) {
			System.out.println("The suggestions are : "+single.getText());
		}
		allSuggestions.get(2).click();
		driver.navigate().back();
		driver.switchTo().activeElement().sendKeys("Selenium");
		Thread.sleep(3000);
		System.out.println("-------------------------------------------------");
		List<WebElement> suggestions = driver.findElements(By.xpath("//*[text()='selenium']"));
		for (int i = suggestions.size()-1; i >= 0 ; i--) {
			System.out.println("The suggestions in reverse are : "+suggestions.get(i).getText());
		}
	}
}
