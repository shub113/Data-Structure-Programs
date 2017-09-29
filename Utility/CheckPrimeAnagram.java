package com.bridgeit.DataStructurePrograms.Utility;

import java.util.Arrays;
import java.util.LinkedList;

public class CheckPrimeAnagram {
	public LinkedList<Integer> prime(){
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
	public LinkedList<Integer> anagramCheck(LinkedList<Integer> ll){
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
}
