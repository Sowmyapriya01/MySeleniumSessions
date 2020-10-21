package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FreshWorksTest {

	public static void main(String[] args) {

		Browserutil br =new Browserutil();
		
		WebDriver driver = br.init_driver("Chrome");
		br.launchURL("https://www.freshworks.com/");
		System.out.println(br.getPageTitle());
		By header_h1 = By.tagName("h1");
		By platform_Link = By.linkText("Platform");
		By getStarted_Button = By.xpath("/html/body/section[1]/div/div/div[1]/div/div");
		By header_h2 = By.tagName("h2");
		By contactUs_Linktext = By.linkText("Contact us");
		
		ElementUtil ele = new ElementUtil(driver);
		
		String headerText = ele.doGettext(header_h1);
		System.out.println(headerText);
		System.out.println(ele.doGettext(platform_Link));
		System.out.println(ele.doGettext(getStarted_Button));
		System.out.println(ele.doGettext(header_h2));
		ele.doClick(contactUs_Linktext);
		
		System.out.println(br.getPageTitle());
		
		br.QuitBrowser();
	}

}
