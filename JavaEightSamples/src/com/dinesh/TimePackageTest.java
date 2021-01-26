package com.dinesh;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;



public class TimePackageTest {

	public static void main(String[] args) {
		
		LocalDate localDate = LocalDate.now();
		System.out.println("Local Date: " + localDate);
		System.out.println(" The week day of today: "+localDate.getDayOfWeek());
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("Local Date Time: " + localDateTime);

		System.out.println(" 1st September 1983: " + LocalDate.of(1983, 9, 01));

		System.out.println(" 1st September 1983 Parse: " + LocalDate.parse("1983-09-01"));

		System.out.println(" Tomorrow date, just like that: " + LocalDate.now().plusDays(1));

		System.out.println(" Previous Month same day: " + LocalDate.now().minus(1, ChronoUnit.MONTHS));
		
		/*
		 * two code examples we parse the date “1983-09-01” and get the day of the week
		 * and the day of the month respectively. Note the return values, the first is
		 * an object representing the DayOfWeek while the second in an int representing
		 * the ordinal value of the month
		 */
		
		DayOfWeek weekDay=LocalDate.parse("1983-09-01").getDayOfWeek();
		System.out.println(" The week day of 1st Sep 1983: "+weekDay);
		
		int dayofTheMonth=LocalDate.parse("1983-09-01").getDayOfMonth();
		System.out.println(" The day of Month 1st Sep 1983: "+dayofTheMonth);
		
		System.out.println(" Is 2020 is leap Year: "+LocalDate.now().isLeapYear());
		
		/*
		 * The relationship of a date to another can be determined to occur before or
		 * after another date
		 */
		
		boolean isAfter1stSeptember=LocalDate.parse("1983-09-05").isAfter(LocalDate.parse("1983-09-01"));
		
		System.out.println(" isAfter5thSeptember after sept 1st : "+isAfter1stSeptember);
		
		
	}

}
