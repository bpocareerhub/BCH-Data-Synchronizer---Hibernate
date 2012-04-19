package com.bch.bom;

import java.util.Calendar;
import java.util.Date;

public class DateTime {

	public static Date getCurrentSQLDate() {
		//get current date time with Calendar()
		Calendar cal = Calendar.getInstance();
		return cal.getTime();
	}
}
