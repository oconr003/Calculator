package com.qa.calculator;

import org.junit.Assert;
import org.junit.Test;

public class DivideTest {

	private Divider divider;
	
	@Test
	public void test() {
		divider = new Divider();
		double expectedValue = 10;
		double actualValue = divider.divide(20,2);
		
		Assert.assertEquals(expectedValue, actualValue);
	}

}