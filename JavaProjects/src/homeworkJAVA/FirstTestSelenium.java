package homeworkJAVA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestSelenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\MavenSelenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.close();
		System.out.println("TEST PASS");
	}

}
