package NewRepository;

import org.openqa.selenium.By;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ScreenshotTest extends BaseClass11 {


	@Test
	public void testLogin5() {
		setup2();
		driver.findElement(By.id("email1")).sendKeys("abcd");
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
