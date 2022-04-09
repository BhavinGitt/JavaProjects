package NewRepository;

import java.io.File;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;

@Listeners(followMethods.ListenerClass11.class)
public class BaseClass11 {
	public static WebDriver driver;

	public void setup2() {
		System.setProperty("webdriver.chrome.driver", "D:\\MavenSelenium\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

	}

	public void getscreenshot(String Filename) {
		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File srcFile = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(srcFile,
					new File("C:\\Users\\java\\eclipse-workspace\\TestingDemostration1\\screenshot1\\screen.png"));
			System.out.println("Screen shot taken");
		} catch (Exception e) {
			e.getMessage();
		}

	}

}
