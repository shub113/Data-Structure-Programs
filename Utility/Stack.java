package com.bridgeit.DataStructurePrograms.Utility;

import java.util.LinkedList;

public class Stack<T> {
	public LinkedList<T> link;
	public int top;
    public Stack(){
		link= new LinkedList<T>();
	}
	public void push(T element){
		top++;
		link.addFirst(element);
	}
	public void pop(T element){
		top--;
		link.removeFirst();
	}
	public boolean isEmpty(Stack s){
		return(top==-1);
	}
}
