package MyTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest {

	
	@Test(priority = 1)
	public void googleTitleTest()
	{
		driver.get("https://www.google.com");

		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(driver.getTitle(), "Google1" ,"Title is not matched ......");
	}
	@Test(priority = 2)
	public void googleURLTest()
	{
		String url =  driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertTrue(url.contains("google"));
	}
	
	
}
