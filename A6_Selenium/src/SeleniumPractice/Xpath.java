package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		//driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("computer");
		
		
		driver.findElement(By.xpath("//a[text()='Register']")).click();
	}
}
