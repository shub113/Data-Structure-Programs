package com.bridgeit.stack1;

import java.util.*;
import java.util.Stack;

public class ParenthesisLogic {
	private static char[] c;
	
	public void inputPass(char[] c){
		this.c=Arrays.copyOf(c, c.length);
		ParenthesisLogic sp= new ParenthesisLogic();
		sp.stack();
	}
	private void stack(){
		Stack st= new Stack();
		for(char i:c){
			if(i=='(')
				st.push(i);
			else if(i==')'){
				if(st.isEmpty()){
					System.out.print("Not Balanced");
					return;
				}
				else
					st.pop();
			}
		}
		if(st.isEmpty())
			System.out.println("Expression balanced");
		else
			System.out.println("Not Balanced");
	}
}
