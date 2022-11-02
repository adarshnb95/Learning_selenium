package com.parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
	
	ChromeDriver driver;
	
	@Test
	@Parameters({"url", "emailId"})
	public void yahooLoginTest(String url, String emailId) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\adisi\\OneDrive\\Documents\\Projects\\Learning_selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		
		driver.findElement(By.xpath("//*[@id=\"login-username\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"login-username\"]")).sendKeys(emailId); //enter username
		
		driver.findElement(By.xpath("//*[@id=\"login-signin\"]")).click();  //click on next button
				
	}

}
