package com.bridgeit.AlgorithmPrograms.programs;

import java.util.*;

class SquareRoot{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number...");
        double c= sc.nextDouble();
        double t=c;
        double epsilon= 1e-15;
        while(Math.abs(t-(c/t))>(epsilon*t)){
            t=((c/t)+t)/2;
        }
        System.out.println("Square Root = "+t);
    }
}