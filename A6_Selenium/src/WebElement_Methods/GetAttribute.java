package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		 WebElement element = driver.findElement(By.cssSelector("input[value='Search']"));
		String value =  element.getAttribute("fdprocessedid");
		System.out.println(value);
		driver.quit();
	}
}
