package com.bridgeit.DataStructurePrograms.programs;

import java.util.Scanner;

import com.bridgeit.DataStructurePrograms.Utility.Accounts;

public class Banking {
	public static void main(String[]args){
		Banking bank= new Banking();
		int num= bank.input();
		Accounts acc= new Accounts();
		acc.createAccounts(num);
		acc.updateAccounts(num);
		
	}
	public int input(){
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter number of people");
		int a=scan.nextInt();
		return a;
	}
}
