package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptAlertPopupHandle {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("http://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(3000);
		Alert al=driver.switchTo().alert();
		String text=al.getText();
		System.out.println(text);
		if(text.equalsIgnoreCase("Please enter a valid user name"))
		{
			System.out.println("Hurry!!!!!!!!!!!!!!!!!!");
		}
		al.accept();
		
		driver.switchTo().defaultContent();
		
	}

}
 