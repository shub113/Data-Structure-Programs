package com.bridgeit.DataStructurePrograms.Utility;

public class Factorial {
	public long fact(long num){
		if(num==1)
			return 1;
		else
			return num*fact(num-1);
	}
}
