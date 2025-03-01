package JavaScript_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program5 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
//		WebElement textField = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
//		WebElement searchButton = driver.findElement(By.xpath("//input[@type='submit']"));
//		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
//		js.executeScript("arguments[0].value='computer'", textField);
//		js.executeScript("arguments[0].click()",searchButton);
		
		
//		js.executeScript("document.getElementById('small-searchterms').value='computer'");
//		
//		js.executeScript("document.getElementsByClassName('button-1 search-box-button')[0].click()");
//		
		js.executeScript("alert('hi i am Shantakumar')");
	}
}
