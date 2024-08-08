package SeleniumProgram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Autosuggestion {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		System.setProperty("Webdiver.Edge.driver", "C://Users//853523//Downloads//edgedriver_win64 (1)//msedgedriver.exe/");
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("SOU");
		Thread.sleep(2000);
		List<WebElement> Elements= driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		for(WebElement element: Elements)
		{
			if(element.getText().equalsIgnoreCase("South Africa"))
			{
			element.click();
			break;
			}
		}
		
	}

}
