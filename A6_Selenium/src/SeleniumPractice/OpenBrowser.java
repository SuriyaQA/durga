package SeleniumPractice;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class OpenBrowser {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.instagram.com/");
		
		String adress = driver.getWindowHandle();

		System.out.println(adress);
	}
}
