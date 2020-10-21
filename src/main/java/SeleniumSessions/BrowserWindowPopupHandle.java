package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowPopupHandle {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.popuptest.com/goodpopups.html");
		driver.findElement(By.linkText("Good PopUp #3")).click();
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it= handles.iterator();
		String parentwindow = it.next();
		System.out.println("Parent window" +parentwindow);
		String childWindowId = it.next();
		System.out.println("Child window" +childWindowId);
		driver.switchTo().window(childWindowId);
		System.out.println("Child window title" + driver.getTitle());
		driver.close();
		driver.switchTo().window(parentwindow);
		System.out.println(driver.getTitle());
		driver.quit(); 
		
	}

}
