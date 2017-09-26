package com.bridgeit.AlgorithmPrograms.programs;

import java.util.Scanner;
class PrimeNum{
    public static void main(String[]arg){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number..");
        int a=sc.nextInt();
        int flag=0;
        
        for(int i=2;i<=a;i++){
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    flag=1;
                    break;
                }
            }
            if(flag==1){
                flag=0;
                continue;
            }
            else
                System.out.println(i);
        }
    }
}