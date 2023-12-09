package com.learn.springboot.mavenDemo;

import org.junit.Test;

import junit.framework.Assert;

/**
 * Unit test for simple App.
 */
public class AppTest {
	/**
	 * Rigorous Test :-)
	 */
	@Test
	public void givenANameWhenHelloThenReturnHelloName() {
		App app = new App();
		String result = app.hello("Maven");
//		Assert.assertNotNull(result);
		Assert.assertEquals("Hello Maven",result);
		

	}
}
