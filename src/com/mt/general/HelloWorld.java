package com.mt.general;

import java.util.Date;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello Welcome to ANT World!! " + getLocalCurrentDate());
		System.out.println("Hello Welcome to ANT World!! " + getLocalCurrentDate());
		//http://download.eclipse.org/mpc/releases/1.5.1a
		/*
		 * String testCase;
		 * 
		 * String var = args[0]; 
		 * switch (var) { 
		 * case "CIT": testCase = "CIT Test class"; 
		 * System.out.println(monthString); 
		 * break; 
		 * case "ABC":
		 * testCase = "ABC Test Class"; 
		 * System.out.println(monthString); 
		 * break;
		 * 
		 * default: testCase = "Invalid Test case"; 
		 * break; 
		 * }
		 */
	}

	private static Date getLocalCurrentDate() {
		String m = "Mithun";

		return new Date();

	}

	private static Date getLocalCurrentDate1() {
		return new Date();
	}

}
