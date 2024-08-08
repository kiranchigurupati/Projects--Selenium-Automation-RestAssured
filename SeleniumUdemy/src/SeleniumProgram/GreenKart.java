package SeleniumProgram;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class GreenKart {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		System.setProperty("Webdiver.Edge.driver", "C://Users//853523//Downloads//edgedriver_win64 (1)//msedgedriver.exe/");
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise");
		
		int j=0;
		
		String[] itemsNeeded= {"Brocolli","Cauliflower","Beetroot","Mushroom"};
		
		Thread.sleep(2000);
		List<WebElement> products =driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i=0;i<products.size();i++)
		{
//			Storing a variable
		String[] name =products.get(i).getText().split("-");
		String formattedname =name[0].trim();
		
		//check whether name you extracted is present in the array list or not
		//Convert array into arraylist for easy search	
		List itemsNeededList = Arrays.asList(itemsNeeded);
		
		
		if(itemsNeededList.contains(formattedname))
//		if(name.contains("Beetroot"))
		{
			j++;
			// clicking on add to cart //break if element found if not remove break for multiple items
//			driver.findElements(By.xpath("//button[text()=\"ADD TO CART\"]")).get(i).click();
			driver.findElements(By.xpath("//div[@class=\"product-action\"]/button")).get(i).click();

//			break;
//			if(j==3) to get size of an array we use length
			if(j==itemsNeeded.length)

			{
				break;
			}
		}
		
		
		}

	
		
}
}