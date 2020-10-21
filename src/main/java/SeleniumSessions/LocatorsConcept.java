package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsConcept {
 static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		//driver.get("https://app.hubspot.com/login");
//		driver.get("https://classic.freecrm.com/contact.html");
	driver.get("https://www.freshworks.com/");
		 Thread.sleep(5000);
		//driver.findElement(By.linkText("Home"));
		//class="form-control private-form__control login-password m-bottom-3"
		//driver.findElement(By.className("login-password")).sendKeys("Hello");;
		
		 System.out.println(driver.findElement(By.tagName("h1")).getText());
		 System.out.println(driver.findElement(By.tagName("a")).getText());
		//1.Create a webelement+Actions
//		driver.findElement(By.id("username")).sendKeys("Hi");;
//		driver.findElement(By.id("password")).sendKeys("Hello");; 
//		driver.findElement(By.id("loginBtn")).click();

		
		//2.Create a webelement store in webelement 
		//Perform action
		
//		WebElement uname = driver.findElement(By.id("username"));
//		WebElement pwd = driver.findElement(By.id("password"));
//		WebElement login= driver.findElement(By.id("loginBtn"));
//
//		uname.sendKeys("Hello");
//		pwd.sendKeys("Hi");
//		login.click();
		
		//3.Capture by locators
		//ceate a webelement
		//perform action
		
//		By unameby = By.id("username");
//		By pwdby = By.id("password");
//		By Loginby=By.id("loginBtn");
//		
//		WebElement unamefe = driver.findElement(unameby);
//		WebElement pwdfe = driver.findElement(pwdby);
//		WebElement loginfe = driver.findElement(Loginby);
//		
//		unamefe.sendKeys("Hi");
//		pwdfe.sendKeys("Hello");
//		loginfe.click();
//		
		//4. Capture By locators
		//create generic method return webelement(Out of main method creating method inside another method is not possiable )
		//call that method and perform action
		
//		By unameby = By.id("username");
//		By pwdby = By.id("password");
//		By Loginby=By.id("loginBtn");
//		
//		getElement(unameby).sendKeys("Hi");
//		getElement(pwdby).sendKeys("Hi");
//		getElement(Loginby).click();

		//5. capture By locators
		//Create generic method for webelement,create generic methods for actions
		//call directly actions it will internally create webelement
		By unameby = By.id("username");
		By pwdby = By.id("password");
		By Loginby=By.id("loginBtn");
		
//		doSendKeys(unameby, "Hi");
//		doSendKeys(pwdby, "Hello");
//		doClick(Loginby);
//		
		driver.quit();
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static void doSendKeys(By locator, String text)
	{
		getElement(locator).sendKeys(text);
	}
	public static void doClick(By locator) {
		getElement(locator).click();
	}

}
