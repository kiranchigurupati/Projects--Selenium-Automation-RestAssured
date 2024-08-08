package SeleniumProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

import org.openqa.selenium.By;

public final class Selenium4 {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		System.setProperty("Webdiver.Edge.driver",
				"C://Users//853523//Downloads//edgedriver_win64 (1)//msedgedriver.exe/");
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		WebElement nameEditBox =driver.findElement(By.cssSelector("[name='name']"));



		System.out.println(driver.findElement(with(By.tagName("label")).above(nameEditBox)).getText());

	}

}
