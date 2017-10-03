package com.bridgeit.DataStructurePrograms.programs;

import java.util.Scanner;

import com.bridgeit.DataStructurePrograms.Utility.Factorial;

public class NumberOfTrees {

	public static void main(String[] args) {
		 Scanner scan=new Scanner(System.in);
		System.out.print("Enter the no. of inputs:");
		int casee=scan.nextInt();
		int[] node=new int[casee];
		for(int i=0;i<casee;i++) {
			//System.out.print("Input "+(i+1)+": ");
			node[i]=scan.nextInt();
		}
		for(int i=0;i<node.length;i++) {
			long tree=NumberOfTrees.binaryTree(node[i]);
			System.out.println(node[i]+" : "+tree);
		}
	}
	public static long binaryTree(int node) {
		long sum = 0;
		int summ=0;
		if(node==0||node==1)
			return 1;
		else {
			
			while(summ<node) {
				summ++;
				sum=sum+binaryTree(summ-1)*binaryTree(node-summ);
			}
			return sum;
		}
	}
}
