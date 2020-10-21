package testNGSessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNGFeatures {

	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("before suite -- Create User");
	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println(" -- Create user data");
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("before Class -- DB connection");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("before Method -- Login to app" );
	}
	@Test
	public void Userdatatest()
	{
		System.out.println("Userdatatest Test -- Test");
	}
	@Test
	public void userprofiletest()
	{
		System.out.println("userprofiletest Test --Test");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("after Method -- Logout from app");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("after Class -- Close DB connection");
	}
	@AfterTest
	public void afterTest()
	{
		System.out.println("after Test -- Delete user info");
	}
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("after Suite --Delete user");
	}
}
