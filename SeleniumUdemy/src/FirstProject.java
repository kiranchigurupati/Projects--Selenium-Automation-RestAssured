import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FirstProject {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C://Users//853523//Downloads//edgedriver_win64 (1)//msedgedriver.exe/");
		//System.setProperty("webdriver.chrome.driver", "C://Users//853523//Downloads//chrome-win64 (1)//chrome-win64//chrome.exe/");
		//ChromeDriver driver = new ChromeDriver();//- only calls methods in Chrome
		//WebDriver driver= new ChromeDriver();
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/");
		driver.getTitle();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.quit();
	}

}
