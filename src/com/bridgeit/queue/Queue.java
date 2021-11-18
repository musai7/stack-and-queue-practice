package com.bridgeit.queue;

public class Queue {
	
	private int [] array;
	private int front;
	private int rear;
	private int capacity;
	private int count;
	
	public Queue(int size) {
		this.array =new int[size];
		this.capacity = size;
		this.front = 0;
		this.rear = -1;
	}
	
	public void enQueue(int data) {
		if(isFull()) {
			System.out.println("Queue is overflow");
			return;
		}
		System.out.println("inserting data into queue : " + data);
		rear = (rear +1) %capacity;
		System.out.println("rear : " + rear);
		array[rear] = data;
		count++;
	}

	public boolean isFull() {

		return size() == this.capacity;
	}

	public int size() {
		return count;
	}
}
