package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Dimension size = driver.findElement(By.cssSelector("input[id='small-searchterms']")).getSize();
		int height = size.getHeight();
		int width = size.getWidth();
		System.out.println("HEIGHT :"+height);
		System.out.println("WIDTH  :"+width);
		driver.quit();
		
	}
}
