package SeleniumProgram;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WindowHandles {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		System.setProperty("Webdiver.Edge.driver",
				"C://Users//853523//Downloads//edgedriver_win64 (1)//msedgedriver.exe/");
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector(".blinkingText")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentid = it.next();
		String Childid = it.next();
		driver.switchTo().window(Childid);
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		String Emailid = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim()
				.split(" ")[0];
		driver.switchTo().window(parentid);

		driver.findElement(By.id("username")).sendKeys(Emailid);

	}

}
