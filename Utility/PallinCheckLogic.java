package com.bridgeit.DataStructurePrograms.Utility;

import java.util.*;

public class PallinCheckLogic {
	public void input(char[] c){
		PallinCheckLogic pc=new PallinCheckLogic();
		pc.palinCheck(c);
	}
	private void palinCheck(char[] c){
		ArrayDeque<Character> ad=new ArrayDeque<Character>();
		for(char i:c)
			ad.add(i);
		String s="";
		for(char i:ad)
			s+=i;
		char[] c1=s.toCharArray();
		String s1="";
		for(int i=c1.length-1;i>=0;i--)
			s1+=c1[i];
		String s2=new String(c);
		System.out.println("String : "+s2);
		System.out.println("Reverse : "+s1);
		if(s2.equals(s1))
			System.out.println("Pallindrom");
		else
			System.out.println("Not Pallindrom");
	}
}
