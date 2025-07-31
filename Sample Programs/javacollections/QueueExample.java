package javacollections;

import java.util.*; 
public class QueueExample { 
	public static void main(String[] args) { 
		Queue<Integer> queue = new LinkedList<>(); 
		queue.add(1); 
		queue.add(2); 
		queue.add(3); 
		System.out.println("Head: " + queue.peek()); 
		System.out.println("Removed: " + queue.poll()); 
		System.out.println("New Head: " + queue.peek()); 
	} 
} 
