package com.bridgeit.DataStructurePrograms.programs;



import java.util.*;

public class PrimeNum {
	public static void main(String[]args){
		PrimeNum pn= new PrimeNum();
		pn.printPrime();
		pn.printAnagram();
		pn.printNonAnagram();
	}
	
	
	
	public void printPrime(){
		System.out.println("Prime  Numbersss");
		int num[][]=prime();
		for(int i=0;i<10;i++){
			for(int j=0;j<25;j++){
				if(num[i][j]==0)
					System.out.print("*\t");
				else
					System.out.print(num[i][j]+"\t");
			}System.out.println();
		}
	}
	public void printAnagram(){
		System.out.println("Anagramsss");
		int[][] num=prime();
		int[][] num2=anagramCheck(num);
		for(int i=0;i<10;i++){
			for(int j=0;j<8;j++){
				if(num2[i][j]!=0)
					System.out.print(num2[i][j]+"\t");
				else
					System.out.print("*"+"\t");
			}System.out.println();
		}
	}
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
	}
	private int[][] prime(){
		int l=0;
		int k=0;
		int m=0;
		int num[][]= new int[10][25];
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
				num[k][l++]=i;
				
			}
		}
		return num;
	}
	private int[][] anagramCheck(int[][] num){
		int num2[][]= new int[10][8];
		for(int i=0; i<10;i++){
			int a=0;
			for(int j=0;j<25;j++){
				if(num[i][j]==0)
					break;
				int flag1=0;
				char[] c1=Integer.toString(num[i][j]).toCharArray();
				char[] c2=Arrays.copyOf(c1, c1.length);
				Arrays.sort(c2);
				for(int k=j+1;k<25;k++){
					char[] c3=String.valueOf(num[i][k]).toCharArray();
					char[] c4=Arrays.copyOf(c3, c3.length);
					Arrays.sort(c4);
					if(Arrays.equals(c2, c4)){
						flag1=1;
						int s=Integer.parseInt(new String(c3));
						num2[i][a++]=s;
					}
				}if(flag1==1){
					int s=Integer.parseInt(new String(c1));
					num2[i][a++]=s;
				}
			}
		}
		return num2;
	}
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
	}
}
