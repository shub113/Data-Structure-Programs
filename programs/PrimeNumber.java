package com.bridgeit.DataStructurePrograms.programs;

import java.util.*;

public class PrimeNumber {
	public static void main(String[]args){
		PrimeNumber pn= new PrimeNumber();
		pn.printPrime();
		pn.printAnagram();
		//pn.printNonAnagram();
	}
	
	
	
	public void printPrime(){
		System.out.println("Prime  Numbersss");
		LinkedList<Integer> ll=prime();
		for(int i=ll.size()-1;i>=0;i--){
			System.out.print(ll.get(i)+" ");
		}System.out.println();
		System.out.println("Total number of prime numbers : "+ll.size());
		
	}
	public void printAnagram(){
		System.out.println("Anagramsss");
		LinkedList<Integer> ll=prime();
		LinkedList<Integer> ll2=anagramCheck(ll);
		System.out.println(ll2);
		System.out.println("Total number of anagrams : "+ll2.size());
	}/*
	public void printNonAnagram(){
		System.out.println("Non Anagramsss");
		int[][] num=prime();
		int[][] num2=anagramCheck(num);
		int[][] num3=nonAnagram(num,num2);
		for(int i=0;i<10;i++){
			for(int j=0;j<17;j++){
				if(num3[i][j]==0)
					System.out.print("*\t");
				else
					System.out.print(num3[i][j]+"\t");
			}System.out.println();
		}
	}*/
	private LinkedList<Integer> prime(){
		int l=0;
		int k=0;
		int m=0;
		LinkedList<Integer> ll= new LinkedList<Integer>();
		for(int i=2;i<1000;i++){
			int flag=0;
			for(int j=2;j<=(i/2);j++){
				if(i%j==0){
					flag=1;
					break;
				}
			}if(flag==0){
				k=i/100;
				if(k!=m){
					m=k;
					l=0;
				}
				ll.addFirst(i);
				
			}
		}
		return ll;
	}
	private LinkedList<Integer> anagramCheck(LinkedList<Integer> ll){
		LinkedList<Integer> ll2= new LinkedList<Integer>();
		for(int i:ll){
			char[] c1=Integer.toString(i).toCharArray();
			Arrays.sort(c1);
			for(int j:ll){
				if(i==j)
					continue;
				else{
					char[] c2=toString().valueOf(j).toCharArray();
					Arrays.sort(c2);
					if(Arrays.equals(c2, c1)){
						ll2.addLast(i);
						break;
					}
				}
			}
		}
		return ll2;
	}
	/*
	public int[][] nonAnagram(int[][] num, int[][] num2){
		int[][] num3= new int[10][17];
		for(int i=0;i<10;i++){
			int a=0;
			for(int j=0;j<25;j++){
				int flag=0;
				for(int k=0;k<8;k++){
					if(num[i][j]==num2[i][k]){
						flag=1;
						break;
					}
				}if(flag==0)
					num3[i][a++]=num[i][j];
			}
		}
		return num3;
	}*/
}
