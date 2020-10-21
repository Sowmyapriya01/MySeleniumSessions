package SeleniumSessions;

import org.apache.hc.core5.annotation.Experimental;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class URLwithWait {

	static WebDriver driver;
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/");
		 WebDriverWait wait1 = new WebDriverWait(driver, 15);
		 wait1.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Sign up"))).click();
		 boolean b= waitForURL("signup", 10);
		 if(b)
		 {
			 System.out.println("Sign up page URL is correct"); 
		 }
		 else
		 {
			 System.out.println("Sign up page URL is incorrect");
		 }
//		 if(wait1.until(ExpectedConditions.urlContains("signup")))
//		 {
//			 System.out.println("Sign up page URL is correct");
//		 }
//		 else
//		 {
//			 System.out.println("Signup page URL is incorrect");
//		 }
	}
	public static boolean waitForURL(String url , int Timeout)
	{
		WebDriverWait wait = new WebDriverWait(driver, Timeout);
		return wait.until(ExpectedConditions.urlContains(url));
		
		
	}

}
