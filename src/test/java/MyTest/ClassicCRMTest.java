package MyTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ClassicCRMTest extends BaseTest{
	
	@Test(priority = 1)
	public void classicCRMTitleTest()
	{
		driver.get("https://classic.crmpro.com/index.html?e=1");
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "CRMPRO - CRM software for customer relationship management, sales, and support.");
	}
	@Test(priority = 2)
	public void classicCRMURLTest()
	{
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertTrue(url.contains("crmpro"));
	}
	
}
