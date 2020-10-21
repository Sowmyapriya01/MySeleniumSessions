package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertwithWait {

	static WebDriver driver;
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("JavaScript Alerts")).click();
		driver.findElement(By.xpath("//button[contains(text(), 'Click for JS Alert')]")).click();
		
		Alert alert = waitForAlertToBePresent(10);
 		System.out.println(alert.getText());
		alert.accept();
//		WebDriverWait wait= new WebDriverWait(driver, 10);
//		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
//		System.out.println(alert.getText());
//		alert.accept();
		driver.switchTo().defaultContent(); 

	}
	
	public static Alert waitForAlertToBePresent(int Timeout)
	{
		WebDriverWait wait= new WebDriverWait(driver, Timeout);
		return wait.until(ExpectedConditions.alertIsPresent());
		
	}

}
