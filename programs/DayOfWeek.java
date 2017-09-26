package com.bridgeit.AlgorithmPrograms.programs;

import java.util.Scanner;

public class DayOfWeek {

	/**
	 * @param shub
	 */
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter date");
		int date= scan.nextInt();
		System.out.println("Enter month");
		int month= scan.nextInt();
		System.out.println("Enter Year");
		int year=scan.nextInt();
		
		int x=0;int y=0;int z=0;
		
		y=year-(14-month)/12;
		x=y+y/4-y/100+y/400;
		z=month+12*((14-month)/12)-2;
		
		int day=(date+x+(31*z)/12)%7;
		switch(day){
		case 0:
			System.out.println("Sunday");
			break;
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
			default:
				System.out.println("Default");
		}
	}

}
