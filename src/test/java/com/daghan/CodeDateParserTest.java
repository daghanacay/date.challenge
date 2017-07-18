package com.daghan;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.daghan.model.PersonalDate;

public class CodeDateParserTest {

	CodeDateParser unitUnderTest = new CodeDateParser();

	@Test
	public void testParseFirstDate() {
		PersonalDate returnVal = unitUnderTest.parseDate("01 01 2000");
		assertEquals(1, returnVal.getDay());
		assertEquals(1, returnVal.getMonth());
		assertEquals(2000, returnVal.getYear());
	}

	@Test
	public void testParseSecondDate() {
		PersonalDate returnVal = unitUnderTest.parseDate("31 12 2015");
		assertEquals(31, returnVal.getDay());
		assertEquals(12, returnVal.getMonth());
		assertEquals(2015, returnVal.getYear());
	}
	
	@Test
	public void testParseThirdDate() {
		PersonalDate returnVal = unitUnderTest.parseDate(" 31 12 2015 ");
		assertEquals(31, returnVal.getDay());
		assertEquals(12, returnVal.getMonth());
		assertEquals(2015, returnVal.getYear());
	}

	@Test(expected = IllegalArgumentException.class)
	public void testParseInvalidDateWrongNumberOfDaysInFebruary() {
		unitUnderTest.parseDate("30 02 2015");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testParseInvalidDateMissingDay() {
		unitUnderTest.parseDate("01 2000");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testParseInvalidDateMissingYear() {
		unitUnderTest.parseDate("32 01");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testParseInvalidDateWrongDelimiter() {
		unitUnderTest.parseDate("32/01/2000");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testParseInvalidDateWrongDay() {
		unitUnderTest.parseDate("32 01 2000");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testParseInvalidDateWrongMonth() {
		unitUnderTest.parseDate("31 13 2000");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testParseInvalidDateWrongDay2() {
		unitUnderTest.parseDate("52 01 2000");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testParseInvalidDateWrongMonth2() {
		unitUnderTest.parseDate("12 25 2000");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testParseInvalidDateWrongYear() {
		unitUnderTest.parseDate("12 05 20000");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testParseInvalidDateWrongYear2() {
		unitUnderTest.parseDate("01 01 200");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testParseInvalidDateLetterInDay() {
		unitUnderTest.parseDate("0a 01 2000");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testParseInvalidDateMissingDigitDay() {
		unitUnderTest.parseDate("1 01 2000");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testParseInvalidDateLetterInMonth() {
		unitUnderTest.parseDate("01 a1 2000");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testParseInvalidDateLetterInYear() {
		unitUnderTest.parseDate("01 01 a000");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testParseInvalidDateLetterInYear2() {
		unitUnderTest.parseDate("01 01 a");
	}

}
