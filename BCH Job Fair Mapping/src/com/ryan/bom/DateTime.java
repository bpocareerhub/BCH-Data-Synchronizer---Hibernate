package com.ryan.bom;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateTime {

	public static Date getCurrentSQLDate() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		//get current date time with Date()
		Date date = new Date();

		//get current date time with Calendar()
		Calendar cal = Calendar.getInstance();
		return cal.getTime();
	}
}
