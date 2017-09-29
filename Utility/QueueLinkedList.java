package com.bridgeit.DataStructurePrograms.Utility;

import java.util.LinkedList;

/**
 * @author bridgeit
 *
 * @param <T>Generic Type
 */
public class QueueLinkedList<T> {
		
		public LinkedList<T> queue;
		
		public int top;
		
		public QueueLinkedList() {
			queue=new LinkedList<T>();
			top=-1;
		}
		
		public boolean isEmpty() {
			return queue.isEmpty();
		}
		
		public void enqueue(T element) {
				top++;
				queue.add(top, element);
		}
		
		public void dequeue() {
			if(queue.isEmpty())
				System.out.println("Queue Empty");
			else
				queue.removeFirst();
		}
		
		public int size() {
			return queue.size();
		}
		
		public void print() {
			System.out.println(queue);
		}
		
		public T get(int index){
			return queue.get(index);
		}
		public int getTopIndex() {
			return top;
		}

		public T topElement() {
			int topIndex=getTopIndex();
			return queue.get(topIndex);
		}
}
