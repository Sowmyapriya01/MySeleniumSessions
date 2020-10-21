package SeleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import SeleniumSessions.ElementUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SpiceJetElementUtil {

	static WebDriver driver;
	static Actions actions;
	
	public static void main(String args[]) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		ElementUtil ele=new ElementUtil(driver);
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		By Login = By.id("ctl00_HyperLinkLogin");
		ele.MoveToElement(Login, driver);
		By SpliceClubMembers = By.linkText("SpiceClub Members");
		ele.MoveToElement(SpliceClubMembers, driver);
		By MemberLogin =  By.linkText("Member Login");
		ele.moveToElementClick(MemberLogin, driver);

	}
}
