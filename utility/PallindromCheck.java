package com.bridgeit.AlgorithmPrograms.utility;

public class PallindromCheck {
	public static void checkPallin(int i){
		int j=i;
		int rev=0;
		while(i>0){
			rev=(rev*10)+i%10;
			i=i/10;
		}
		if(j==rev)
			System.out.println("\tPallindrom number");
		else
			System.out.println("Not a pallindrom");
	}
}
