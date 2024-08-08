package Test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day4 {
	@Test(enabled=false)
	public void WebloginHome()
	{
		System.out.println("WebloginHome");// or we can write some selenium code here
	}
	
	@Test(groups= {"smoke"})
	public void MobileLoginHome()
	{
		System.out.println("MobileLoginHome");
	}
	@Parameters({"URL"})
	@Test
	public void APIHome(String urlname)
	{
		System.out.println("APIloginHome");
		System.out.println(urlname);
	}
	
	@Test(groups= {"smoke"})
	public void APIloginHome()
	{
		System.out.println("APIloginHome");
	}
}
