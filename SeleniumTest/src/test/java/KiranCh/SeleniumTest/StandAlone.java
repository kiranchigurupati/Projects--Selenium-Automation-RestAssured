package KiranCh.SeleniumTest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StandAlone {

	public static void main(String[] args) {
//		WebDriverManager.edgedriver().setup();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		// WebDriver driver = new EdgeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/client");
		driver.findElement(By.id("userEmail")).sendKeys("SamChandlerCk@gmail.com");
		driver.findElement(By.id("userPassword")).sendKeys("Test@1234");
		driver.findElement(By.id("login")).click();
		List<WebElement> products = driver.findElements(By.cssSelector(".mb-3"));
//		Using Streams concept
		WebElement Prod = products.stream()
				.filter(product -> product.findElement(By.cssSelector("b")).getText().equals("IPHONE 13 PRO"))
				.findFirst().orElse(null);

	}

}
