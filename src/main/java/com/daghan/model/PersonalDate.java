package com.daghan.model;

/**
 * Represents a date class with only day, month and year
 * 
 * @author daghan
 *
 */
public class PersonalDate {

	@Override
	public String toString() {
		return String.format("%02d", day) + " " + String.format("%02d", month) + " " + year;
	}

	int day;
	int month;
	int year;

	public PersonalDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}
}
