package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Point axis = driver.findElement(By.cssSelector("a[class='ico-register']")).getLocation();
		int xaxis  =  axis.getX();
		int yaxis = axis.getY();
		
		System.out.println(xaxis);
		System.out.println(yaxis);
		
		driver.quit();
	}
}
