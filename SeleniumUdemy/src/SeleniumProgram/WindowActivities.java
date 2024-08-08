package SeleniumProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WindowActivities {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		
//		SeleniumManager for selenium4 version -->Directly invokes the browser if we don't provide Chrome,edge paths
//		System.setProperty("Webdiver.Edge.driver", "C://Users//853523//Downloads//edgedriver_win64 (1)//msedgedriver.exe/");
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.navigate().to("https://rahulshettyacademy.com/");
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();

	}

}
