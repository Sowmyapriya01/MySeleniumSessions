package testNGSessions;

import org.testng.annotations.Test;

public class DependsOnMethod {

	@Test(priority = 1)
	public void login()
	{
		System.out.println("do login");
		int i =9/3;
	}
	@Test(priority = 2 , dependsOnMethods = "login")
	public void homeTest()
	{
		System.out.println("home Test");
	}
	@Test(priority = 3 , dependsOnMethods = "login")
	public void searchTest()
	{
		System.out.println("do Search Test");
	}
}
