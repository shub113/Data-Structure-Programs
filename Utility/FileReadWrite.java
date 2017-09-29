package com.bridgeit.DataStructurePrograms.Utility;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWrite {
	BufferedReader brd;
	BufferedWriter bwr;
	
	public String[] ReadString(String filename) throws IOException{
		brd =new BufferedReader(new FileReader("/home/bridgeit/"+filename+".txt"));
		String s="";
		String s2="";
		while((s=brd.readLine())!=null){
			s2=s2+s;
		}
		brd.close();
		String [] s3=s2.split(" ");
		return s3;
	}
	public void WriteString(String filename,String string) throws Exception{
		bwr= new BufferedWriter(new FileWriter("/home/bridgeit/"+filename+".txt"));
		bwr.write(string);
		bwr.flush();
		bwr.close();
		
	}
	

}
