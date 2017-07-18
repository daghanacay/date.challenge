package com.daghan.algorithm;

import com.daghan.model.PersonalDate;

/**
 * Calculates julian day from given date object
 * 
 * julian days https://en.wikipedia.org/wiki/Julian_day
 * 
 * @author daghan
 *
 */
public interface JulianDayCalculator {

	// returns a juilan day from PersonalDate class
	double getJulianDay(PersonalDate date);

}