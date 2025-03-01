package SeleniumPractice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class program1 {

	public static void main(String[] args) throws IOException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
	//	TakesScreenshot ts = (TakesScreenshot) driver;
	//	File source = ts.getScreenshotAs(OutputType.FILE);
		
		File source = driver.getScreenshotAs(OutputType.FILE);
		File desti = new File("C:\\Users\\Suriy\\eclipse-workspace\\A6_Selenium\\ErrorShot\\image.png");
		
		Files.copy(source, desti);
		
		driver.quit();
	}
}
