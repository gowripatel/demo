package firstt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAll {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./SeleniumServer/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http//bookmyshow.com");
		System.out.println("The number of images present are : "+driver.findElements(By.tagName("img")).size());
		System.out.println("The number of links present are : "+driver.findElements(By.tagName("a")).size());
		System.out.println("The number of buttons present are : "+driver.findElements(By.xpath("//input[@type='submit']")).size());
		System.out.println("The number of radio buttons present are : "+driver.findElements(By.xpath("//input[@type='radio']")).size());
		System.out.println("The number of text boxes present are : "+driver.findElements(By.xpath("//input[@type='text']")).size());
		
	}
}
