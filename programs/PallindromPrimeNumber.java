package com.bridgeit.AlgorithmPrograms.programs;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import com.bridgeit.AlgorithmPrograms.utility.AnagramCheck;
import com.bridgeit.AlgorithmPrograms.utility.PallindromCheck;

/**
 * @author shub
 *
 */
public class PallindromPrimeNumber { 
	public static void main(String[]args){
		PallindromCheck pallin= new PallindromCheck();
		AnagramCheck anagam= new AnagramCheck();
		ArrayList<Integer> array= new ArrayList<Integer>();
		Scanner sc= new Scanner(System.in);
		
		for(int i=2;i<1000;i++){
			int flag= 0;
			for(int j=2;j<=i/2;j++){
				if(i%j==0){
					flag=1;
					break;
				}
			}if(flag==0){
				System.out.println(i);
				array.add(i);
				pallin.checkPallin(i);
			}
		}
		anagam.check(array);
	}
	
}
