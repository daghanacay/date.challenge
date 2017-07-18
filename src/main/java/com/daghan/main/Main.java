package com.daghan.main;

import com.daghan.CodeDateParser;
import com.daghan.algorithm.JulianDayCalculator;
import com.daghan.algorithm.JulianDayCalculatorFactory;
import com.daghan.model.InputDateTypeEnum;
import com.daghan.model.PersonalDate;

public class Main {

	private static CodeDateParser parser = new CodeDateParser();
	private static JulianDayCalculator julianCalculator = JulianDayCalculatorFactory
			.createJulianDayCalculator(InputDateTypeEnum.GREGORIAN);

	public static void main(String[] args) {
		if (args.length == 0) {
			printErrorMessage();
		}

		String[] input = args[0].split(",");
		if (input.length != 2) {
			printErrorMessage();
		}

		PersonalDate date1 = parser.parseDate(input[0]);
		PersonalDate date2 = parser.parseDate(input[1]);

		double julianDate1 = julianCalculator.getJulianDay(date1);
		double julianDate2 = julianCalculator.getJulianDay(date2);

		if (julianDate1 > julianDate2) {
			System.out.println(String.format("%s , %s, %s", date2, date1, (int) (julianDate1 - julianDate2)));
		} else {
			System.out.println(String.format("%s , %s, %s", date1, date2, (int) (julianDate2 - julianDate1)));
		}

	}

	private static void printErrorMessage() {
		System.out.println("Input should be 'DD MM YYYY, DD MM YYYY'");
		System.exit(0);
	}

}
