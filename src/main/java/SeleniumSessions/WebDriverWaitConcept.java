package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitConcept {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/");
		
		WebDriverWait wait1 = new WebDriverWait(driver, 10);
//		wait1.until(ExpectedConditions.titleIs("HubSpot Login")); 
//		System.out.println(driver.getTitle());
		String str= waitForPageTitle("Login", 10);
		System.out.println(str);
		By email = By.id("username");
		By pwd = By.id("password");
		By login = By.id("loginBtn");
		By signUpLink= By.linkText("Sign up");
		By firstname= By.id("uid-firstName-5");
		waitForElementToBeLocated(email, 15).sendKeys("sowmya@gmail.com");;
		waitForElementToBeLocated(signUpLink, 10).click();
		waitForElementToBeLocated(firstname, 10).sendKeys("sowmya");
		
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		WebElement element_email = wait.until(ExpectedConditions.presenceOfElementLocated(email));;
//				element_email.sendKeys("sowmya@gmail.com");
//				driver.findElement(pwd).sendKeys("HelloHelloHello");
//				driver.findElement(login).click();
	}
	
	public static WebElement waitForElementToBeLocated(By locator, int timeout)
	{
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	public static String waitForPageTitle(String titleValue, int timeout)
	{
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.titleContains(titleValue));
		return driver.getTitle();
	}

}
