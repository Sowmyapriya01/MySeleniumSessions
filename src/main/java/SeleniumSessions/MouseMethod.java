package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseMethod {
	static WebDriver driver; 

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("http://mrbool.com/how-to-create-menu-with-submenu-using-css-html/26146");
		Thread.sleep(5000);
		WebElement content_parentmenu = driver.findElement(By.className("menulink"));
		Actions action = new Actions(driver);
		action.moveToElement(content_parentmenu).build().perform();
		
		driver.findElement(By.linkText("COURSES")).click();
	}

}
