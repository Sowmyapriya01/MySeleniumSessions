package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browserutil {
	WebDriver driver = null; // no need of static as we are gng to use in non static method

	/**
	 * This method is used to initilize webdriver to launch browser
	 * 
	 * @param browser
	 * @return this returns driver
	 */
	public WebDriver init_driver(String browser) {
		
		if (browser.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		
		else if (browser.equals("Firefox")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		
		else if (browser.equals("Opera")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		
		else {
			System.out.println("Please pass correct browser " + browser);
		}
		
		return driver;
	}

	/**
	 * 
	 * @param URL
	 */
	public void launchURL(String URL) {
		driver.get(URL);

	}

	/**
	 * This is used to get title of page
	 * 
	 * @return
	 */
	public String getPageTitle() {

		return driver.getTitle();
	}

	/**
	 * To get current page URL
	 * 
	 * @return
	 */
	public String getcurrentpageURL() {
		return driver.getCurrentUrl();
	}

	/**
	 * To close Browser
	 */
	public void closeBrowser() {
		driver.close();
	}

	/**
	 * To QuitBrowser	
	 */
	public void QuitBrowser() {
		driver.quit();
	}
}
