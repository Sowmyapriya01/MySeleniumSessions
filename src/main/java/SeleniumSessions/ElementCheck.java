package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementCheck {
	 static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/");
		Thread.sleep(15000);
		
		By loginbtn = By.id("loginBtn");
		
		System.out.println(checkWebElementPresent(loginbtn));
		
//		List<WebElement> loginbtn=driver.findElements(By.id("loginBtn"));
//		System.out.println(loginbtn.size());
//		
//		if(loginbtn.size()>0)
//		{
//			System.out.println("Element present");
//		}
//		else
//		{
//			System.out.println("Element not present");
//
//		}
//			
	}
	
	public static List<WebElement> getElements(By locator)
	{
		return driver.findElements(locator);
	}
	
	public static boolean checkWebElementPresent(By locator)
	{
//		List<WebElement> webele = getElements(locator);
		List<WebElement> webele = driver.findElements(locator);
		int elecount = webele.size();
		if(elecount>0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
