package com.daghan.algorithm;

import static org.junit.Assert.*;

import org.junit.Test;

import com.daghan.model.InputDateTypeEnum;

public class JulianDayCalculatorFactoryTest {

	@Test
	public void testGregorian() {
		assertTrue(JulianDayCalculatorFactory.createJulianDayCalculator(
				InputDateTypeEnum.GREGORIAN) instanceof JulianDayFromGregorianDateCalculator);
	}

	@Test
	public void testJulian() {
		assertTrue(JulianDayCalculatorFactory
				.createJulianDayCalculator(InputDateTypeEnum.JULIAN) instanceof JulianDayFromJulianDateCalculator);
	}

	@Test(expected = RuntimeException.class)
	public void testUnkown() {
		JulianDayCalculatorFactory.createJulianDayCalculator(InputDateTypeEnum.UNKOWN);
	}

}
