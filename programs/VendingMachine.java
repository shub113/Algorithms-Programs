package com.bridgeit.AlgorithmPrograms.programs;

import java.util.Scanner;

public class VendingMachine {
	static int thousand,fivehundred,hundred,fifty,ten,five,two,one;
	public static void main(String[]args){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter total bill");
		int bill= sc.nextInt();
		System.out.print("Enter sum paind");
		int sum= sc.nextInt();
		int change= sum-bill;
		System.out.println("change= "+change);
		moneyChange(change);
	}
	private static void moneyChange(int change){
		if(change>=1000){
			change=change-1000;
			thousand++;
			moneyChange(change);
		}
		else if(change>=500){
			change=change-500;
			fivehundred++;
			moneyChange(change);
		}else if(change>=100){
			change-=100;
			hundred++;
			moneyChange(change);
		}else if(change>=50){
			change-=50;
			fifty++;
			moneyChange(change);
		}else if(change>=10){
			change-=10;
			ten++;
			moneyChange(change);
		}else if(change>=5){
			change-=5;
			five++;
			moneyChange(change);
		}else if(change>=2){
			change-=2;
			two++;
			moneyChange(change);
		}else if(change>=1){
			change-=1;
			one++;
			moneyChange(change);
		}else{
			System.out.println("1000 notes = "+thousand);
			System.out.println("500 notes = "+fivehundred);
			System.out.println("100 notes = "+hundred);
			System.out.println("50 notes = "+fifty);
			System.out.println("10 notes = "+ten);
			System.out.println("5 notes = "+five);
			System.out.println("2 notes = "+two);
			System.out.println("1 notes = "+one);
			System.out.println("Minimum notes required = "+(thousand+fivehundred+hundred+fifty+ten+five+two+one));
		}
		
	}

}