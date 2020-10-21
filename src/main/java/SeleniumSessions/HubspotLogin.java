package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HubspotLogin {

	public static void main(String[] args) throws InterruptedException {

		Browserutil br = new Browserutil();
		WebDriver driver=br.init_driver("Chrome");
		br.launchURL("https://app.hubspot.com/login");
		
		Thread.sleep(5000);
		System.out.println(br.getPageTitle());
		
		By unameby = By.id("username");
		By pwdby = By.id("password");
		By Loginby=By.id("loginBtn");
		
		ElementUtil ele =new ElementUtil(driver);
		ele.doSendKeys(unameby, "Hi");
		ele.doSendKeys(pwdby, "Hello");
		ele.doClick(Loginby);
		
		System.out.println("Logged in");
		br.QuitBrowser();
		
	}

}
