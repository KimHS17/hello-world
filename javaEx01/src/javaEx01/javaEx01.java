package javaEx01;

import java.util.Scanner;

public class javaEx01 {

	public static void main(String[] args) {
		System.out.println("Hello, Java!");
		System.out.print("Enter yout name: ");
		

		Scanner sc = new Scanner(System.in);
		/*
		String name = sc.nextLine(); // nextInt(), nextDouble()
		
		System.out.println("Welcome, " + name + "!");
		*/

		int age =24;
		long population = 89000000000000L;

		float weight = 70.5f;
		double height = 169.4;

		char ch = '3';

		boolean isStudent = true;

		System.out.println("Age: " + age);

		double pi = 3.14;
		int truncatedPi = (int) pi;
		
		System.out.println("pi: "+ pi+", truncatedPi: " + truncatedPi);

		System.out.print("Enter number: ");
		int num = sc.nextInt();
		
		if (num % 2==0) {
			System.out.println(num + " is an even number.");
		} else {
			System.out.println(num + " is an odd number.");
		}
	}

}