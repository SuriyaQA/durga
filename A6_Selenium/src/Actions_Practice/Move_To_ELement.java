package Actions_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Move_To_ELement {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/dragDrop/dragToCorrect?sublist=2");
	//	WebElement button = driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions a = new Actions(driver);
	//	a.moveToElement(button).contextClick().perform();
		
//		a.contextClick(button).perform();
//
//		WebElement button1 = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
//		
//		a.doubleClick(button1).perform();
//		
//		driver.switchTo().alert().accept();
//		
		
		Thread.sleep(1000);
		WebElement mobile = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		
		WebElement Accesories = driver.findElement(By.xpath("//div[@class='drop-column  min-h-[200px] bg-slate-100']"));
		
	//	a.clickAndHold(mobile).release(Accesories).perform();
		
		a.dragAndDrop(mobile, Accesories).perform();
	}
}
