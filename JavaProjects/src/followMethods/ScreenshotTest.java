package followMethods;

import org.openqa.selenium.By;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class ScreenshotTest extends BaseClass11 {

	@Test
	public void testLogin5() {
		setup2();
		driver.findElement(By.id("email1")).sendKeys("abcd");
	}

	@Test
	public void testLogin6() {
		setup2();
		Assert.assertTrue(false);
	}

	@Test
	public void testLogin4() {
		setup2();
		throw new SkipException("this test is skipped");
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
