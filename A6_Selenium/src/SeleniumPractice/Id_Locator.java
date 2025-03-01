package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id_Locator {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
//		WebElement element = driver.findElement(By.id("small"));
//		element.sendKeys("JavaSelenium");
		
//		driver.findElement(By.id("small-searchterms")).sendKeys("computer");
//		
		WebElement element = driver.findElement(By.className("ui-autocomplete-input"));
		element.sendKeys("mobile");
//		
//		driver.findElement(By.id("email")).sendKeys("8928268541");
//		
//		driver.findElement(By.id("pass")).sendKeys("Mech@123");
//		
//		driver.findElement(By.name("login")).click();
	}
}
