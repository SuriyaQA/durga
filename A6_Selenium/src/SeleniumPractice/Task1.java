package SeleniumPractice;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1
{
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		String facebook = driver.getWindowHandle();
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.instagram.com/");
		String instagram = driver.getWindowHandle();
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.meesho.com/");
		String meesho = driver.getWindowHandle();
	    
		Set<String> alladress = driver.getWindowHandles();
	
	   System.out.println(alladress);
	
	   for(String s:alladress) {
		   System.out.println(s);
		   driver.switchTo().window(s);
		   
		   if(driver.getCurrentUrl().contains("https://www.facebook.com")) {
			   
			   driver.close();
		   }
	   }
		//driver.quit();
	}
}
