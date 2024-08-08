package SeleniumProgram;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class MultipleLinks {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		System.setProperty("Webdiver.Edge.driver",
				"C://Users//853523//Downloads//edgedriver_win64 (1)//msedgedriver.exe/");
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		System.out.println(driver.findElements(By.tagName("a")).size());

		WebElement Footerdriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(Footerdriver.findElements(By.tagName("a")).size()); // Limiting web browser

		WebElement FirstFooter = driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(FirstFooter.findElements(By.tagName("a")).size());

		for (int i = 1; i < FirstFooter.findElements(By.tagName("a")).size(); i++) {
			String clicktabs = Keys.chord(Keys.CONTROL, Keys.ENTER);
			FirstFooter.findElements(By.tagName("a")).get(i).sendKeys(clicktabs);
			Thread.sleep(5000);
		}
		Set<String> abc = driver.getWindowHandles();
		Iterator<String> it = abc.iterator();

		while (it.hasNext()) // tells whether next index is present or not
		{
			driver.switchTo().window(it.next()); // next index
			System.out.println(driver.getTitle());

		}
	}
}
