package com.test;

import org.testng.annotations.Test;

public class TestNgFeatures {
	
	@Test
	public void LoginTest() {
		System.out.println("Login");
//		int i = 9/0;
	}
	
	@Test(dependsOnMethods= "LoginTest")
	public void HomePageTest() {
		System.out.println("Homepage test");
	}
	
	@Test(dependsOnMethods= "LoginTest")
	public void SearchPageTest() {
		System.out.println("Search page test");
	}
	
	@Test(dependsOnMethods= "LoginTest")
	public void RegistrationPage() {
		System.out.println("Registration Page test");
	}
	

}
