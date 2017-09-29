package com.bridgeit.DataStructurePrograms.programs;

import java.util.Scanner;

import com.bridgeit.DataStructurePrograms.Utility.QueueLinkedList;
import com.bridgeit.DataStructurePrograms.Utility.UtilityCalender;

public class Week {
protected String day;
	
	protected String date;
	
	protected String[][] calender;
	
	protected CalenderExtend week;
	
	public Week() {
		this.day=null;
		this.date=null;
		this.calender=null;
	}
	
	public Week(int month,int year) {
		week=new CalenderExtend(month,year);	
		calender=week.getCalender();
	}
	
	public String[][] getCalendar() {
		return calender;
	}
	
	public void displayCalender() {
		week.displayCalender();
	}
	
	public Week(String day,String date) {
		this.day=day;
		this.date=date;
	}
	
	public static Scanner scan=new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Enter the month in number:");
		int month=scan.nextInt();
		System.out.println("Enter the year:");
		int year=scan.nextInt();
		Week week=new Week(month,year);
		QueueLinkedList<Week> queue=UtilityCalender.queueCalender(week.getCalendar(),month,year);
		Week printCalender=queue.topElement();	
		printCalender.displayCalender();
		//stack
		UtilityCalender.stackCalender(queue);	
	}

}

