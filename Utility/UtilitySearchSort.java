package com.bridgeit.DataStructurePrograms.Utility;

public class UtilitySearchSort {
	//binary int search
	public boolean binarySearchInteger(int[] num,int x){
		 int l=0;
	        int u=num.length;
	        while(u>=l){
	            int mid=(u+l)/2;
	            if(num[mid]==x){
	                return true;
	                }
	            else if(num[mid]>x)
	                u=mid-1;
	            else
	                l=mid+1;
	        }
	        return false;
	}
	//binary string search
	public boolean binarySearchString(String[] s2,String s){
		 int l=0;
	        int u=s2.length;
	        while(u>=l){
	            int mid=(u+l)/2;
	            if(s2[mid].equals(s)){
	                return true;
	                }
	            else if(s2[mid].compareTo(s)>0)
	                u=mid-1;
	            else
	                l=mid+1;
	        }
	        return false;
	}
	//bubble sort int
	public int[] bubbleSort(int[] num){
        for(int i=1; i<num.length; i++){
            int flag=0;
            for(int j=0; j<num.length-i; j++){
                if(num[j]>num[j+1]){
                    flag=1;
                    num[j]= num[j]+num[j+1];
                    num[j+1]= num[j]-num[j+1];
                    num[j]= num[j]-num[j+1];
                }
            }
            if(flag==0)
                break;
        }
        return num;
    }
	//bubble sort string
	public String[] bubbleSort(String[] s1){
        for(int i=1;i<s1.length-1;i++){
            int flag=0;
            for(int j=0;j<s1.length-i;j++){
                if((s1[j].compareTo(s1[j+1]))>0){
                    flag=1;
                    String z=s1[j];
                    s1[j]=s1[j+1];
                    s1[j+1]=z;
                }
            }
            if(flag==0)
                break;
        }
        return s1;
    }
	//insertion sort int
	public static int[] insertionSort(int[] arr){
        int j=0;
        for(int i=1;i<arr.length;i++){
            int temp= arr[i];
            for(j=i-1;j>=0 && (arr[j]>temp);j--){
                arr[j+1]=arr[j];
            }
            arr[j+1]=temp;
        }
        return arr;
    }
	//insertion sort string
	public static String[] insertionSort(String[] arr){
        int j=0;
        for(int i=1;i<arr.length;i++){
            String temp= arr[i];
            for(j=i-1;j>=0 && (arr[j].compareTo(temp)>0);j--){
                arr[j+1]=arr[j];
            }
            arr[j+1]=temp;
        }
        return arr;
    }
	
}
