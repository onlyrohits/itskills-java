package com.itskills;

public class IfThenElse {

	public static void main(String[] args) {
		char grade;
		int testscore = 70;
		
		if (testscore >= 90) { 
			grade = 'A';
		} else if (testscore >= 80) { 
			grade = 'B';
		} else if (testscore >= 70) { 
			grade = 'C';
		} else if (testscore >= 60) { 
			grade = 'D';
		} else {
			grade = 'F';
		}
	}
}
