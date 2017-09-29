package com.bridgeit.DataStructurePrograms.programs;

import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;


import com.bridgeit.DataStructurePrograms.Utility.FileReadWrite;
import com.bridgeit.DataStructurePrograms.Utility.UtilitySearchSort;

/**
 * @author shub
 * 
 *provide file name as text2
 *
 *text is saved in text3
 */
public class UnOrderedList {
	public static void main(String[]args) throws Exception{
		UtilitySearchSort utility= new UtilitySearchSort();
		FileReadWrite frw= new FileReadWrite();
		Scanner scan= new Scanner(System.in);
		LinkedList<String> list= new LinkedList<String>();
		int flag1=1;
		while(flag1==1){
			flag1=0;
			System.out.println("Enter Filename");
			String filename= scan.next();
			try{
				String[] s=frw.ReadString(filename);
				for(String i:s){
					list.add(i);
				}
			}catch(Exception e){
				System.out.println("File not Found");
				flag1=1;
			}
		}
		
		System.out.println("Enter word to search");
		String word=scan.next();
		int flag=0;
		try{
			for(String i:list){
				if(i.equals(word)){
					flag=1;
					System.out.println("Found");
					list.remove(i);
				}
			}
		}catch(Exception e){System.out.println("removing \""+word+"\" from file");}
		if(flag==0){
			System.out.println("not found\nadding \""+word+"\"");
			list.add(word);
		}
		String s1="";
		for(String i:list){
			s1+=i+" ";
		}
		//writing to file
		frw.WriteString("text3",s1 );
	}
}
