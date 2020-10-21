 package SeleniumSessions; 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class waitForElementsToBeClickable {

	static WebDriver driver;
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/");
		WebDriverWait wait = new WebDriverWait(driver , 15);
		By signuplink = By.linkText("Sign up");
		ClickWhenReady(signuplink, 25);
		WebElement signupele = driver.findElement(signuplink);
		
//		wait.until(ExpectedConditions.elementToBeClickable(signuplink)).click(); 
			
		wait.until(ExpectedConditions.visibilityOf(signupele)); 
		
	}
	
	public static void ClickWhenReady(By locator, int Timeout)
	{
		 WebDriverWait wait = new WebDriverWait(driver, Timeout);
		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
		 element.click();
	}
	public static void waitForElementVisible(By locator, int Timeout)
	{
		WebElement ele = driver.findElement(locator);
		 WebDriverWait wait = new WebDriverWait(driver, Timeout);
		 WebElement element = wait.until(ExpectedConditions.visibilityOf(ele));
		 element.click();
	}

	
}
