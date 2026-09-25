package com.tns.queue;
import java.util.Queue;
import java.util.LinkedList;

public class QueueExample {

		    public static void main(String[] args) {

		        Queue<String> queue = new LinkedList<>();

		        // Adding elements
		        queue.add("Apple");
		        queue.add("Banana");
		        queue.add("Mango");

		        System.out.println("Queue: " + queue);

		        // Removing the first element
		        System.out.println("Removed: " + queue.poll());

		        // Viewing the first element
		        System.out.println("Front element: " + queue.peek());

		        System.out.println("Queue after removal: " + queue);
		    }
		

	}


