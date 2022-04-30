package excelFileHandlingByApachePOI;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderWithExcel_001 {

	WebDriver driver;

    @BeforeMethod

    public void beforeMethod() throws Exception {

    	System.setProperty("webdriver.chrome.driver",
				"C:/Users/java/eclipse-workspace/javaProject/Drivers1/chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();

	}

@Test(dataProvider="Authentication")

public void Registration_data(String sUserName,String sPassword)throws  Exception{

	driver.findElement(By.name("txtUsername")).sendKeys(sUserName);
	driver.findElement(By.name("txtPassword")).sendKeys(sPassword);
	driver.findElement(By.id("btnLogin")).click();
    

	System.out.println(sUserName);

   
	System.out.println(sPassword);

   
    System.out.println(" Login Successfully, now it is the time to Log Off buddy.");

    

	}

@DataProvider

public Object[][] Authentication() throws Exception{

     Object[][] testObjArray = ExcelUtils.getTableArray("C:\\Users\\java\\eclipse-workspace\\TestingDemostration1\\src\\test\\java\\testdata\\TestData.xlsx","Sheet1");

     return (testObjArray);

	}

@AfterMethod

public void afterMethod() {

	    driver.close();

	}

}