package com.bridgeit.stack;

import java.util.Stack;

public class StackPractice {
	private static final int MAX = 10;
	
	private int [] array;
	private int top;
	
	public StackPractice() {
		array = new int[MAX];
		top = -1;
	}
	
	public StackPractice(int length) {
		this.array = new int [length];
		top = -1;
	}
	
	public boolean push(int element) {
		
		if(isFull()) {
			System.out.println("Stack over flow");
			return false;
		}
		array[++top] = element;		
		System.out.println("pushed data int stack " + element);
		return true;
		
	}

	private boolean isFull() {
		
		return top >= array.length-1;
	}
}
