package com.daghan;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.daghan.model.PersonalDate;

/**
 * Parses and validates dates in the form
 * 
 * DD MM YYYY
 * 
 * @author daghan
 *
 */
public class CodeDateParser {

	private static Pattern REG_PATTERN = Pattern
			.compile("^(0[1-9]|[12][0-9]|3[01])[\\s](0[1-9]|1[012])[\\s]((19|20)\\d\\d)$");
	private static int[] NUMBER_OF_DAYS_IN_A_MONTH = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public PersonalDate parseDate(String dateString) {
		PersonalDate returnVal = null;

		Matcher matcher = REG_PATTERN.matcher(dateString.trim());
		if (!matcher.find() || matcher.groupCount() != 4) {
			throw new IllegalArgumentException("date string should have DD MM YYYY");
		}
		// at this point we have all the digit and size is guaranteed by the
		// regular expression
		int day = Integer.valueOf(matcher.group(1));
		int month = Integer.valueOf(matcher.group(2));
		int year = Integer.valueOf(matcher.group(3));

		if (day > NUMBER_OF_DAYS_IN_A_MONTH[month - 1]) {
			throw new IllegalArgumentException("Day could not be larger than " + NUMBER_OF_DAYS_IN_A_MONTH[month - 1]);
		}

		returnVal = new PersonalDate(day, month, year);
		return returnVal;

	}

}
