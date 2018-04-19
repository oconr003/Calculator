package com.qa.calculator;

import org.junit.Assert;
import org.junit.Test;

public class MultiplyTest {

	private Multiplyer multiplyer;
	
	@Test
	public void test() {
		multiplyer = new Multiplyer();
		int expectedValue = 6;
		int actualValue = multiplyer.multiply(2,3);
		Assert.assertEquals(expectedValue, actualValue);
	}

}
