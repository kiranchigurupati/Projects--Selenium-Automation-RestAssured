package SeleniumProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsProg {

	public static void main(String[] args) {
//		System.setProperty("Webdiver.Edge.driver", "C://Users//853523//Downloads//edgedriver_win64 (1)//msedgedriver.exe/");
		System.setProperty("Webdiver.Chrome.driver", "C://Users//853523//Downloads//chrome-win64 (3)//chrome-win64.exe/");
		WebDriver driver = new EdgeDriver();
//		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		Actions actions = new Actions(driver);
		WebElement Move= driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
		actions.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("laptop").build().perform();
		
//		Move to Specific element
		actions.moveToElement(Move).contextClick().build().perform();
		
		

	}

}
