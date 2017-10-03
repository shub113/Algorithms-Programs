package com.bridgeit.AlgorithmPrograms.programs;

import java.util.*;

class BinaryProgram{
	static LinkedList<Integer> binary=new LinkedList<Integer>();
	static LinkedList<Integer> binary2= new LinkedList<Integer>();
	
	static Integer[] array= new Integer[8];
	
        private static int nibbles(int num){
            String s1=Integer.toBinaryString(num);
            char[] c1= s1.toCharArray();
            Integer[] arrayInt= new Integer[c1.length];
            for(int i=0;i<c1.length;i++){
            	arrayInt[i]=Integer.parseInt(String.valueOf(c1[i]));
            }
            for(int i:arrayInt){
            	binary.add(i);
            }
            while(binary.size()<8){
            	binary.addFirst(0);
            }
            Integer[] array2=binary.toArray(new Integer[8]);
            
           //printing binary conversion
            System.out.print("Binary of "+num+" = ");
            for(int i: array2){
                System.out.print(i);
            }
            System.out.println();
            
            //swapping characters
            int index=0;
            for(int i=4;i<8;i++){
            	array[index++]=array2[i];
            }
            for(int i=0;i<4;i++){
            	array[index++]=array2[i];
            }
            
            //printing swapped characters
            System.out.print("Nibbles = ");
            for(int i:array){
                System.out.print(i);
            }
            System.out.println();
            String s2="";
           for(int i:array){
        	   s2=s2+String.valueOf(i);
           }
            System.out.println(s2);
            return Integer.parseInt(s2,2);
        }
        public static boolean check(int num){
        	while(num!=1){
        		if(num%2!=0){
        			return false;
        		}else{
        			num=num/2;
        		}
        	}
        	return true;
        }
       
        
        public static void main(String[]args){
            Scanner scan= new Scanner(System.in);
            System.out.println("Enter Decimal Number");
            int num= scan.nextInt();
            int num2=BinaryProgram.nibbles(num);
            if(BinaryProgram.check(num2)){
            	System.out.println(num2+"is power of 2");
            }else{
            	System.out.println(num2+" is not power of 2");
            }
            
            
        }
    
}