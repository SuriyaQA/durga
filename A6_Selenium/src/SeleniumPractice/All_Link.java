package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class All_Link {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		for(WebElement e:links) {
			Thread.sleep(1000);
		 System.out.println(e.getAttribute("href"));
		}
	}
}
