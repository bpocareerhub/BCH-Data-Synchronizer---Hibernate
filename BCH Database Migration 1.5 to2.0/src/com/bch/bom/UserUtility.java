package com.bch.bom;

public class UserUtility {

	public static int groupCode(String group_code) {
		int group_id = 0;
		
		if(group_code == "EMP") {
			group_id = 2;
		}
		
		if(group_code == "EMR") {
			group_id = 3;
		}
		
		return group_id;
	}
	
	public static int monthChartoInt(String month) {
		int mint = 0;
		if(month == "Jan") {
			mint = 1;
		}if(month == "Feb") {
			mint = 2;
		}if(month == "Mar") {
			mint = 3;
		}if(month == "Apr") {
			mint = 4;
		}if(month == "May") {
			mint = 5;
		}if(month == "Jun") {
			mint = 6;
		}if(month == "Jul") {
			mint = 7;
		}if(month == "Aug") {
			mint = 8;
		}if(month == "Sep") {
			mint = 9;
		}if(month == "Oct") {
			mint = 10;
		}if(month == "Nov") {
			mint = 11;
		}if(month == "Dec") {
			mint = 12;
		}
		return mint;
	}
}
