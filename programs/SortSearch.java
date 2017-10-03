package com.bridgeit.AlgorithmPrograms.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import com.bridgeit.AlgorithmPrograms.utility.UtilitySearchSort;

public class SortSearch {
	public static void main(String[]args){
		Scanner scan= new Scanner(System.in);
		UtilitySearchSort utility= new UtilitySearchSort();
		System.out.println("Enter number of inputs");
		int num=scan.nextInt();
		Integer[] array1= new Integer[num];
		String[] array2= new String[num];
		System.out.println("Enter choice");
		System.out.println("1) Integer");
		System.out.println("2) String");
		int choice= scan.nextInt();
		switch(choice){
		// Integer
		case 1:
			System.out.println("Enter "+num+" Integers");
			for(int i=0;i<num;i++){
				array1[i]=scan.nextInt();
			}
			System.out.println("\nChoose your Option");
			System.out.println("1) Insertion sort");
			System.out.println("2) Bubble Sort");
			int choice2=scan.nextInt();
			if(choice2==1){
				//long start=System.currentTimeMillis();
				utility.insertionsort(array1);
				/*long stop= System.currentTimeMillis();
				System.out.println("Insertion sort took "+(stop-start)+" mili seconds");*/
				Arrays.sort(array1);
				System.out.println("Enter integer to search");
				int number= scan.nextInt();
				if(utility.binarySearch(array1, number))
					System.out.println("Found");
				else
					System.out.println("Not Found");
			}else if(choice2==2){
				//long start=System.currentTimeMillis();
				utility.bubbleSort(array1);
				/*long stop= System.currentTimeMillis();
				System.out.println("Bubble sort took "+(stop-start)+" mili seconds");*/
				Arrays.sort(array2);
				System.out.println("Enter integer to search");
				int number= scan.nextInt();
				if(utility.binarySearch(array1,number))
					System.out.println("Found");
				else
					System.out.println("Not Found");
			}
				
			else
				System.out.println("Invalid Choice");
			
			break;
			//String
		case 2:
			System.out.println("Enter "+num+" Strings");
			for(int i=0;i<num;i++)
				array2[i]=scan.next();
			
			System.out.println("\nChoose your Option");
			System.out.println("1) Insertion sort");
			System.out.println("2) Bubble Sort");
			int choice3=scan.nextInt();
			if(choice3==1){
				//long start=System.currentTimeMillis();
				utility.insertionsort(array2);
				//long stop= System.currentTimeMillis();
				//System.out.println("Insertion sort took "+(stop-start)+" mili seconds");
				Arrays.sort(array2);
				System.out.println("Enter String to search");
				String s= scan.next();
				if(utility.binarySearch(array2, s))
					System.out.println("Found");
				else
					System.out.println("Not Found");
			}else if(choice3==2){
				//long start=System.currentTimeMillis();
				 utility.bubbleSort(array2);
				//long stop= System.currentTimeMillis();
				//System.out.println("Bubble sort took "+(stop-start)+" mili seconds");
				 Arrays.sort(array2);
				System.out.println("Enter String to search");
				String s= scan.next();
				for(String i:array2){
					System.out.print(i+" ");
				}
				if(utility.binarySearch(array2,s))
					System.out.println("Found");
				else
					System.out.println("Not Found");
			}
				
			else
				System.out.println("Invalid Choice");
			break;
			default:
				System.out.println("Invalid choice");
			
		}
	}
}
