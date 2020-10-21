package Rough;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookTest {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//*[@id=\'u_0_2\']")).click();
		By firstname= By.xpath("//input[@name= 'firstname']");
		//WebElement frameElement = driver.findElement(By.xpath("//iframe[@cd_frame_id_= 'bd187e85b26cccdc270ca816789d8be9']"));
		Thread.sleep(15000);
		WebElement frameElement = driver.findElement(By.xpath("//div[@class='_n8 _3qx _8idq _8esf _8f3m _8fgk uiLayer _3qw']/preceding-sibling::iframe" ));

//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.presenceOfElementLocated(firstname));
		driver.switchTo().frame(frameElement);
		Thread.sleep(15000);

		driver.findElement(firstname).sendKeys("Sowmya");
	}

}
