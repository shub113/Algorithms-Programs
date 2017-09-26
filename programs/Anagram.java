package com.bridgeit.AlgorithmPrograms.programs;

import java.util.*;

class Anagram{
    public static void main(String[]arg){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 1st String");
        String s1=sc.nextLine();
        String s2=s1.replaceAll("\\s","");
        System.out.println("Enter 2nd string");
        String s3=sc.nextLine();
        String s4=s3.replaceAll("\\s","");
        
        if(s2.length()!=s4.length())
            System.out.println("Not Anagram (char len is diff)");
        else{
            char c1[]= s2.toLowerCase().toCharArray();
            char c2[]=s4.toLowerCase().toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            if(Arrays.equals(c2,c1))
                System.out.println("Anagram");
            else
                System.out.println("Not Anagram(diff chars)");
        }
        
        
    }
}