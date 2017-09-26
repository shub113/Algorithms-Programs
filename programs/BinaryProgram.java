package com.bridgeit.AlgorithmPrograms.programs;

import java.util.*;

class BinaryProgram{
        private static int nibbles(int num){
            String s1=Integer.toBinaryString(num);
            char[] c1= s1.toCharArray();
            
           //printing binary conversion
            System.out.print("Binary of "+num+" = ");
            for(char c: c1){
                System.out.print(c);
            }
            System.out.println();
            
            //swapping characters
            char[] c2=new char[c1.length];
            for(int i=0;i<=c1.length/2;i++){
                c2[i]=c1[i];
            }
            int index=0;
            for(int i=(c1.length/2)+1;i<c1.length;i++){
                c1[index++]=c1[i];
            }
            for(int i=0;i<=c1.length/2;i++){
                c1[index++]=c2[i];
            }
            
            //printing swapped characters
            System.out.print("Nibbles = ");
            for(int i=0;i<=c1.length-1;i++){
                System.out.print(c1[i]);
            }
            System.out.println();
            String s2= new String(c1);
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
            System.out.println("Nibble decimal = "+ num2);
            
            System.out.println("2 power is "+check(num2));
            
        }
    
}