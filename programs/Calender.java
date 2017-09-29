package com.bridgeit.DataStructurePrograms.programs;

import java.util.*;

import com.bridgeit.DataStructurePrograms.Utility.CalenderLogic;
public class Calender {
	public static void main(String[]args){
		Calender main= new Calender();
		int year=main.input();
		String month= main.input2();
		
		CalenderLogic pc= new CalenderLogic();
		pc.calenderPrint(year, month);
	}
	private int input(){
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter year");
		int year= scan.nextInt();
		return year;
	}
	private String input2(){
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter 1st 3 letter of month");
		String month= scan.next();
		return month;
	}
}
