package com.daghan.algorithm;

import com.daghan.model.InputDateTypeEnum;

/**
 * Returns a Julian day calculator based on the input date type
 * 
 * @author daghan
 *
 */
public class JulianDayCalculatorFactory {
	public static JulianDayCalculator createJulianDayCalculator(InputDateTypeEnum inputDateType) {
		switch (inputDateType) {
		case GREGORIAN:
			return new JulianDayFromGregorianDateCalculator();
		case JULIAN:
			return new JulianDayFromJulianDateCalculator();
		default:
			throw new RuntimeException("No calculator found for this type " + inputDateType);
		}

	}
}
