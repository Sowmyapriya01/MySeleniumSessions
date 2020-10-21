package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JsTest {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
//		driver.get("https://www.freshworks.com/");
		driver.get("https://app.hubspot.com/");
//		driver.get("https://www.amazon.in/");
		 Thread.sleep(10000);
		JavaScriptUtil jsutil = new JavaScriptUtil(driver);
		
		String title = jsutil.getTitleByJS();
		System.out.println(title);
		
//		WebElement element = driver.findElement(By.xpath("//h2[text()='Chocolates, sweets & more']"));
		WebElement element = driver.findElement(By.id("hs-login"));
//		jsutil.scrollIntoView(element);
//		jsutil.drawBorder(element);
		jsutil.flash(element);
//		jsutil.sendKeysUsingJavascript("username" , "sowmya@gmail.com");
	
//		jsutil.scrollPageDown(); 
//		Thread.sleep(1000);
//		jsutil.scrollPageUp();
//		jsutil.scrollPageDown("200");
//		jsutil.refreshBowserByJavaScript();
//		jsutil.generatealert("Hi my name is alert");
		
//		String innertext = jsutil.getPageInnerText();
//		if(innertext.contains("Images"))
//		{
//			System.out.println("Images found");
//		}
//		else
//		{
//			System.out.println("Images not found");
//		}
//		jsutil.clickElementByJS(driver.findElement(By.linkText("Platform")));
	}

}
