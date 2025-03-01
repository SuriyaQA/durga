package SeleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program7 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("file:///C:/Users/Suriy/Downloads/iframe%20(1).html");
		
		//driver.switchTo().frame(0);
		
		//driver.switchTo().frame("FR1");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='FR1']")));
		
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("computer");
		
		driver.switchTo().parentFrame();
		
		driver.findElement(By.xpath("//a[text()='Google']")).click();
	}
}

