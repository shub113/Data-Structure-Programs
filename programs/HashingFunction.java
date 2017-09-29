package com.bridgeit.DataStructurePrograms.programs;

import java.io.IOException;
import java.util.Scanner;

import com.bridgeit.DataStructurePrograms.Utility.FileReadWrite;
import com.bridgeit.DataStructurePrograms.Utility.HashFunction;


/**
 * @author bridgeit
 *		file used is text5
 *		savig output to text8
 */
public class HashingFunction {
	public static void main(String[]args) throws IOException{
		HashFunction hash= new HashFunction();
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
		int num= scan.nextInt();
		hash.search(numbers, num);
	}
}
