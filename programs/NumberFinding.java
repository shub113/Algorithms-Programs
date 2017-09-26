package com.bridgeit.AlgorithmPrograms.programs;

import java.util.*;

class NumberFinding{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int input=Integer.parseInt(args[0]);
        System.out.println("Think any number between '0' and "+(input-1)+"\n");
        int[] arr=new int[input];
        for(int i=0;i<input;i++){
            arr[i]=i;
        }
        binarySearch(arr,0,(input-1));
        
    }
    static private void binarySearch(int[] arr,int l,int u){
        Scanner sc= new Scanner(System.in);
        if(u<l){
            System.out.println("number NOT found");
            System.exit(0);
        }
        int mid=(l+u)/2;
        System.out.println("Is your number "+arr[mid]);
        System.out.println("press 1 for yes\n OR 2 if your number is smaller and 3 if its greater..");
        int response= sc.nextInt();
        if(response==1)
            System.exit(0);
        else if(response==2)
            binarySearch(arr,l,(mid-1));
        else
            binarySearch(arr,(mid+1),u);
        
    }
}