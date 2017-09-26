package com.bridgeit.AlgorithmPrograms.utility;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadWrite {
	BufferedReader brd;
	
	public String[] ReadString(String filename) throws IOException{
		brd =new BufferedReader(new FileReader("/home/bridgeit/"+filename+".txt"));
		String s="";
		String s2="";
		while((s=brd.readLine())!=null){
			s2=s2+s;
		}
		String [] s3=s2.split(" ");
		return s3;
	}
	public void WriteString(String string){
		
	}
	

}
