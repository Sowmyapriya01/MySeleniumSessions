package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClickAndSendKeys {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/");
		Thread.sleep(15000);
		By email = By.id("username");
		By pwd = By.id("password");
		By loginbtn = By.id("loginBtn");
//		WebElement email = driver.findElement(By.id("username"));
//		WebElement pwd = driver.findElement(By.id("password"));
//		WebElement loginbtn=driver.findElement(By.id("loginBtn"));
//		Actions action = new Actions(driver);
//		action.sendKeys(email, "sowmyapriya@gmail.com").perform();
//		action.sendKeys(pwd, "ariba").perform();
//		action.click(loginbtn).perform();
		doActionsSendkeys(email, "Sowmya@gmail.com");
		doActionsSendkeys(pwd, "Hfffffi");
		doActionsClick(loginbtn);
	}
	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	} 
	
	public static void doActionsSendkeys(By locator, String value)
	{
		WebElement ele = getElement(locator);
		Actions action = new Actions(driver);
		action.sendKeys(ele, value).perform();
		
		
	}
	public static void doActionsClick(By locator) {
		WebElement ele = getElement(locator);
		Actions action = new Actions(driver);
		action.click(ele).perform();
		
	}

}
