package com.bridgeit.DataStructurePrograms.Utility;

import java.util.Scanner;

import com.bridgeit.DataStructurePrograms.programs.Week;

public class UtilityCalender {
public static Scanner scan = new Scanner(System.in);
	
	public static String[] weeks= {"SUN","MON","TUE","WED","THU","FRI","SAT"};
	
	public static int[] daysInMonth= {31,28,31,30,31,30,31,31,30,31,30,31,30,31};
	
	public static int count = 0;
	/**
	 * @param month
	 * @param year
	 * @return
	 */
	public static String[][] calender(int month,int year) {
		daysInMonth[1]=28;
		String[][] calender=new String[7][7];
		for(int i=0;i<7;i++) 
			calender[0][i]=weeks[i];
		if(!leapYear(year)||month!=2) {
			calenderDates(calender,month,year);
		}
		else {
			daysInMonth[1]=29;
			calenderDates(calender,month,year);
		}
		return calender;
	}
	/**
	 * @param calender
	 * @param month
	 * @param year
	 */
	public static void calenderDates(String[][] calender,int month,int year) {
		for(int i=1,k=1;i<7&&k<=daysInMonth[month-1];i++) {
			if(i==1) {
				for(int j=dayOfWeek(1,month,year);j<7;j++,k++)
					calender[1][j]=Integer.toString(k);
			}
			else {
				for(int j=0;j<7&&k<=daysInMonth[month-1];j++,k++)
					calender[i][j]=Integer.toString(k);
			}
		}
	}
	
	/**
	 * @param year
	 * @return
	 */
	public static boolean leapYear(int year) {
		if (UtilityCalender.numberOfDigit(year) == 4) {
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
				return true;
				
			else
				return false;
				
		}
		else
			return false;
	}
	/**
	 * @param number
	 * @return
	 */
	public static int numberOfDigit(int number) {
		while (number != 0) {
			number = number / 10;
			count++;
		}
		return count;
	}
	
	/**
	 * @param day
	 * @param month
	 * @param year
	 * @return
	 */
	public static int dayOfWeek(int day,int month,int year) {
		int y0= year-(14-month)/12;
		int x=y0+y0/4-y0/100+y0/400;
		int m0=month+12*((14-month)/12)-2;
		int dayOfWeek=(day+x+31*m0/12)%7;
		return dayOfWeek;
	}
	/**
	 * @param calendar
	 * @param month
	 * @param year
	 * @return
	 */
	public static QueueLinkedList<Week> queueCalender(String[][] calendar,int month,int year) {
		QueueLinkedList<Week> weekDay=new QueueLinkedList<Week>();
		for(int i=1;i<calendar.length;i++) {
			for(int j=0;j<calendar[0].length;j++) {
				if(calendar[i][j]!=null)
					weekDay.enqueue(new Week(calendar[0][j],calendar[i][j]));
				else
					weekDay.enqueue(new Week(calendar[0][j],""));
			}
		}
		weekDay.enqueue(new Week(month,year));
		return weekDay;
	}
	
	/**
	 * @param queue
	 */
	public static <T> void stackCalender(QueueLinkedList<T> queue) {
		StackLinkedList<QueueLinkedList<T>> stackToStoreQueue1=new StackLinkedList<QueueLinkedList<T>>();
		StackLinkedList<QueueLinkedList<T>>  stackToStoreQueue2=new StackLinkedList<QueueLinkedList<T>> ();
		stackToStoreQueue1.push(queue);
		stackToStoreQueue2.push(queue);
	}
}
