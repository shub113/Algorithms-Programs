package com.bridgeit.AlgorithmPrograms.programs;

import java.util.Scanner;

import com.bridgeit.AlgorithmPrograms.utility.UtilitySearchSort;

public class BubbleSort {
	public static void main(String[]args){
		Scanner scan= new Scanner(System.in);
		UtilitySearchSort utility= new UtilitySearchSort();
		
		System.out.println("Enter number of input");
		int input=scan.nextInt();
		int[] s= new int[input];
		System.out.println("Enter "+input+" Integer");
		for(int i=0;i<input;i++){
			s[i]=scan.nextInt();
		}
		System.out.println("\nEntered Integer : ");
		for(int i:s){
			System.out.println(i);
		}
		s=utility.bubbleSort(s);
		System.out.println("\nSorted Integer : ");
		for(int i:s){
			System.out.println(i);
		}
	}
}
