package ALertPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.tracing.Propagator;

public class Program2 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium08.blogspot.com/2019/07/alert-test.html");
		driver.findElement(By.xpath("//input[@id='simple']")).click();
		Thread.sleep(1000);
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		driver.findElement(By.xpath("//button[@id='confirm']")).click();
		Thread.sleep(1000);
		System.out.println(a.getText());
		a.dismiss();
		String conforText = driver.findElement(By.xpath("//div[@id='demo']")).getText();
//		if(conforText.contains("You Accepted Alert!")) {
//			System.out.println("User Accepted the conformation");
//		}else {
//			System.out.println("User dismissed the conformation");
//		}
		System.out.println(conforText);
		driver.findElement(By.xpath("//button[@id='prompt']")).click();
		Thread.sleep(1000);
		System.out.println(a.getText());
		a.sendKeys("EUGENE");
		a.accept();
		String promptText = driver.findElement(By.xpath("//div[@id='prompt_demo']")).getText();
		System.out.println(promptText);
	}
}
