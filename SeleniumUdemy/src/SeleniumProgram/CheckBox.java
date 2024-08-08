package SeleniumProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class CheckBox {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		System.setProperty("Webdiver.Edge.driver", "C://Users//853523//Downloads//edgedriver_win64 (1)//msedgedriver.exe/");
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='chk_IndArm']")).isSelected());
		System.out.println(driver.findElement(By.cssSelector("input[id*='chk_IndArm']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='chk_IndArm']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='chk_IndArm']")).isSelected());
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='chk_IndArm']")).isSelected());
//		count the number of checkboxes
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
		{
			System.out.println("Enabled");
			Assert.assertTrue(true);
			
		}
		else
		{
			Assert.assertTrue(false);
		}
		
	}

}
