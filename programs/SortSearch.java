package com.bridgeit.AlgorithmPrograms.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import com.bridgeit.AlgorithmPrograms.utility.UtilitySearchSort;

public class SortSearch {
	public static void main(String[]args){
		Scanner scan= new Scanner(System.in);
		UtilitySearchSort utility= new UtilitySearchSort();
		System.out.println("Enter number of inputs");
		int num=scan.nextInt();
		int[] array1= new int[num];
		String[] array2= new String[num];
		System.out.println("Enter choice");
		System.out.println("1) Integer");
		System.out.println("2) String");
		int choice= scan.nextInt();
		switch(choice){
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
				long start=System.currentTimeMillis();
				int[] array11= utility.insertionSort(array1);
				long stop= System.currentTimeMillis();
				System.out.println("Insertion sort took "+(stop-start)+" mili seconds");
				System.out.println("Enter integer to search");
				int number= scan.nextInt();
				if(utility.binarySearchInteger(array11, number))
					System.out.println("Found");
				else
					System.out.println("Not Found");
			}else if(choice2==2){
				long start=System.currentTimeMillis();
				array1= utility.bubbleSort(array1);
				long stop= System.currentTimeMillis();
				System.out.println("Bubble sort took "+(stop-start)+" mili seconds");
				System.out.println("Enter integer to search");
				int number= scan.nextInt();
				if(utility.binarySearchInteger(array1,number))
					System.out.println("Found");
				else
					System.out.println("Not Found");
			}
				
			else
				System.out.println("Invalid Choice");
			
			break;
		case 2:
			System.out.println("Enter "+num+" Strings");
			for(int i=0;i<num;i++)
				array2[i]=scan.next();
			
			System.out.println("\nChoose your Option");
			System.out.println("1) Insertion sort");
			System.out.println("2) Bubble Sort");
			int choice3=scan.nextInt();
			if(choice3==1){
				long start=System.currentTimeMillis();
				array2= utility.insertionSort(array2);
				long stop= System.currentTimeMillis();
				System.out.println("Insertion sort took "+(stop-start)+" mili seconds");
				System.out.println("Enter String to search");
				String s= scan.next();
				if(utility.binarySearchString(array2, s))
					System.out.println("Found");
				else
					System.out.println("Not Found");
			}else if(choice3==2){
				long start=System.currentTimeMillis();
				array1= utility.bubbleSort(array1);
				long stop= System.currentTimeMillis();
				System.out.println("Bubble sort took "+(stop-start)+" mili seconds");
				System.out.println("Enter integer to search");
				String s= scan.next();
				if(utility.binarySearchString(array2,s))
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
