package ALertPractice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://selenium08.blogspot.com/2019/07/alert-test.html");
		driver.findElement(By.xpath("//input[@id='simple']")).click();
		Thread.sleep(1000);
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
		driver.findElement(By.xpath("//button[@id='confirm']")).click();
		Thread.sleep(1000);
		Alert alt1 = driver.switchTo().alert();
		System.out.println(alt1.getText());
		alt1.dismiss();
		driver.findElement(By.xpath("//button[@id='prompt']")).click();
		Thread.sleep(1000);
		Alert alt2 = driver.switchTo().alert();
		System.out.println(alt2.getText());
		alt2.sendKeys("Shantakumar");
		alt2.accept();
		System.out.println(driver.findElement(By.xpath("//div[@id='prompt_demo']")).getText());
		
		
	}
}
