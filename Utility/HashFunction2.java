package com.bridgeit.DataStructurePrograms.Utility;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class HashFunction2 {
	public static void search(int[] numbers, int num){
		UtilitySearchSort utility= new UtilitySearchSort();
		Map<Integer,LinkedList<Integer>> map= new HashMap<Integer,LinkedList<Integer>>();
		for(int i=0;i<11;i++){
			map.put(i,new LinkedList<Integer>());
		}
		for(int number:numbers){
			map.get(number%11).add(number);
		}
		for(int i=0;i<11;i++){
			System.out.println(map.get(i));
		}
		try{
			LinkedList<Integer> list= map.get(num%11);
			System.out.println(list);
			if(list.size()==0){
				System.out.println("Number not found");
				map.put(num%11, new LinkedList<Integer>());
				map.get(num%11).add(num);
			}else{
				LinkedList<Integer> list1= map.get(num%11);
				System.out.println(list1);
				Integer[] array=list1.toArray(new Integer[list1.size()]);
				Arrays.sort(array);
				for(int i:array){
					System.out.print(i+"\t");
				}
				if(utility.binarySearch(array, num)){
					System.out.println("Found");
					//list1.remove(num);
				}else{
					System.out.println("Not found");
					//list1.add(num);
				}
				
			}
		}catch(Exception e){e.printStackTrace();}
	}
}
