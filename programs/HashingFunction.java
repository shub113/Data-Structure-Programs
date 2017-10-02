package com.bridgeit.DataStructurePrograms.programs;

import java.io.IOException;
import java.util.Scanner;

import com.bridgeit.DataStructurePrograms.Utility.FileReadWrite;
import com.bridgeit.DataStructurePrograms.Utility.HashFunction;
import com.bridgeit.DataStructurePrograms.Utility.HashFunction2;


/**
 * @author bridgeit
 *		file used is text5
 *		
 */
public class HashingFunction {
	public static void main(String[]args) throws IOException{
		HashFunction2 hash= new HashFunction2();
		FileReadWrite file= new FileReadWrite();
		Scanner scan= new Scanner(System.in);
		
		String read[]=file.ReadString("text5");
		int numbers[]= new int[read.length];
		try{
			for(int i=0;i<read.length;i++){
				numbers[i]= Integer.parseInt(read[i]);
			}
		}catch(NumberFormatException e){
			System.out.println(e);
		}
		System.out.println("Enter number to search");
		try{
			int num= scan.nextInt();
			hash.search(numbers, num);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
