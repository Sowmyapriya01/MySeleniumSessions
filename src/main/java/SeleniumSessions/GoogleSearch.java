package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
//		driver.findElement(By.name("q")).sendKeys("Selenium");
		driver.findElement(By.name("q")).sendKeys("naveen automation labs");
		
		Thread.sleep(3000);

		By searchlist=By.xpath("//ul[@class='erkvQe']//span");
			googlesearchselect(searchlist, "naveen automation labs cucumber");
		
//		List<WebElement> SuggessionsList=driver.findElements(By.xpath("//ul[@class='erkvQe']//span"));
//		
//		System.out.println(SuggessionsList.size());
//		
//		for(WebElement ele: SuggessionsList)
//		{
//			String text=ele.getText();
////			if(text.equals("selenium webdriver"))
//			if(text.equals("naveen automation labs cucumber"))
//				{
//					ele.click();
//					break;
//				}
//		}
//
}
	
	public static void googlesearchselect(By locator, String value)
	{
		List<WebElement> SuggessionsList=driver.findElements(locator);
		
		for(WebElement ele: SuggessionsList)
		{
			String text=ele.getText();
			if(text.equals(value))
			{
				ele.click();
				break;
			}
		}
		
	}
}
