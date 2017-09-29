package com.bridgeit.stack1;

import java.util.Scanner;

public class StackParenthesis {
	public static void main(String[] args){
		StackParenthesis obj= new StackParenthesis();
		char[] c=obj.userInput();
		ParenthesisLogic logic= new ParenthesisLogic();
		logic.inputPass(c);
	}
	private char[] userInput(){
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter Expression");
		char[] c=scan.next().toCharArray();
		return c;
	}
}
