package JavaScript_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
//		js.executeScript("window.scrollBy(0,1000);");
//		
//		Thread.sleep(1000);
//		js.executeScript("window.scrollBy(0,-1000);");
//		
		js.executeScript("arguments[0].scrollIntoView(false)",driver.findElement(By.xpath("//input[@value='Add to cart']")));
		
	}
}
