package com.bridgeit.DataStructurePrograms.Utility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class HashFunction {
	public static void search(int[] numbers,int num) {
		ArrayList<LinkedList<Integer>> slot=new ArrayList<LinkedList<Integer>>();
		for(int i=0;i<11;i++) {
			slot.add(new LinkedList<Integer>());
		}
		for(int i:numbers)
			slot.get(i%11).add(i);
		if(slot.get(num%11).size()>=1) {
			Collections.sort(slot.get(num%11));	
			if(Collections.binarySearch(slot.get(num%11), num)==-1) {
				System.out.println("Number Not Found");
				slot.get(num%11).add(num);
				Collections.sort(slot.get(num%11));
			}
			else {
				System.out.println("Number Found");
				slot.get(num%11).remove(Integer.valueOf(num));
			}	
		}
		else {
			System.out.println("Number Not Found");
			slot.get(num%11).add(num);
			Collections.sort(slot.get(num%11));
		}
	}
}
