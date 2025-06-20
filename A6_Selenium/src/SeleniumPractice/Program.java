package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.instagram.com/");
		
		Thread.sleep(2000);
		
		driver.navigate().back();//facebook
		
		Thread.sleep(2000);
		
		driver.navigate().forward();//instagram
		Thread.sleep(2000);
		
		driver.navigate().refresh();
	}
}
