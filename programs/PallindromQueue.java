package com.bridgeit.DataStructurePrograms.programs;

import java.util.*;

import com.bridgeit.DataStructurePrograms.Utility.PallinCheckLogic;
public class PallindromQueue {
	public static void main(String[]args){
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter String");
		char[] c=scan.next().toCharArray();
		PallinCheckLogic pc= new PallinCheckLogic();
		pc.input(c);
	}
	
}
