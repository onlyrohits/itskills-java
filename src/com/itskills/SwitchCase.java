package com.itskills;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int month = 4;
		String monthString;
		
		switch (month) {
			case 1: 
				monthString = "January";
				break;
			case 2: 
				monthString = "February";
				break;
			case 3: 
				monthString = "March";
				break;
			case 4: 
				monthString = "April";
				break;
			case 12: 
				monthString = "December";
				break;
			default: 
				monthString = "Invalid month";
				break; 
		}
		
		System.out.println("Month for " + month + " is " + monthString);
	}
}

