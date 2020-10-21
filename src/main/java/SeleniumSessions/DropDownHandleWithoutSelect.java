package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandleWithoutSelect {
	
	static WebDriver driver;
	public static void main(String []args)
	{
	
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
			
		By industry = By.id("Form_submitForm_Industry");
		By Country = By.id("Form_submitForm_Country");	
		By industry_Options1=By.xpath("//select[@id='Form_submitForm_Industry']/option");
		
		SelectDropDownValueWithoutSelect(industry_Options1, "Electronics");
//		List<WebElement> industry_Options = driver.findElements(By.xpath("//select[@id='Form_submitForm_Industry']/option"));
//		for(WebElement ele: industry_Options)
//		{
//			String text=ele.getText();
//			System.out.println(text);
//		}
//		
		
	}
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	public static void SelectDropDownValueWithoutSelect(By locator, String Value)
	{
		List<WebElement> industry_Options = driver.findElements(locator);
		for(WebElement ele: industry_Options)
		{
			String text = ele.getText();
			if(text.equals(Value)) {
				ele.click();
				break;
			}
		}
	
	}
}
