package com.bridgeit.AlgorithmPrograms.programs;

import java.util.*;

class TempConversion{
    public void conversion(double t, double a){
        if(a==1){
            System.out.println("F = "+(((t*9)/5)+32));
        }
        else{
            System.out.println("C = "+(((t-32)*5)/9));
        }
    }
    
    public static void main(String[]arg){
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your choice\n 1) C to F\n 2) F to C");
        double a=scan.nextInt();
        System.out.println("Enter temperature..");
        double t=scan.nextInt();
        TempConversion tc= new TempConversion();
        tc.conversion(t,a);
        
    }
}