package SeleniumSessions;

import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriverbasics {
	
	public static void main(String args[])
	{
		//from line 12 to 17 we are doing automation
		//different between automation & automation testing 
		//when u include automation with validation part then its automation testing
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\c5292996\\Desktop\\Java\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.google.com");
		String title=driver.getTitle();
		System.out.println("Title is "+title);
		if(title.equals("Google"))
		{
			System.out.println("correct title");
		}
		else
		{
			System.out.println("Incorrect title");
		}
		String currentURL=driver.getCurrentUrl();
		System.out.println(currentURL);
		
		if(currentURL.contains("www.google.com"))
		{
			System.out.println("correct URL");
		}
		else
		{
			System.out.println("Incorrect URL");
		}
		//System.out.println(driver.getPageSource());
		driver.quit();
		System.out.println("Browser closed");
	}
 
}
