package AssignMarch6th;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class UrbanLadder {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		//************************** To handle the Notification *****************************************

		ChromeOptions PopupHandle = new ChromeOptions();
		PopupHandle.addArguments("--disable-notifications");

		//******************** To Open Browser ***********************************************************		

		driver.get("https://www.urbanladder.com/");

		//Thread.sleep(5000);

		//********************* To close the popup window *************************************************

		driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();

		//********************** To print main menu and under that sub menu ************************************

		List<WebElement> alllList = driver.findElements(By.xpath("//div[@id='topnav_wrapper']/descendant::span[@class='topnav_itemname']"));

		Thread.sleep(1000);

		int Count = alllList.size();

		System.out.println("To count mainmenus header text" +Count);

		System.out.println("************************* Printing the Main Menu Text ************************************");		

		for(int i=0;i<Count;i++)
		{
			String Text1 = alllList.get(i).getText();
			System.out.println(Text1);
			
			Actions act = new Actions(driver);
			act.moveToElement(alllList.get(i)).perform();

			System.out.println("************** Now print all the menu *********************");

			List<WebElement> allSublist = driver.findElements(By.xpath("//div[@id='topnav_wrapper']/descendant::span[contains(@class,'topnav_itemname') and contains(.,'"+Text1+"')]/following-sibling::div/descendant::div[@class='taxontype']/a"));
			//Thread.sleep(1000);

			int count1 = allSublist.size();
			for(int k=0;k<count1;k++)
			{
				String Text2 = allSublist.get(k).getText();
				System.out.println(Text2);

				List<WebElement> subMenu = driver.findElements(By.xpath("//div[@id='topnav_wrapper']/descendant::span[contains(@class,'topnav_itemname') and contains(.,'"+Text1+"')]/following-sibling::div/descendant::div[@class='taxontype']/a[.='"+Text2+"']/parent::div/following-sibling::ul/descendant::a"));
				Thread.sleep(1000);

				int count2 = subMenu.size();
				
				for(int j= 0; j<count2; j++)
				{
					String Text3 = subMenu.get(j).getText();
					System.out.println(Text3);
				}


			}
		}

		driver.close();

	}

}


