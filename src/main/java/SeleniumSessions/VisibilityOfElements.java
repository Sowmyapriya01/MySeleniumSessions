package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VisibilityOfElements {
	static WebDriver driver;
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		 driver.get("https://www.freshworks.com/");
		 By footerLinks = By.xpath("//ul[@class = 'footer-nav']//a");
//		 WebDriverWait wait=new WebDriverWait(driver, 15);
//		 List<WebElement> footerlinkList = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(footerLinks));
		 getPageLinkText(footerLinks, 25);
		 
//		 for(WebElement ele:footerlinkList)
//		 {
//			 System.out.println(ele.getText());
//		 }
//		
		
	}
	public static List<WebElement> VisibilityOfAllTheElements(By locator , int Timeout)
	{
		
		WebDriverWait wait = new WebDriverWait(driver, Timeout);
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
		
	}
	public static void getPageLinkText(By locator , int Timeout)
	{
		 List<WebElement> footerlinkList = VisibilityOfAllTheElements(locator, Timeout);
		 
		 for(WebElement ele:footerlinkList)
		 {
			 System.out.println(ele.getText());
		 }
		
	}

}
