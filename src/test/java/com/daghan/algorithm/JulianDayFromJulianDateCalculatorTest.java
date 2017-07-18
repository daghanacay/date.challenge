package com.daghan.algorithm;

import static org.junit.Assert.*;

import org.junit.Test;

import com.daghan.model.InputDateTypeEnum;
import com.daghan.model.PersonalDate;

/*
 * Calculates Julian day from Julian Date
 */
public class JulianDayFromJulianDateCalculatorTest {

	JulianDayCalculator unitUnderTest = JulianDayCalculatorFactory.createJulianDayCalculator(InputDateTypeEnum.JULIAN);

	@Test
	public void testFirstDate() {
		// prepare test
		PersonalDate testDate = new PersonalDate(1, 1, 2000);
		double result = unitUnderTest.getJulianDay(testDate);
		assertEquals(2451557.5, result, 0.0);
	}

	@Test
	public void testSecondDate() {
		// prepare test
		PersonalDate testDate = new PersonalDate(2, 1, 2000);
		double result = unitUnderTest.getJulianDay(testDate);
		assertEquals(2451558.5, result, 0.0);
	}

	@Test
	public void testOneDayDifference() {
		// prepare test
		PersonalDate testDate = new PersonalDate(2, 1, 2000);
		PersonalDate testDate2 = new PersonalDate(1, 1, 2000);
		double result = unitUnderTest.getJulianDay(testDate) - unitUnderTest.getJulianDay(testDate2);
		assertEquals(1, result, 0.0);
	}

	@Test
	public void testOneMonthJanuaryDifference() {
		// prepare test
		PersonalDate testDate = new PersonalDate(1, 2, 2000);
		PersonalDate testDate2 = new PersonalDate(1, 1, 2000);
		double result = unitUnderTest.getJulianDay(testDate) - unitUnderTest.getJulianDay(testDate2);
		assertEquals(31, result, 0.0);
	}

	@Test
	public void testOneMonthFebruaryDifference() {
		// prepare test
		PersonalDate testDate = new PersonalDate(1, 3, 2000);
		PersonalDate testDate2 = new PersonalDate(1, 2, 2000);
		double result = unitUnderTest.getJulianDay(testDate) - unitUnderTest.getJulianDay(testDate2);
		assertEquals(29, result, 0.0);
	}

}
