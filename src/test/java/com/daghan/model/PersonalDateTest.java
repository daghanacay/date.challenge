package com.daghan.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonalDateTest {

	@Test
	public void test() {
		PersonalDate unitUnderTest = new PersonalDate(1, 1, 1);
		assertEquals(1, unitUnderTest.getDay());
		assertEquals(1, unitUnderTest.getMonth());
		assertEquals(1, unitUnderTest.getYear());
	}

	@Test
	public void testToString() {
		PersonalDate unitUnderTest = new PersonalDate(1, 1, 2000);
		assertEquals("01 01 2000", unitUnderTest.toString());
	}

}
