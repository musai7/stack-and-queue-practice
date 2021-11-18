package com.bridgeit.stack;

import java.util.Scanner;

public class UserInterface {

	public int inputData() {

		System.out.println("enter element : ");
		Scanner scanner = new Scanner(System.in);
		int value = scanner.nextInt();
		return value;
	}

	public int showUserMenu() {

		System.out.println(
				"enter 0 for exit program \n enter 1 : for push \n enter 2 for pop ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		return num;
	}
}
