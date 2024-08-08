package Test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day1 {
	
	@Test(groups= {"smoke"})
	public void Demo() 
	{
		System.out.println("Hello hi and bye");
		
	}
	public void Demo1() 
	{
		System.out.println("Hello");
		//Assert.assertTrue(false);
		
	}
	@AfterSuite
	public void Aftersuite()
	{
		System.out.println("Aftersuite");
	}
	@Parameters({"URL"})
	@Test
	public void Demo1(String urlname) 
	{
		System.out.println("hi and bye");
		System.out.println(urlname);
		
	}


}
