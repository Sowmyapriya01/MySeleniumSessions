package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrangeCRM30 {

	public static void main(String[] args) throws InterruptedException {
		
		Browserutil br = new Browserutil();
		WebDriver driver = br.init_driver("Chrome");
		br.launchURL("https://www.orangehrm.com/");
		Thread.sleep(5000);
		
		System.out.println(br.getPageTitle());
		
		By free30daytrail_link = By.linkText("FREE 30 Day Trial");
		By userNameId = By.id("Form_submitForm_subdomain");
		By firstName = By.id("Form_submitForm_FirstName");
		By lastName= By.id("Form_submitForm_LastName");
		By email = By.id("Form_submitForm_Email");
		By jobTitle = By.id("Form_submitForm_JobTitle");
		By noofEmployees = By.id("Form_submitForm_NoOfEmployees");
//		By noofEmployees_Linktext = By.linkText("0 - 10");
		By noofEmployees_Linktext = By.xpath("//*[@id=\"Form_submitForm_NoOfEmployees\"]/option[3]");

		By companyName = By.id("Form_submitForm_CompanyName");
		By industry = By.id("Form_submitForm_Industry");
//		By industry_Linktext = By.linkText("Education");
		By industry_Linktext = By.xpath("//*[@id=\"Form_submitForm_Industry\"]/option[9]");

		By contact = By.id("Form_submitForm_Contact");
		By country = By.id("Form_submitForm_Country");
		By checkbox = By.id("Form_submitForm_SetDummyData");
		
		
		ElementUtil ele = new ElementUtil(driver);
		ele.doClick(free30daytrail_link);
		ele.doSendKeys(userNameId, "Sowmya");
		ele.doSendKeys(firstName, "Sowmya");
		ele.doSendKeys(lastName, "priya");
		ele.doSendKeys(email, "Sowmya@gmail.com");
		ele.doSendKeys(jobTitle, "Automation Arc");
		ele.doClick(noofEmployees);
		ele.doClick(noofEmployees_Linktext);
		ele.doSendKeys(companyName, "Google");
		ele.doClick(industry);
		ele.doClick(industry_Linktext);
		ele.doSendKeys(contact, "9000000000");
		ele.doSendKeys(country, "Aus");
		ele.doClick(checkbox);
		
		
	}

}
