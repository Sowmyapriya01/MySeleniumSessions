package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerConcept {
	static WebDriver driver;


	public static void main(String args[])
	{
		String browser = "FireFox";
		//WebDriver driver = null;
		if (browser.equals("Chrome")) {
//			System.setProperty("webdriver.chrome.driver","C:\\Users\\c5292996\\Desktop\\Java\\chromedriver_win32\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();			
			driver = new ChromeDriver();
		} else if (browser.equals("FireFox")) {
//			System.setProperty("webdriver.gecko.driver","C:\\Users\\c5292996\\Desktop\\Java\\geckodriver-v0.27.0-win64\\geckodriver.exe");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else {
			System.out.println("Enter correct browser "+browser);
		}
		driver.get("https://www.google.com");
		String title = driver.getTitle();
		System.out.println("Title is " + title);
		if (title.equals("Google")) {
			System.out.println("correct title");
		} else {
			System.out.println("Incorrect title");
		}
		String currentURL = driver.getCurrentUrl();
		System.out.println(currentURL);

		if (currentURL.contains("www.google.com")) {
			System.out.println("correct URL");
		} else {
			System.out.println("Incorrect URL");
		}
		// System.out.println(driver.getPageSource());
		driver.quit();
		System.out.println("Browser closed");

	}
}
