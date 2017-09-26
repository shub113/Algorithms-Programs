package com.bridgeit.AlgorithmPrograms.programs;

import java.io.*;
import java.util.*;
import java.util.Scanner;

import com.bridgeit.AlgorithmPrograms.utility.FileReadWrite;
import com.bridgeit.AlgorithmPrograms.utility.UtilitySearchSort;

import java.io.IOException;
/**
 * @author shub
 * put text for filename
 *
 */
public class WordList {

	public static void main(String[] args)throws IOException {
		Scanner scan= new Scanner(System.in);
		FileReadWrite frw= new FileReadWrite();
		UtilitySearchSort utility= new UtilitySearchSort();
		
		System.out.println("Enter Filename");
		String filename= scan.next();
		String[] s= frw.ReadString(filename);
		System.out.println("Enter word to search");
		String word= scan.next();
		Arrays.sort(s);
		if(utility.binarySearchString(s, word))
			System.out.println("Found");
		else
			System.out.println("Not Found");
	}
}