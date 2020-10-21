package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownOptions {
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		
		By industry = By.id("Form_submitForm_Industry");
		By Country = By.id("Form_submitForm_Country");
		
//		List<String> industry_List=getAllDropDownOptionsList(industry);
//		System.out.println(industry_List.size());
//		System.out.println(industry_List);
//		
//		List<String> country_List = getAllDropDownOptionsList(Country);
//		System.out.println(country_List.size());
//		System.out.println(country_List);
		selectvaluefromdropdown(Country, "India");
		selectvaluefromdropdown(industry , "Automotive");
		//----------------------------------Rough work--------------------------------------//
//		WebElement industry = driver.findElement(By.id("Form_submitForm_Industry"));
//		WebElement Country = driver.findElement(By.id("Form_submitForm_Country"));
		
//		Select industry_select=new Select(industry);
//		List<WebElement> industry_Options_List=industry_select.getOptions();
	//	System.out.println(industry_Options_List.size());
		
//		for(WebElement ele: industry_Options_List)
//		{
//			String text=ele.getText();
//			System.out.println(text);
//		}
//		for(int i=0;i<industry_Options_List.size();i++)
//		{
//			String text=industry_Options_List.get(i).getText();
//			System.out.println(text);
//			if(text.equals("Automotive")) {
//				industry_Options_List.get(i).click();
//				break;
//			}
//		}
		 
		}
		public static WebElement getElement(By locator)
		{
			return driver.findElement(locator);
		}
		public static List<String> getAllDropDownOptionsList(By locator)
		{	
			WebElement element=getElement(locator);
			List<String> optionsValueList= new ArrayList<String>();
			Select select=new Select(element);
			List<WebElement> optionsList=select.getOptions();
			
			for(int i=0;i<optionsList.size();i++)
			{
				String text=optionsList.get(i).getText();
				optionsValueList.add(text);
			}
			return optionsValueList;
		}
		public static void selectvaluefromdropdown(By locator , String text)
		{
			WebElement element=getElement(locator);
			Select select=new Select(element);
			List<WebElement> OptionsList=select.getOptions();
			for(int i=0;i<OptionsList.size();i++)
			{
				String text1=OptionsList.get(i).getText();
				if(text1.equals(text)) {
					OptionsList.get(i).click();
					break;
				}
			}
		}
}