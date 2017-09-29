package com.bridgeit.DataStructurePrograms.programs;

import java.util.Scanner;

import com.bridgeit.DataStructurePrograms.Utility.Factorial;

public class NumberOfTrees {
	public static void main(String[]args){
		Scanner scan= new Scanner(System.in);
		Factorial factorial= new Factorial();
		
		System.out.println("Enter number of inputs");
		int input= scan.nextInt();
		for(int i=0;i<input;i++){
			System.out.println("Enter number of Nodes");
			long node= scan.nextInt();
			long result= (factorial.fact(2*node))/((factorial.fact(node+1))*(factorial.fact(node)));
			System.out.println(result+" nodes are possible\n");		}
	}
}
