package seleniumScripts;

import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithSelenium {
	
	ChromeDriver driver;
	
String url  = "http://demo.guru99.com/v4";
	
	
	public void invokeBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\adisi\\OneDrive\\Documents\\Projects\\Learning_selenium\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
	}
	
	public void getTitle() {
		String titleOfThePage = driver.getTitle();
		System.out.println("Title of the page - " + titleOfThePage);
	}
	
	public void CloseBrowser() {
		//driver.close();
		
		driver.quit();
	}

	public static void main(String[] args) {
		WorkingWithSelenium wc = new WorkingWithSelenium();
		wc.invokeBrowser();
		wc.getTitle();
		wc.CloseBrowser();
	}

}
