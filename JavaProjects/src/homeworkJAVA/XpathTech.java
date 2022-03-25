package homeworkJAVA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathTech {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\java\\eclipse-workspace\\javaProject\\Drivers1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();

		driver.findElement(By.xpath("//*[@id=\'menu_pim_viewMyDetails\']/b")).click(); // Relative XPath
		driver.findElement(By.xpath("//*[@id=\"btnSave\"]")).click(); // By XPath- Using Single Attribute
		driver.findElement(By.xpath("//*[@type='text'][@id='personal_txtEmpFirstName']")).clear(); // By XPath- Using Multiple Attribute													
		driver.findElement(By.xpath("//*[@type='text'][@id='personal_txtEmpFirstName']")).sendKeys("markand"); // By XPath- Using Multiple Attribute																								
		driver.findElement(By.xpath("//*[@type='text' and @id='personal_txtEmpLastName']")).clear(); // By XPath- Using And
		driver.findElement(By.xpath("//*[@type='text' and @id='personal_txtEmpLastName']")).sendKeys("gyani"); // By XPath- Using And
		driver.findElement(By.xpath("//*[@name='personal[txtEmployeeId' or @id='personal_txtEmployeeId']")).clear(); //By XPath- Using Or
		driver.findElement(By.xpath("//*[@name='personal[txtEmployeeId' or @id='personal_txtEmployeeId']")).sendKeys("1000001"); //By XPath- Using Or
		driver.findElement(By.xpath("//*[contains(@id,'personal_txtLicenNo')]")).clear();   //By XPath- Using contains()
		driver.findElement(By.xpath("//*[contains(@id,'personal_txtLicenNo')]")).sendKeys("987654321");  //By XPath- Using contains()
		driver.findElement(By.xpath("//*[starts-with(@id,'personal_txtNICNo')]")).clear();  //By XPath- starts-with()
		driver.findElement(By.xpath("//*[starts-with(@id,'personal_txtNICNo')]")).sendKeys("987-564-321"); //By XPath- starts-with()
		driver.findElement(By.xpath("//input[@id='personal_txtMilitarySer'][last()]")).clear(); //By XPath- Using last()
		driver.findElement(By.xpath("//input[@id='personal_txtMilitarySer'][last()]")).sendKeys("sniper");// By XPath- Using last()
		driver.findElement(By.xpath("//*[@id=\'btnSave\']")).click(); // // Relative XPath
		System.out.println("passed");
		
		driver.findElement(By.xpath("//*[text()='Performance']")).click(); //By XPath- Using text()
		
		System.out.println("passed");
		driver.close();

	}

}
