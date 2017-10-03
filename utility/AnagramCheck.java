package com.bridgeit.AlgorithmPrograms.utility;

import java.util.ArrayList;
import java.util.Arrays;

public class AnagramCheck {
	public void check(ArrayList<Integer> array){
		ArrayList<Integer> array2= new ArrayList<Integer>();

		int size= array.size();
		for(int i=0;i<size;i++){
			int num= array.get(i);
			char[] c1= Integer.toString(num).toCharArray();
			Arrays.sort(c1);
			for(int j=i+1;j<size;j++){
				int num2=array.get(j);
				char[] c2= Integer.toString(num2).toCharArray();
				Arrays.sort(c2);
				if(Arrays.equals(c1, c2)){
					array2.add(num);
					break;
				}
			}
			
		}
		System.out.print("Anagrams & pallin : ");
		System.out.print(array2);
	}
}
