package com.bridgeit.DataStructurePrograms.programs;

import java.util.Scanner;

import com.bridgeit.DataStructurePrograms.Utility.UtilityCalender;

public class CalenderExtend {

	protected String[][] calender;
	
	protected int month;
	
	protected int year;
	
	/**
	 * @param month
	 * @param year
	 */
	public CalenderExtend(int month,int year) {
		calender=new String[7][7];
		this.month=month;
		this.year=year;
		this.fillCalender();
	}
	
	/**
	 * 
	 */
	public void displayCalender() {
		for(int i=0;i<7;i++) {    
		for(int j=0;j<7;j++) {
			if(calender[i][j]==null)
				System.out.format("    ");
			else
				System.out.format("%3s ",calender[i][j]);
		}	
		System.out.println();
	}
	}
	
	public String[][] getCalender(){
		return calender;
	}
	
	public void fillCalender() {
		calender=UtilityCalender.calender(month, year);
	}

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enyter month");
		int month=scan.nextInt();
		System.out.println("Enter year");
		int year=scan.nextInt();
		CalenderExtend calender=new CalenderExtend(month,year);
		calender.displayCalender();
	}
}
