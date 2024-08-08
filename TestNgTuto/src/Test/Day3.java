package Test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {
	
	@Test(timeOut=4000)
	public void WebloginCar()
	{
		System.out.println("WebloginCar");// or we can write some selenium code here
	}
	@Parameters({"URL"})
	@Test
	public void MobileLoginCar(String urlname)
	{
		System.out.println("MobileLoginCar");
		System.out.println(urlname);
	}
	@Test(groups= {"smoke"})
	public void MobilesigninCar()
	{
		System.out.println("MobilesigninCar");
	}
	@BeforeSuite
	public void BeforeFsuite()
	{
		System.out.println("BeforeFsuite");
	}
	
	@Test(dataProvider="getData")
	public void MobilesignoutCar(String username, String password)
	{
		System.out.println("MobilesignoutCar");
		System.out.println(username);
		System.out.println(password);
	}
	
	
	@Test(dependsOnMethods= {"WebloginCar","MobilesignoutCar"})
	public void APIlogincar()
	{
		System.out.println("APIlogincar");
	}
	
	@DataProvider
	public Object[][] getData()
	{
		//1st combiantion - username password - good credit history= row
		//2nd - username password  - no crdit history
		// 3rd - fraudelent credit history
		Object[][] data= new Object[3][2];
		//1st set 
		data[0][0]="firstsetusername";
		data[0][1]="firstpassword";
		//couloumns in the row are nothing but values for that particualar combination(row)
		
		//2nd set
		data[1][0]= "secondsetusername";
		data[1][1]= "secondpassword";
		
		//3rd set
		data[2][0]="thirdsetusername";
		data[2][1]="thirdpassword";
		return data;
		
	}
}
