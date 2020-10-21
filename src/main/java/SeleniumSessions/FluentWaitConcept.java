package SeleniumSessions;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitConcept {

	static WebDriver driver;
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		 driver = new ChromeDriver();
		driver.get("https://crmpro.com/index.html");
		By username = By.name("username");
		By password = By.name("password");
		By login = By.xpath("//input[@value='Login']");
		WebElement username_ele = waitForElementWithFluentWait(username, 10, 3);
		username_ele.sendKeys("batchautomation");
		driver.findElement(password).sendKeys("Test@12345");
		driver.findElement(login).click();
		
//		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
//								.withTimeout(Duration.ofSeconds(15))
//								.pollingEvery(Duration.ofSeconds(3))
//								.ignoring(NoSuchElementException.class);
//		WebElement username_ele = wait.until(ExpectedConditions.presenceOfElementLocated(username));
//		username_ele.sendKeys("batchautomation");
//		driver.findElement(password).sendKeys("Test@12345");
//		driver.findElement(login).click();
//	
	}
	
	public static WebElement waitForElementWithFluentWait(By locator , int Timeout, int polling)
	{
		Wait<WebDriver > wait = new FluentWait<WebDriver>(driver)
								.withTimeout(Duration.ofSeconds(Timeout))
								.pollingEvery(Duration.ofSeconds(polling))
								.ignoring(NoSuchElementException.class);
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
								
	}

}
