package com.daghan.algorithm;

import com.daghan.model.PersonalDate;

/**
 * Returns Julian day from Julian calendar.
 * 
 * @author daghan
 *
 */
public class JulianDayFromJulianDateCalculator implements JulianDayCalculator {

	protected JulianDayFromJulianDateCalculator(){
		// protected constructor
	}
	
	@Override
	public double getJulianDay(PersonalDate date) {
		int a = (14 - date.getMonth()) / 12;
		int y = date.getYear() + 4800 - a;
		int m = date.getMonth() + 12 * a - 3;
		int julianDayNumber = date.getDay() + (153 * m + 2) / 5 + 365 * y + y / 4 - 32083;
		// remove the hour difference
		double julianDay = julianDayNumber - 0.5;
		return julianDay;
	}

}
