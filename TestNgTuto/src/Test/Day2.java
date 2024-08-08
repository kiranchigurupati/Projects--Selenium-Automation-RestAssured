package Test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day2{
	@Parameters({"URL"})
	@Test
	public void Personalloan(String urlname) 
	{
		System.out.println("Personal loan");
		System.out.println(urlname);
		
	}
	@BeforeTest
	public void BeforePersonalloan() 
	{
		System.out.println("I will execute first");
		
	}
	@AfterTest
	public void AfterPersonalloan() 
	{
		System.out.println("I will execute last");
		
	}
	
}

