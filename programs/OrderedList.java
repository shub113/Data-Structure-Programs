package com.bridgeit.DataStructurePrograms.programs;
import java.util.*;
import java.io.*;

/**
 * @author shub
 * text4 file is used
 */
public class OrderedList {

	public static void main(String[] args)throws IOException{
		//reading file
		BufferedReader brd= new BufferedReader(new FileReader("/home/bridgeit/text4.txt"));
		String[] s1= new String[5];
		String el;
		while((el=brd.readLine())!= null)
			s1= el.split(" ");
		brd.close();
		
		// taking user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter integer to compare");
		Integer input= new Integer(sc.nextInt());
		
		//converting string array returned by 'readLine' method to int[]
		int[] k= new int[s1.length];
		int index=0;
		System.out.print("LIST - ");
		for(String i:s1){
			k[index]=Integer.parseInt(i);
			System.out.print(k[index++]+" ");
		}System.out.println();
		
		//adding all element of array 'k' to arraylist 'al'
		LinkedList<Integer> al= new LinkedList<Integer>();
		for(int i:k)
			al.add(i);
		
		//sorting 'al'
		Collections.sort(al);
		System.out.print("After sorting - ");
		Iterator itr= al.iterator();
		while(itr.hasNext())
			System.out.print(itr.next()+" ");
		System.out.println();

		//adjusting user input
		if(al.contains(input)){
			al.remove(input);
			Collections.sort(al);
			System.out.print("After removing "+input+"---");
			Iterator itr2= al.iterator();
			while(itr2.hasNext())
				System.out.print(itr2.next()+" ");
		}else{
			al.add(input);
			Collections.sort(al);
			System.out.print("After addind & sorting "+input+"---");
			Iterator itr3= al.iterator();
			while(itr3.hasNext())
				System.out.print(itr3.next()+" ");
		}
		
		//saving output to a file
		FileWriter fwr= new FileWriter("/home/bridgeit/text4.txt",false);
		String[] arr= new String[500];
		int n=0;
		for(int i:al){
			arr[n]= String.valueOf(i);
			fwr.write(arr[n++]+" ");
		}
		fwr.flush();
		fwr.close();
	}
	

}
