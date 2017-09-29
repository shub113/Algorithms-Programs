package com.bridgeit.AlgorithmPrograms.programs;

import java.util.Scanner;

import com.bridgeit.AlgorithmPrograms.utility.UtilitySearchSort;

public class BubbleSort<T> {
	public static void main(String[]args){
		Scanner scan= new Scanner(System.in);
		UtilitySearchSort utility= new UtilitySearchSort();
		
		System.out.println("Enter number of input");
		int input=scan.nextInt();
		System.out.println("Choose options");
		System.out.println("1) Integer");
		System.out.println("2) String");
		int choice= scan.nextInt();
		System.out.println("Enter "+input+" inputs");
		Integer[] integer= new Integer[input];
		String[] stringg= new String[input];
		if(choice==1){
			for(int i=0;i<input;i++){
				integer[i]=scan.nextInt();
			}utility.bubbleSort(integer);
		}else if(choice==2){
			for(int i=0;i<input;i++){
				stringg[i]=scan.next();
			}utility.bubbleSort(stringg);
		}else
			System.out.println("Invalid choice");
		/*System.out.println("\nEntered input : ");
		for(int i:s){
			System.out.println(i);
		}*/
		
	}
}
