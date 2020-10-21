package SeleniumAssignments;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SipceJetMenuSubmenu {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//WebElement Login = driver.findElement(By.id("ctl00_HyperLinkLogin"));
		By Login = By.id("ctl00_HyperLinkLogin");
		MoveToElement(Login, driver);
		By SpliceClubMembers = By.linkText("SpiceClub Members");
		MoveToElement(SpliceClubMembers, driver);
		By MemberLogin =  By.linkText("Member Login");
//		MoveToElement(MemberLogin, driver).click().build().perform();;
		moveToElementClick(MemberLogin, driver);
//		Actions actions = new Actions(driver);
//		actions.moveToElement(Login).perform();
		//WebElement SpliceClubMembers = driver.findElement(By.linkText("SpiceClub Members"));
//		actions.moveToElement(SpliceClubMembers).perform();

		//WebElement MemberLogin = driver.findElement(By.linkText("Member Login"));
//		actions.moveToElement(MemberLogin).click().build().perform();
	}

	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	public static Actions MoveToElement(By locator, WebDriver driver)
	{
		Actions actions = new Actions(driver);
		WebElement weblocator = getElement(locator);
		actions.moveToElement(weblocator).perform();
		return actions;
		
	}
	public static void moveToElementClick(By locator, WebDriver driver)
	{
		MoveToElement(locator, driver).click().perform();
	}

}
