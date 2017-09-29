package com.bridgeit.DataStructurePrograms.Utility;

import java.util.ArrayList;
import java.util.Scanner;

public class Accounts {
	ArrayList<Integer> array= new ArrayList<Integer>();
	public void createAccounts(int num){
		for(int i=0;i<num;i++){
			array.add(7500);
		}
	}
	public void updateAccounts(int num){
		Scanner scan= new Scanner(System.in);
		String[] name= new String[num];
		System.out.println("Please enter your name");
		for(int i=0;i<num;i++){
			System.out.print((i+1)+"-");
			name[i]=scan.next();
		}System.out.println();
		
		System.out.println("Your Initial amount is 7,500/-");
		
		for(int i=0;i<num;i++){
			System.out.println("Please enter your choice-"+name[i]);
			System.out.println("1) Deposit");
			System.out.println("2) Withdraw");
			System.out.println("3) Skip");
			int choice=scan.nextInt();
			if(choice==1){
				System.out.println("Enter amount to deposit");
				int deposit= scan.nextInt();
				int a=array.get(i);
				array.set(i,(a+deposit));
				System.out.println("Updated amount"+array.get(i)+"\n");
			}else if(choice==2){
				System.out.println("Enter amount to Withdraw");
				int withdraw=scan.nextInt();
				int b=array.get(i);
				if((b-withdraw)<0)
					System.out.println("Insufficient Balance\n");
				else{
					array.set(i, (b-withdraw));
					System.out.println("Updated amount"+array.get(i)+"\n");
				}
			}else
				continue;
		}
		
	}
}
