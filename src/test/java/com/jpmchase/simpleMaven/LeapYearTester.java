package com.jpmchase.simpleMaven;

import static org.junit.Assert.*;

import org.junit.Test;

public class LeapYearTester {

	@Test
	public void isLeapYearDivisibleBy4ButNotBy100True() throws Exception {
		//App.isLeap(1996);
		//fail("Not yet implemented");
		assertTrue(App.isLeap(1996));
	}
	
	@Test
	public void isLeapYearDivisibleBy4AndCenturyButNotLeap() throws Exception {
		assertFalse(App.isLeap(1900));
	}

}
