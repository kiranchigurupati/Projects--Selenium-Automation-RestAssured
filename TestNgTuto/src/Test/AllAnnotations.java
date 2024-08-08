package Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllAnnotations {
	
	@AfterTest
	public void Demo1() 
	{
		System.out.println("Demo1");
		
	}
	@AfterClass
	public void Demo2() 
	{
		System.out.println("Demo2");
		
	}
	@AfterMethod
	public void Demo3() 
	{
		System.out.println("Demo3");
		
	}
	@AfterSuite
	public void Demo4() 
	{
		System.out.println("Demo4");
		
	}
	@Test
	public void Demo() 
	{
		System.out.println("Demo");
		
	}
	@BeforeTest
	public void Demo5() 
	{
		System.out.println("Demo5");
		
	}
	@BeforeClass
	public void Demo6() 
	{
		System.out.println("Demo6");
		
	}
	@BeforeMethod
	public void Demo7() 
	{
		System.out.println("Demo7");
		
	}
	@BeforeSuite
	public void Demo8() 
	{
		System.out.println("Demo8");
		
	}

}
