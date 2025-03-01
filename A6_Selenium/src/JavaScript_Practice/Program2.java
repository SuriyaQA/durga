package JavaScript_Practice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program2 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapp.skillrary.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://demowebshop.tricentis.com/");
		Set<String> adress = driver.getWindowHandles();
		for(String s : adress) {
			driver.switchTo().window(s);
			if(driver.getCurrentUrl().contains("https://demoapp.skillrary.com/")) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("document.getElementsByClassName('form-control')[1].value='selenium'");
		
			}else {
				driver.close();
			}
		}
	}
}
