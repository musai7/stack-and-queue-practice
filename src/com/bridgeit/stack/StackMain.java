package com.bridgeit.stack;

public class StackMain {

	public static void main(String[] args) {
		StackPractice stackPractice = new StackPractice(5);
		UserInterface userInterface = new UserInterface();
		while (true) {
			int num = userInterface.showUserMenu();
			switch (num) {
				case 1:
					stackPractice.push(userInterface.inputData());
					break;
				case 2:
					while(!stackPractice.isEmpty()) {
						System.out.println("peak element : " + stackPractice.peak());
						System.out.println(" pop element : " + stackPractice.pop());
					}
					break;
			}
		}
	}
}
