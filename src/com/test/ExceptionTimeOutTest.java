package com.test;

import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadTimeoutException;

public class ExceptionTimeOutTest {
	
	@Test(invocationTimeOut = 2000, expectedExceptions=ThreadTimeoutException.class)
	public void infiniteLoopTest() {
		int i = 1;
		while(i == 1) {
			System.out.println(i);
		}
	}

}
