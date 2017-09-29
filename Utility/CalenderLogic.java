package com.bridgeit.DataStructurePrograms.Utility;

public class CalenderLogic {
	public boolean leapYearCheck(int year){
		if((year%400==0)||((year%100!=0)&&(year%4==0)))
			return true;
		else
			return false;
	}
	public int startingDay(int date, int monthnum, int year){
		int y = year - (14 - monthnum) / 12;
        int x = y + y/4 - y/100 + y/400;
        int m = monthnum + 12 * ((14 - monthnum) / 12) - 2;
        int d = (date + x + (31*m)/12) % 7;
        return d;
	}
	public void calenderPrint(int year, String month){
		String[] days={"","Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
		int[][] calender=fillCalender(year,month);
		System.out.println("year : "+year+"   month : "+month);
		for (int i = 1; i <= 7; i++) {
			System.out.print(days[i]+"\t");
		}System.out.println();
		for(int i=0;i<6;i++){
			for(int j=0;j<7;j++){
				if(calender[i][j]!=0)
					System.out.print(calender[i][j]+"\t");
				else
					System.out.print("\t");
			}System.out.println();
		}
	}
	public int[][] fillCalender(int year, String month ){
		String[] months={"","Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
		int[] maxdays={0,31,28,31,30,31,30,31,31,30,31,30,31};
		
		//getting month number
		int monthnum=0;
		for(int i=1;i<13;i++){
			if(month.equalsIgnoreCase(months[i])){
				monthnum=i;
				break;
			}
		}

		//checking for leap year
		if((monthnum==2)&&(leapYearCheck(year)))
			maxdays[2]=29;
	
		int startdate= startingDay(1,monthnum,year);
		
		//filling calender
		int[][] calender=new int[6][7];
		int x=1;
		for(int i=0;i<6; i++){
			for(int j=startdate;j<7;j++){
				if(x<=maxdays[monthnum]){
					calender[i][j]=x;
					x++;
				}
			}
			startdate=0;
		}
		return calender;
	}
}
