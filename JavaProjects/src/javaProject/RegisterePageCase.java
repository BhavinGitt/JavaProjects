package javaProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterePageCase {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\java\\eclipse-workspace\\javaProject\\Drivers1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://automationpractice.com/index.php");
		driver.manage().window().maximize();

		driver.findElement(By.linkText("Sign in")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@name='email_create']")).sendKeys("bha44vi1n1@gmail.com");
		// driver.findElement(By.linkText("Create an account")).click();
		driver.findElement(By.xpath("//button[@name=\"SubmitCreate\"]")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@id=\"id_gender1\"]")).click();
		driver.findElement(By.id("customer_firstname")).sendKeys("aman");

		driver.findElement(By.id("customer_lastname")).sendKeys("gupta");
		driver.findElement(By.id("email")).clear();

		driver.findElement(By.id("email")).sendKeys("bha44vi1n1@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("dhvbjdfjn@sdkv");

		WebElement date = driver.findElement(By.id("days"));
		Select d1 = new Select(date);
		d1.selectByValue("4");

		WebElement month = driver.findElement(By.id("months"));
		Select m1 = new Select(month);
		m1.selectByIndex(5);

		WebElement year = driver.findElement(By.id("years"));
		Select y1 = new Select(year);
		y1.selectByIndex(5);

		driver.findElement(By.name("address1")).sendKeys("Test 81/1,2nd cross");
		// driver.findElement(By.id("address1")).sendKeys("Test 81/1,2nd cross");
		driver.findElement(By.id("city")).sendKeys("dhbdjdjcjnakm");

		driver.findElement(By.name("postcode")).sendKeys("55677");
		WebElement state = driver.findElement(By.name("id_state"));
		Select ss = new Select(state);
		ss.selectByValue("44");

		driver.findElement(By.id("phone_mobile")).sendKeys("4651651622");
		driver.findElement(By.xpath("//input[@name=\"alias\"]")).clear();
		driver.findElement(By.xpath("//input[@name=\"alias\"]")).sendKeys("work");
		//driver.findElement(By.name("submitAccount")).click();
		
		driver.findElement(By.xpath("//*[@id=\"submitAccount\"]/span")).click();
		String elementName = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span"))
				.getText();

		System.out.println(elementName);
		if (elementName.contains("aman gupta")) {
			System.out.println("User Verified,Test case Passed");
		} else {
			System.out.println("User Verification Failed,Test case Failed");
		}
		

		driver.close();
		driver.quit();

	}

}
