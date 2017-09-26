package com.bridgeit.AlgorithmPrograms.programs;

import java.util.Scanner;

import com.bridgeit.AlgorithmPrograms.utility.UtilitySearchSort;

public class InsertionSort {
	public static void main(String[]args){
		Scanner scan= new Scanner(System.in);
		UtilitySearchSort utility= new UtilitySearchSort();
		System.out.println("Enter number of input");
		int input=scan.nextInt();
		String[] s= new String[input];
		System.out.println("Enter "+input+" strings");
		for(int i=0;i<input;i++){
			s[i]=scan.next();
		}
		System.out.println("\nEntered String : ");
		for(String i:s){
			System.out.println(i);
		}
		s=utility.insertionSort(s);
		System.out.println("\nSorted String : ");
		for(String i:s){
			System.out.println(i);
		}
	}
}
