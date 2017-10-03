package com.bridgeit.AlgorithmPrograms.utility;

import java.util.ArrayList;

public class PallindromCheck {
	public static void checkPallin(ArrayList<Integer> array){
		ArrayList<Integer> array2= new ArrayList<Integer>();
		AnagramCheck anagram= new AnagramCheck();
		for(int i:array){
			int j=i;
			int rev=0;
			while(j>0){
				rev=(rev*10)+j%10;
				j=j/10;
			}
			if(i==rev){
				array2.add(i);
			}
		}
		System.out.println("Pallindrom"+array2);
		anagram.check(array2);
			
	}
}
