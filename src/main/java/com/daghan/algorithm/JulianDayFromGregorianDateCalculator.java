package com.daghan.algorithm;

import com.daghan.model.PersonalDate;

/**
 * Returns Julian day from Gregorian calendar.
 * 
 * @author daghan
 *
 */
public final class JulianDayFromGregorianDateCalculator implements JulianDayCalculator {

	protected JulianDayFromGregorianDateCalculator(){
		// protected constructor
	}
	
	@Override
	public double getJulianDay(PersonalDate date) {
		int a = (14 - date.getMonth()) / 12;
		int y = date.getYear() + 4800 - a;
		int m = date.getMonth() + 12 * a - 3;
		int julianDayNumber = date.getDay() + (153 * m + 2) / 5 + 365 * y + y / 4 - y / 100 + y / 400 - 32045;
		// remove the hour difference
		double julianDay = julianDayNumber - 0.5;
		return julianDay;
	}

}
