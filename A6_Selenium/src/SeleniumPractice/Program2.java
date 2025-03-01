package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/digital-downloads");
		
		List<WebElement> element = driver.findElements(By.xpath("//input[@value='Add to cart']"));

		
		System.out.println(element);
		
		for(WebElement e:element) {
		
			Thread.sleep(1000);
			e.click();
		}
	}
}
