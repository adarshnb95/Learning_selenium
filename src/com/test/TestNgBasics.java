package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasics {
	
	
	/*
	 *  @BeforeSuite -- setup system property for chrome
		@BeforeTest -- Launch Chrome Browser
		@BeforeClass -- Login into app
		@BeforeMethod -- Enter URL
		@Test -- Google Title Test
		@AfterMethod -- Logout from app
		@BeforeMethod -- Enter URL
		@Test -- Logo Test
		@AfterMethod -- Logout from app
		@BeforeMethod -- Enter URL
		@Test -- Search Test
		@AfterMethod -- Logout from app
		@AfterClass -- Close the browser
		@AfterTest -- Delete all cookies	 

* */

	/**
	 * precondition annotations - starting with @Before
	 */
	@BeforeSuite		// annotation, should always be associated with a method 		1
	public void setup() {
		System.out.println("@BeforeSuite -- setup system property for chrome");
	}
	
	@BeforeTest	//2
	public void launchBrowser() {
		System.out.println("@BeforeTest -- Launch Chrome Browser");
		
	}
	
	@BeforeClass	//3	
	public void login() {
		System.out.println("@BeforeClass -- Login into app");
	}
	
	/*
	 * Sequence of sets of test:
	 * @BeforeMethod
	 * @Test1
	 * @AfterMethod
	 * 
	 * @BeforeMethod
	 * @Test2
	 * @AfterMethod
	 * 
	 * 
	 * */
	
	
	@BeforeMethod	//4
	public void enterURL() {
		System.out.println("@BeforeMethod -- Enter URL");
	}
	
	
	// Test cases starting with @Test
	
	@Test	//5
	public void googleTitleTest() {
		System.out.println("@Test -- Google Title Test");
	}
	
	@Test
	public void searchTest() {
		System.out.println("@Test -- Search Test");
	}
	
	@Test
	public void logoTest() {
		System.out.println("@Test -- Logo Test");
	}
	
	
	/*
	 * post condition annotations - Starting with @After
	 * */
	
	@AfterMethod	//6
	public void logout() {
		System.out.println("@AfterMethod -- Logout from app");
	}
	
	@AfterClass	//7
	public void closeBrowser() {
		System.out.println("@AfterClass -- Close the browser");
	}
	
	@AfterTest	//8
	public void deleteAllCookies() {
		System.out.println("@AfterTest -- Delete all cookies");
	}
	
	@AfterSuite	//9
	public void generateTestReport() {
		System.out.println("@AfterSuite -- Generate Test report");
	}
	
}
