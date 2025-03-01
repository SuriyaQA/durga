package SeleniumPractice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Program6 {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='2']")).click();
		WebElement element = driver.findElement(By.xpath("//a[@class='nivo-imageLink'][2]"));
		File source = element.getScreenshotAs(OutputType.FILE);
		File desti = new File("C:\\Users\\Suriy\\eclipse-workspace\\A6_Selenium\\ErrorShot\\demo.png");
		Files.copy(source, desti);
		driver.quit();
	}
}
