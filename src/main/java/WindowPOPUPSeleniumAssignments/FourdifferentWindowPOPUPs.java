package WindowPOPUPSeleniumAssignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FourdifferentWindowPOPUPs {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.popuptest.com/goodpopups.html");
		driver.findElement(By.linkText("Good PopUp #1")).click();
		driver.findElement(By.linkText("Good PopUp #2")).click();
		driver.findElement(By.linkText("Good PopUp #3")).click();
		driver.findElement(By.linkText("Good PopUp #4")).click();
		Set<String> windowhandles = driver.getWindowHandles();
		List<String> windowhandlesList = new ArrayList<String>(windowhandles);
		String parentWindow = windowhandlesList.get(0);
		String childwindow1 = windowhandlesList.get(1);
		String childwindow2 = windowhandlesList.get(2);
		String childwindow3 = windowhandlesList.get(3);
		String childwindow4 = windowhandlesList.get(4);
		
		driver.switchTo().window(childwindow1);
		System.out.println("childwindow1 Title "+driver.getTitle());
		driver.close();
		driver.switchTo().window(childwindow2);
		System.out.println("childwindow2 Title "+driver.getTitle());
		driver.close();
		driver.switchTo().window(childwindow3);
		System.out.println("childwindow3 Title " +driver.getTitle());
		driver.close();
		driver.switchTo().window(childwindow4);
		System.out.println("childwindow3 Title " +driver.getTitle());
		driver.close();
		driver.switchTo().window(parentWindow);
		System.out.println("Parent Title "+driver.getTitle());
		driver.quit();
	}

}
