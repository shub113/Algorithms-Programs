package com.bridgeit.AlgorithmPrograms.programs;

import java.util.*;

class MergeSort{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of array..");
        int size= sc.nextInt();
        int[] arr= new int[size];
        System.out.println("Enter "+size+" integers..");
        for(int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Choose options");
        System.out.println("1) Asscending\n2)Descending");
        int option=sc.nextInt();
        
        MergeSort ms= new MergeSort();
        ms.split(arr,0,size-1,option);
        for(int i:arr){
            System.out.print(i+"\t");
        }
    }
    public void split(int[] arr,int l,int u,int option){
        if(l<u){
            int m=(l+u)/2;
            
            split(arr,l,m,option);
            split(arr,m+1,u,option);
            if(option==1)
                mergeAscend(arr,l,m,u);
            else
                mergeDescend(arr,l,m,u);
        }
    }
    private static void mergeAscend(int[] arr,int l,int m,int u){
        int size1= m-l+1;
        int size2= u-m;
        
        int[] left= new int[size1];
        int[] right= new int[size2];
        
        for(int i=0; i<size1; i++)
            left[i]=arr[l+i];
        for(int i=0; i<size2;i++)
            right[i]= arr[m+1+i];
        
        int x=0;
        int y=0;
        int k=l;
        
        while(x<size1 && y<size2){
            if(left[x]<right[y]){
                arr[k]=left[x];
                x++;
            }else{
                arr[k]=right[y];
                y++;
            }
            k++;
        }
        
        for(int i=x; i<size1; i++)
            arr[k++]=left[i];
        for(int i=y; i<size2; i++)
            arr[k++]=right[i];
    }
    private static void mergeDescend(int[] arr,int l,int m,int u){
        int size1= m-l+1;
        int size2= u-m;
        int[] left= new int[size1];
        int[] right= new int[size2];
        
        for(int i=0; i<size1; i++)
            left[i]= arr[l+i];
        for(int i=0; i<size2; i++)
            right[i]= arr[m+1+i];
        
        int a=0;
        int b=0;
        int c=l;
        while(a<size1 && b<size2){
            if(left[a]<right[b]){
                arr[c]=right[b];
                b++;
            }else{
                arr[c]=left[a];
                a++;
            }c++;
        }
        for(int i=a; i<size1; i++)
            arr[c++]= left[i];
        for(int i=b; i<size2; i++)
            arr[c++]= right[i];
    }
}