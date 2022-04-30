package excelFileHandlingByApachePOI;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	private static WebDriver driver;

	@DataProvider(name = "Authentication")

	public static Object[][] credentials() {

		// The number of times data is repeated, test will be executed the same no. of
		// times

		// Here it will execute two times

		return new Object[][] { { "Admin", "admin123" }, { "Admin", "Test@123" } };

	}

	// Here we are calling the Data Provider object with its Name

	@Test(dataProvider = "Authentication", timeOut = 200000)

	public void test(String sUsername, String sPassword) {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/java/eclipse-workspace/javaProject/Drivers1/chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();


		// Argument passed will be used here as String Variable
		driver.findElement(By.name("txtUsername")).sendKeys(sUsername);
		driver.findElement(By.name("txtPassword")).sendKeys(sPassword);
		driver.findElement(By.id("btnLogin")).click();


		driver.quit();

	}
	@Test(dataProvider = "Authentication", timeOut = 200000)

	public void test2(String sUsername, String sPassword) {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/java/eclipse-workspace/javaProject/Drivers1/chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();


		// Argument passed will be used here as String Variable
		driver.findElement(By.name("txtUsername")).sendKeys(sUsername);
		driver.findElement(By.name("txtPassword")).sendKeys(sPassword);
		driver.findElement(By.id("btnLogin")).click();


		driver.quit();

	}

}
