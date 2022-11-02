package AllTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Guru99Tests {
	
	ChromeDriver driver;
	String url  = "http://demo.guru99.com/v4";
	
	@Test(priority = -100)
	public void invokeBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\Selenium Testing\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	@Test
	public void verifyTitleOfPage() {
		String expectedTitle = "Guru99 Bank Manager HomePage";
		String actualTitle = driver.getTitle();
		
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@Test
	public void verifyLoginGuru99Application() {
		WebElement userId = driver.findElement(By.name("uid"));
		
		WebElement userPassword = driver.findElement(By.name("password"));
		
		WebElement loginButton = driver.findElement(By.name("btnLogin"));
		
		userId.sendKeys("mngr450842");
		userPassword.sendKeys("mUreryv");
		loginButton.click();
	}
	
	@Test(priority = 200)
	public void addCustomer() {
		WebElement addCustomer = driver.findElement(By.linkText("New Customer"));
		addCustomer.click();
		
		driver.findElement(By.xpath("//input[@value='f']")).click();
		
		driver.findElement(By.name("name")).sendKeys("Adarsh");
		driver.findElement(By.name("dob")).sendKeys("06/21/1990");
		driver.findElement(By.name("addr")).sendKeys("Colaba");
		driver.findElement(By.name("city")).sendKeys("Mumbai");
		driver.findElement(By.name("state")).sendKeys("Maharashtra");
		driver.findElement(By.name("pinno")).sendKeys("400005");
		driver.findElement(By.name("telephoneno")).sendKeys("9237472364");
		driver.findElement(By.name("emailid")).sendKeys("adarsh265@gmail.com");
		driver.findElement(By.name("password")).sendKeys("abc@123$");
		driver.findElement(By.name("sub")).click();
		
	}
	
	@Test(priority = 400)
	public void getCustomerID() {
		
		String customerID = driver.findElement(By.xpath("//table[@id='customer']/tbody/tr[4]/td[2]")).getText();
		
		System.out.println("Customer ID = " + customerID);
		
	}
	

}
