package com.bridgeit.AlgorithmPrograms.programs;

class MonthlyPayment{
    public static void main(String[]args){
        int p=Integer.parseInt(args[0]);
        int y= Integer.parseInt(args[1]);
        int r= Integer.parseInt(args[2]);
        
        double n= 12*y;
        double r1= (double)r/(12.0*100);
        
        double r2= 1+(r1/(12.0*100));
        double x= Math.pow(r2,-n);
        
        double payment= (p*r1)/(1-x);
        System.out.println("Payment = "+payment);
    }
}